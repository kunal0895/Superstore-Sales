package com.kunal.superstore.batch.processor;

import java.util.HashMap;

import org.springframework.batch.item.ItemProcessor;

import com.kunal.superstore.batch.model.Order;

public class OrderItemProcessor implements ItemProcessor<Order, Order> {
	
	public Order process(Order order) throws Exception {
	
		System.out.println("Processing: " + order);
		
		String margin = order.getProductBaseMargin();
		String creditcard = order.getCreditCardNo();
		
		StringBuilder sb = new StringBuilder();
		HashMap<Character, String> hm = new HashMap<>();
		hm.put('0', "a");
		hm.put('1', "*");
		hm.put('2',"&");
		hm.put('3', "^");
		hm.put('4', "%");
		hm.put('5', "$");
		hm.put('6',"#");
		hm.put('7', "@");
		hm.put('8',"!");
		hm.put('9', "z");
		
		Order transformedOrder = new Order();
		transformedOrder.setRowId(order.getRowId());
		transformedOrder.setOrderId(order.getOrderId());
		transformedOrder.setOrderDate(order.getOrderDate());
		transformedOrder.setOrderPriority(order.getOrderPriority());
		transformedOrder.setOrderQuantity(order.getOrderQuantity());
		transformedOrder.setSales(order.getSales());
		transformedOrder.setDiscount(order.getDiscount());
		transformedOrder.setShipMode(order.getShipMode());
		transformedOrder.setProfit(order.getProfit());
		transformedOrder.setUnitPrice(order.getUnitPrice());
		transformedOrder.setShippingCost(order.getShippingCost());
		transformedOrder.setCustomerName(order.getCustomerName());
		transformedOrder.setProvince(order.getProvince());
		transformedOrder.setRegion(order.getRegion());
		transformedOrder.setCustomerSegment(order.getCustomerSegment());
		
		for(int i = 0; i < creditcard.length();i++)
		{
			sb.append(hm.get(creditcard.charAt(i)));
		}

		transformedOrder.setCreditCardNo(sb.toString());
		transformedOrder.setProductCategory(order.getProductCategory());
		transformedOrder.setProductSubCategory(order.getProductSubCategory());
		transformedOrder.setProductName(order.getProductName());
		transformedOrder.setProductContainer(order.getProductContainer());
		
		if(margin.isEmpty())
		{
			transformedOrder.setProductBaseMargin("0");
		}
		else
		{
			transformedOrder.setProductBaseMargin(margin);
		}
		
		transformedOrder.setShipDate(order.getShipDate());
		
		sb.setLength(0);
		
		return transformedOrder;
	}
}
