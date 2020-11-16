package com.sliit.pmap.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sliit.pmap.entities.CurrentFault;
import com.sliit.pmap.entities.Readings;

public interface CurrentFaultRepository extends JpaRepository<CurrentFault, Long> {
	@Query("SELECT r FROM current_fault r WHERE r.faultAt >= ?1 AND r.faultAt <= ?2 ORDER BY r.faultAt DESC")
	List<CurrentFault> findAllFaults(Date from, Date to);
	
	@Query("SELECT r FROM current_fault r WHERE r.faultAt >= ?1 ORDER BY r.faultAt DESC")
	List<CurrentFault> findAllFaultsFrom(Date from);
	
	@Query("SELECT r FROM current_fault r WHERE r.faultAt <= ?1 ORDER BY r.faultAt DESC")
	List<CurrentFault> findAllFaultsTo(Date to);
}
