package com.kunal.superstore.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import com.kunal.superstore.batch.model.RegionalManagers;

public class ManagerProcessor implements ItemProcessor<RegionalManagers, RegionalManagers> {

	@Override
	public RegionalManagers process(RegionalManagers item) throws Exception {
		// TODO Auto-generated method stub
		
System.out.println("Processing: " + item);
		
		RegionalManagers managers = new RegionalManagers();
		
		managers.setRegion(item.getRegion());
		managers.setManager(item.getManager());
		
		return managers;
	}

}
