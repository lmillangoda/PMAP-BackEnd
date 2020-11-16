package com.sliit.pmap.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sliit.pmap.entities.Readings;
import com.sliit.pmap.entities.VoltageFault;

public interface VoltageFaultRepository extends JpaRepository<VoltageFault, Long> {
	@Query("SELECT r FROM voltage_fault r WHERE r.faultAt >= ?1 AND r.faultAt <= ?2 ORDER BY r.faultAt DESC")
	List<VoltageFault> findAllFaults(Date from, Date to);
	
	@Query("SELECT r FROM voltage_fault r WHERE r.faultAt >= ?1 ORDER BY r.faultAt DESC")
	List<VoltageFault> findAllFaultsFrom(Date from);
	
	@Query("SELECT r FROM voltage_fault r WHERE r.faultAt <= ?1 ORDER BY r.faultAt DESC")
	List<VoltageFault> findAllFaultsTo(Date to);
}
