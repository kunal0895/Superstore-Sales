package com.kunal.superstore.batch.model;

public class RegionalManagers {

	private String Region;
	private String Manager;
	
	public String getRegion() {
		return Region;
	}
	
	public void setRegion(String Region) {
		this.Region = Region;
	}
	
	public String getManager() {
		return Manager;
	}
	
	public void setManager(String Manager) {
		this.Manager = Manager;
	}
	
	@Override
	public String toString() {
		return "Manager [Region=" + Region + ", Manager=" + Manager	+ "]";
	}
}
