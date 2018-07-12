package com.kunal.superstore.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.kunal.superstore.batch.model.OrderStat;

public class OrderStatusProcessor implements ItemProcessor<OrderStat, OrderStat> {
	
	public OrderStat process(OrderStat os) throws Exception {
	
	System.out.println("Processing: " + os);
	
	OrderStat transformedStat = new OrderStat();
	transformedStat.setOrdId(os.getOrdId());
	transformedStat.setOrdStat(os.getOrdStat());
	
	return transformedStat;
	}
}
