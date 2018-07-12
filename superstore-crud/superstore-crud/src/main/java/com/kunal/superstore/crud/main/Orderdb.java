package com.kunal.superstore.crud.main;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orderdb {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rowid;
	private int orderid;
	private Date orderdate;
	private String orderpriority;
	private int orderquantity;
	private float sales;
	private float discount;
	private String shipmode;
	private int profit;
	private float unitprice;
	private float shippingcost;
	private String customername;
	private String province;
	private String region;
	private String customersegment;
	private String creditcardno;
	private String productcategory;
	private String productsubcategory;
	private String productname;
	private String productcontainer;
	private float productbasemargin;
	private Date shipdate;
	
	public Orderdb() {}
	
	public int getRowid() {
		return rowid;
	}
	
	public void setRowid(int rowid) {
		this.rowid = rowid;
	}
	
	public int getOrderid() {
		return orderid;
	}
	
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	public Date getOrderdate() {
		return orderdate;
	}
	
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	
	public String getOrderpriority() {
		return orderpriority;
	}
	
	public void setOrderpriority(String orderpriority) {
		this.orderpriority = orderpriority;
	}
	
	public int getOrderquantity() {
		return orderquantity;
	}
	
	public void setOrderquantity(int orderquantity) {
		this.orderquantity = orderquantity;
	}
	
	public float getSales() {
		return sales;
	}
	
	public void setSales(float sales) {
		this.sales = sales;
	}
	
	public float getDiscount() {
		return discount;
	}
	
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public String getShipmode() {
		return shipmode;
	}
	
	public void setShipmode(String shipmode) {
		this.shipmode = shipmode;
	}
	
	public int getProfit() {
		return profit;
	}
	
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	public float getUnitprice() {
		return unitprice;
	}
	
	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}
	
	public float getShippingcost() {
		return shippingcost;
	}
	
	public void setShippingcost(float shippingcost) {
		this.shippingcost = shippingcost;
	}
	
	public String getCustomername() {
		return customername;
	}
	
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	public String getProvince() {
		return province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getCustomersegment() {
		return customersegment;
	}
	
	public void setCustomersegment(String customersegment) {
		this.customersegment = customersegment;
	}
	
	public String getCreditcardno() {
		return creditcardno;
	}
	
	public void setCreditcardno(String creditcardno) {
		this.creditcardno = creditcardno;
	}
	
	public String getProductcategory() {
		return productcategory;
	}
	
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	
	public String getProductsubcategory() {
		return productsubcategory;
	}
	
	public void setProductsubcategory(String productsubcategory) {
		this.productsubcategory = productsubcategory;
	}
	
	public String getProductname() {
		return productname;
	}
	
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public String getProductcontainer() {
		return productcontainer;
	}
	
	public void setProductcontainer(String productcontainer) {
		this.productcontainer = productcontainer;
	}
	
	public float getProductbasemargin() {
		return productbasemargin;
	}
	
	public void setProductbasemargin(float productbasemargin) {
		this.productbasemargin = productbasemargin;
	}
	
	public Date getShipdate() {
		return shipdate;
	}
	
	public void setShipdate(Date shipdate) {
		this.shipdate = shipdate;
	}
	
	@Override
	public String toString() {
	   return "Order{" +
	                "row id=" + rowid +
	                ", order id='" + orderid + '\'' +
	                ", order date='" + orderdate + '\'' +
	                ", order priority='" + orderpriority + '\'' +
	                ", order quantity='" + orderquantity + '\'' +
	                ", sales='" + sales + '\'' +
	                ", discount='" + discount + '\'' +
	                ", ship mode='" + shipmode + '\'' +
	                ", profit='" + profit + '\'' +
	                ", unit price='" + unitprice + '\'' +
	                ", shipping cost='" + shippingcost + '\'' +
	                ", customer name='" + customername + '\'' +
	                ", province='" + province + '\'' +
	                ", region='" + region + '\'' +
	                ", customer segment='" + customersegment + '\'' +
	                ", credit card number='" + creditcardno + '\'' +
	                ", product category='" + productcategory + '\'' +
	                ", product sub category='" + productsubcategory + '\'' +
	                ", product name='" + productname + '\'' +
	                ", product container='" + productcontainer + '\'' +
	                ", product base margin='" + productbasemargin + '\'' +
	                ", ship date='" + shipdate + '\'' +
	                '}';
	}
}
