package com.kunal.superstore.batch.model;

public class OrderStat {
	
	private int OrdId;
	private String OrdStat;
	
	public int getOrdId() {
		return OrdId;
	}
	
	public void setOrdId(int OrdId) {
		this.OrdId = OrdId;
	}
	
	public String getOrdStat() {
		return OrdStat;
	}
	
	public void setOrdStat(String OrdStat) {
		this.OrdStat = OrdStat;
	}
	
	public String toString()
	{
		return "OrderStat [OrderId=" + OrdId + ", Orderstat=" + OrdStat + "]";
	}

}
