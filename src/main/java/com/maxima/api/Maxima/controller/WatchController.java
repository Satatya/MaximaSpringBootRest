package com.maxima.api.Maxima.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maxima.api.Maxima.model.Response;
import com.maxima.api.Maxima.model.Watch;
import com.maxima.api.Maxima.repository.WatchRepository;
import com.maxima.api.Maxima.service.WatchService;
import com.maxima.api.Maxima.util.Constants;

@RestController
@RequestMapping("watch")
public class WatchController {
	
	private static final Logger logger = LoggerFactory.getLogger(WatchController.class);
	
	@Autowired
	private WatchService watchService;
	WatchRepository watchRepository;
	
	
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<Watch> getWatches() {
    	Watch watch = new Watch((long) 1234567890,"Maxima");
    	System.out.println(watch);
		return watchRepository.findAll();
	}

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Watch getWatch(@PathVariable("id") long id) {
		return watchService.getWatchById(id);
	}
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
	public Watch addWatch(@RequestBody @Valid Watch watch) {
		try {
			watchRepository.save(watch);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return watch;
		}
		return watch;
	}
    
    @RequestMapping(method = RequestMethod.GET)
    public <T> Response<T> watchDemo(){
    	return new Response<T>("Watch Controller", Constants.SUCCESS);
    }
    
}