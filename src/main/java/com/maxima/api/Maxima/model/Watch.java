package com.maxima.api.Maxima.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "watch")
public class Watch {

	@Id
	@GeneratedValue
	private Long watchId;
	private String watchModel;
	
	public Watch() {
		super();
	}
	
	public Watch(Long watchId, String watchModel) {
		super();
		this.watchId = watchId;
		this.watchModel = watchModel;
	}
	
	public Long getWatchId() {
		return watchId;
	}
	
	public void setWatchId(Long watchId) {
		this.watchId = watchId;
	}
	
	public String getWatchModel() {
		return watchModel;
	}
	
	public void setWatchModel(String watchModel) {
		this.watchModel = watchModel;
	}

	@Override
	public String toString() {
		return "Watch [watchId=" + watchId + ", watchModel=" + watchModel + "]";
	}
}
