package com.maxima.api.Maxima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxima.api.Maxima.model.Watch;
import com.maxima.api.Maxima.repository.WatchRepository;

@Service("watchService")
public class WatchServiceImpl implements WatchService {
	
	@Autowired
	WatchRepository watchRepository;

	@Override
	public Watch getWatchById(long id) {
		Watch watch=watchRepository.findOne(id);
		return watch;
	}

	@Override
	public List<Watch> getAllWatches() {
		watchRepository.findAll();
		return null;
	}

}
