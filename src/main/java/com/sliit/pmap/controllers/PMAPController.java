package com.sliit.pmap.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sliit.pmap.entities.CurrentFault;
import com.sliit.pmap.entities.FrequencyFault;
import com.sliit.pmap.entities.Readings;
import com.sliit.pmap.entities.VoltageFault;
import com.sliit.pmap.requests.SearchReadingsRequest;
import com.sliit.pmap.services.ReadingsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController

@RequestMapping("/pmap")
@Api(value="Power System Protection and Management System")
public class PMAPController {

    @Autowired
    ReadingsService readingService;

    @ApiOperation(value="Add reading value")
    @PostMapping("/add-reading")
    public String addReading(@RequestBody Readings reading) throws InterruptedException, ExecutionException {
        return readingService.saveReadingDetails(reading);
    }
    
    @ApiOperation(value="Add voltage fault value")
    @PostMapping("/add-voltage-fault")
    public String addVoltageFault(@RequestBody VoltageFault voltFault) throws InterruptedException, ExecutionException {
        return readingService.saveVolategeFault(voltFault);
    }
    
    @ApiOperation(value="Add current fault value")
    @PostMapping("/add-current-fault")
    public String addCurrentFault(@RequestBody CurrentFault currentFault) throws InterruptedException, ExecutionException {
        return readingService.saveCurrentFault(currentFault);
    }
    
    @ApiOperation(value="Add frequency fault value")
    @PostMapping("/add-frequency-fault")
    public String addFrequencyFault(@RequestBody FrequencyFault freqFault) throws InterruptedException, ExecutionException {
        return readingService.saveFrequencyFault(freqFault);
    }
    
    @ApiOperation(value="Get reading values")
    @PostMapping("/get-readings")
    public List<Readings> getReadings(@RequestBody SearchReadingsRequest request) throws InterruptedException, ExecutionException {
    	return readingService.searchReadings(request);
    }
    
    @ApiOperation(value="Get voltage fault values")
    @PostMapping("/get-voltage-faults")
    public List<VoltageFault> getVoltageFault(@RequestBody SearchReadingsRequest request) throws InterruptedException, ExecutionException {
    	return readingService.searchVoltFault(request);
    }
    
    @ApiOperation(value="Get current fault values")
    @PostMapping("/get-current-faults")
    public List<CurrentFault> getCurrentFault(@RequestBody SearchReadingsRequest request) throws InterruptedException, ExecutionException {
    	return readingService.searchCurrentFault(request);
    }
    
    @ApiOperation(value="Get frequency fault values")
    @PostMapping("/get-frequency-faults")
    public List<FrequencyFault> getFrequencyFault(@RequestBody SearchReadingsRequest request) throws InterruptedException, ExecutionException {
    	return readingService.searchFrequencyFault(request);
    }


}
