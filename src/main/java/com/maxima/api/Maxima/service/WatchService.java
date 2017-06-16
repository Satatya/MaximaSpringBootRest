package com.maxima.api.Maxima.service;

import java.util.List;

import com.maxima.api.Maxima.model.Watch;

public interface WatchService {
	Watch getWatchById(long id);
	List<Watch> getAllWatches();
}
