package com.sliit.pmap.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sliit.pmap.entities.Readings;

public interface ReadingsRepository extends JpaRepository<Readings, Long> {
	@Query("SELECT r FROM readings r WHERE r.readAt >= ?1 AND r.readAt <= ?2 ORDER BY r.readAt")
	List<Readings> findAllReadings(Date from, Date to);
	
	@Query("SELECT r FROM readings r WHERE r.readAt >= ?1 ORDER BY r.readAt")
	List<Readings> findAllReadingsFrom(Date from);
	
	@Query("SELECT r FROM readings r WHERE r.readAt <= ?1 ORDER BY r.readAt")
	List<Readings> findAllReadingsTo(Date to);
}
