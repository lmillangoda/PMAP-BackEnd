package com.sliit.pmap.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sliit.pmap.entities.FrequencyFault;
import com.sliit.pmap.entities.Readings;

public interface FrequencyFaultRepository extends JpaRepository<FrequencyFault, Long> {
	@Query("SELECT r FROM frequency_fault r WHERE r.faultAt >= ?1 AND r.faultAt <= ?2 ORDER BY r.faultAt DESC")
	List<FrequencyFault> findAllFaults(Date from, Date to);
	
	@Query("SELECT r FROM frequency_fault r WHERE r.faultAt >= ?1 ORDER BY r.faultAt DESC")
	List<FrequencyFault> findAllFaultsFrom(Date from);
	
	@Query("SELECT r FROM frequency_fault r WHERE r.faultAt <= ?1 ORDER BY r.faultAt DESC")
	List<FrequencyFault> findAllFaultsTo(Date to);
}
