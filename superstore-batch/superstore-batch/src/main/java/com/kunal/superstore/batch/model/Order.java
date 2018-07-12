package com.kunal.superstore.batch.model;

//import java.util.Date;

public class Order {
	
	private int RowId;
	private int OrderId;
	private String OrderDate;
	private String OrderPriority;
	private int OrderQuantity;
	private float Sales;
	private float Discount;
	private String ShipMode;
	private float Profit;
	private float UnitPrice;
	private float ShippingCost;
	private String CustomerName;
	private String Province;
	private String Region;
	private String CustomerSegment;
	private String CreditCardNo;
	private String ProductCategory;
	private String ProductSubCategory;
	private String ProductName;
	private String ProductContainer;
	private String ProductBaseMargin;
	private String ShipDate;
	
	public int getRowId() {
		return RowId;
	}

	public void setRowId(int RowId) {
		this.RowId = RowId;
	}
	
	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int OrderId) {
		this.OrderId = OrderId;
	}
	
	public String getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(String OrderDate) {
		this.OrderDate = OrderDate;
	}
	
	public String getOrderPriority() {
		return OrderPriority;
	}

	public void setOrderPriority(String OrderPriority) {
		this.OrderPriority = OrderPriority;
	}
	
	public int getOrderQuantity()
	{
		return OrderQuantity;
	}
	
	public void setOrderQuantity(int OrderQuantity) {
		this.OrderQuantity = OrderQuantity;
	}
	
	public float getSales() {
		return Sales;
	}
	
	public void setSales(float Sales) {
		this.Sales = Sales;
	}
	
	public float getDiscount() {
		return Discount;
	}
	
	public void setDiscount(float Discount) {
		this.Discount = Discount;
	}
	
	public String getShipMode() {
		return ShipMode;
	}
	
	public void setShipMode(String ShipMode) {
		this.ShipMode = ShipMode;
	}
	
	public float getProfit() {
		return Profit;
	}
	
	public void setProfit(float Profit) {
		this.Profit = Profit;
	}
	
	public float getUnitPrice() {
		return UnitPrice;
	}
	
	public void setUnitPrice(float UnitPrice) {
		this.UnitPrice = UnitPrice;
	}
	
	public float getShippingCost() {
		return ShippingCost;
	}
	
	public void setShippingCost(float ShippingCost) {
		this.ShippingCost = ShippingCost;
	}
	
	public String getCustomerName() {
		return CustomerName;
	}
	
	public void setCustomerName(String CustomerName) {
		this.CustomerName = CustomerName;
	}
	
	public String getProvince() {
		return Province;
	}
	
	public void setProvince(String Province) {
		this.Province = Province;
	}
	
	public String getRegion() {
		return Region;
	}
	
	public void setRegion(String Region) {
		this.Region = Region;
	}
	
	public String getCustomerSegment() {
		return CustomerSegment;
	}
	
	public void setCustomerSegment(String CustomerSegment) {
		this.CustomerSegment = CustomerSegment;
	}
	
	public String getCreditCardNo() {
		return CreditCardNo;
	}
	
	public void setCreditCardNo(String CreditCardNo) {
		this.CreditCardNo = CreditCardNo;
	}
	
	public String getProductCategory() {
		return ProductCategory;
	}
	
	public void setProductCategory(String ProductCategory) {
		this.ProductCategory = ProductCategory;
	}
	
	public String getProductSubCategory() {
		return ProductSubCategory;
	}
	
	public void setProductSubCategory(String ProductSubCategory) {
		this.ProductSubCategory = ProductSubCategory;
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}
	
	public String getProductContainer() {
		return ProductContainer;
	}
	
	public void setProductContainer(String ProductContainer) {
		this.ProductContainer = ProductContainer;
	}
	
	public String getProductBaseMargin() {
		return ProductBaseMargin;
	}
	
	public void setProductBaseMargin(String ProductBaseMargin) {
		this.ProductBaseMargin = ProductBaseMargin;
	}
	
	public String getShipDate() {
		return ShipDate;
	}
	
	public void setShipDate(String ShipDate) {
		this.ShipDate = ShipDate;
	}
	
	//@Override
	public String toString() {
		return "Order [RowId=" + RowId + ", OrderId=" + OrderId +  ", OrderDate=" + OrderDate + ", OrderPriority=" + OrderPriority + ", OrderQuantity=" + OrderQuantity  + ", Sales=" + Sales  + ", Discount=" + Discount  + ", Ship Mode=" + ShipMode + ", Credit Card=" + CreditCardNo + ", ProductBaseMargin=" + ProductBaseMargin + "]";
	}
}