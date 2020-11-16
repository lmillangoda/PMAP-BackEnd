package com.sliit.pmap.services;

import com.sliit.pmap.entities.CurrentFault;
import com.sliit.pmap.entities.FrequencyFault;
import com.sliit.pmap.entities.Readings;
import com.sliit.pmap.entities.VoltageFault;
import com.sliit.pmap.repositories.CurrentFaultRepository;
import com.sliit.pmap.repositories.FrequencyFaultRepository;
import com.sliit.pmap.repositories.ReadingsRepository;
import com.sliit.pmap.repositories.VoltageFaultRepository;
import com.sliit.pmap.requests.SearchReadingsRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ReadingsService {
	
	@Autowired
	ReadingsRepository readRepo;
	
	@Autowired
	CurrentFaultRepository currFaultRepo;
	
	@Autowired
	VoltageFaultRepository volFaultRepo;
	
	@Autowired
	FrequencyFaultRepository freqFaultRepo;

	//add reading value
	public String saveReadingDetails(Readings reading)
			throws InterruptedException, ExecutionException {
		Readings read = reading;
		if (read.getReadAt() == null) {
			read.setReadAt(new java.util.Date());
		}
		this.readRepo.save(read);
		return "Saved Successfully";
	}
	
	// add faulty current value
	public String saveCurrentFault(CurrentFault current)
			throws InterruptedException, ExecutionException {
		CurrentFault read = current;
		if (read.getFaultAt() == null) {
			read.setFaultAt(new java.util.Date());
		}
		this.currFaultRepo.save(read);
		return "Saved Successfully";
	}
	
	// add faulty voltage value
	public String saveVolategeFault(VoltageFault voltage)
			throws InterruptedException, ExecutionException {
		VoltageFault read = voltage;
		if (read.getFaultAt() == null) {
			read.setFaultAt(new java.util.Date());
		}
		this.volFaultRepo.save(read);
		return "Saved Successfully";
	}
	
	// add faulty frequency value
	public String saveFrequencyFault(FrequencyFault frquency)
			throws InterruptedException, ExecutionException {
		FrequencyFault read = frquency;
		if (read.getFaultAt() == null) {
			read.setFaultAt(new java.util.Date());
		}
		this.freqFaultRepo.save(read);
		return "Saved Successfully";
	}
	
	// search for readings using time range
	public List<Readings> searchReadings(SearchReadingsRequest request) throws InterruptedException, ExecutionException {
		List<Readings> response = new ArrayList<Readings>();
		if (request.getReadDateFrom() != null && request.getReadDateTo() != null) {
			response = this.readRepo.findAllReadings(request.getReadDateFrom(), request.getReadDateTo());
		}
		if (request.getReadDateFrom() != null && request.getReadDateTo() == null) {
			response = this.readRepo.findAllReadingsFrom(request.getReadDateFrom());
		}
		if (request.getReadDateFrom() == null && request.getReadDateTo() != null) {
			response = this.readRepo.findAllReadingsTo(request.getReadDateTo());
		}
		return response;
	}
	
	// search for faults in voltage using time range
	public List<VoltageFault> searchVoltFault(SearchReadingsRequest request) throws InterruptedException, ExecutionException {
		List<VoltageFault> response = new ArrayList<VoltageFault>();
		if (request.getReadDateFrom() != null && request.getReadDateTo() != null) {
			response = this.volFaultRepo.findAllFaults(request.getReadDateFrom(), request.getReadDateTo());
		}
		if (request.getReadDateFrom() != null && request.getReadDateTo() == null) {
			response = this.volFaultRepo.findAllFaultsFrom(request.getReadDateFrom());
		}
		if (request.getReadDateFrom() == null && request.getReadDateTo() != null) {
			response = this.volFaultRepo.findAllFaultsTo(request.getReadDateTo());
		}
		return response;
	}
	
	// search for faults in current using time range
	public List<CurrentFault> searchCurrentFault(SearchReadingsRequest request) throws InterruptedException, ExecutionException {
		List<CurrentFault> response = new ArrayList<CurrentFault>();
		if (request.getReadDateFrom() != null && request.getReadDateTo() != null) {
			response = this.currFaultRepo.findAllFaults(request.getReadDateFrom(), request.getReadDateTo());
		}
		if (request.getReadDateFrom() != null && request.getReadDateTo() == null) {
			response = this.currFaultRepo.findAllFaultsFrom(request.getReadDateFrom());
		}
		if (request.getReadDateFrom() == null && request.getReadDateTo() != null) {
			response = this.currFaultRepo.findAllFaultsTo(request.getReadDateTo());
		}
		return response;
	}
	
	// search for faults in frequency using time range
	public List<FrequencyFault> searchFrequencyFault(SearchReadingsRequest request) throws InterruptedException, ExecutionException {
		List<FrequencyFault> response = new ArrayList<FrequencyFault>();
		if (request.getReadDateFrom() != null && request.getReadDateTo() != null) {
			response = this.freqFaultRepo.findAllFaults(request.getReadDateFrom(), request.getReadDateTo());
		}
		if (request.getReadDateFrom() != null && request.getReadDateTo() == null) {
			response = this.freqFaultRepo.findAllFaultsFrom(request.getReadDateFrom());
		}
		if (request.getReadDateFrom() == null && request.getReadDateTo() != null) {
			response = this.freqFaultRepo.findAllFaultsTo(request.getReadDateTo());
		}
		return response;
	}


}