package com.kunal.superstore.crud.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
    OrderRepository orderRespository;
	
	//Get all the orders
	 @GetMapping("/order")
	    public List<Orderdb> getAllOrders(){
	        return orderRespository.findAll();
	    }
	 
	 //Retrieve an order that matches a particular rowid (Rowid is the primary key)
	 @GetMapping("/order/{id}")
	    public Orderdb show(@PathVariable(value = "id") int rowid){
	        //int blogId = Integer.parseInt(id);
	        return orderRespository.findByrowid(rowid);
	        		//.orElseThrow(() -> new Exception("Note", "id", personId));
	    }
	 
	 //Retrieve order that matches the required ship mode
	 @GetMapping("/order/orderid/{oid}")
	    public List<Orderdb> search(@PathVariable(value = "oid") int orderid){
	        //int blogId = Integer.parseInt(id);
	        return orderRespository.findByorderid(orderid);
	        		//.orElseThrow(() -> new Exception("Note", "id", personId));
	    }
	 
	 //Create a new order and insert it
	 @PostMapping("/order")
	    public Orderdb createOrder(@Valid @RequestBody Orderdb order)
	    {
	    	return orderRespository.save(order);
	    }
	 
	 //Update an order
	 @PutMapping("/order/{id}")
	 public Orderdb updateorder(@PathVariable(value="id") int id,
			 @Valid @RequestBody Orderdb orderdetails) {
		 
		Orderdb order = orderRespository.findByrowid(id);
		
		order.setOrderid(orderdetails.getOrderid());
		order.setOrderdate(orderdetails.getOrderdate());
		order.setOrderpriority(orderdetails.getOrderpriority());
		order.setOrderquantity(orderdetails.getOrderquantity());
		order.setSales(orderdetails.getSales());
		order.setDiscount(orderdetails.getDiscount());
		order.setShipmode(orderdetails.getShipmode());
		order.setProfit(orderdetails.getProfit());
		order.setUnitprice(orderdetails.getUnitprice());
		order.setShippingcost(orderdetails.getShippingcost());
		order.setCustomername(orderdetails.getCustomername());
		order.setProvince(orderdetails.getProvince());
		order.setRegion(orderdetails.getRegion());
		order.setCustomersegment(orderdetails.getCustomersegment());
		order.setCreditcardno(orderdetails.getCreditcardno());
		order.setProductcategory(orderdetails.getProductcategory());
		order.setProductsubcategory(orderdetails.getProductsubcategory());
		order.setProductname(orderdetails.getProductname());
		order.setProductcontainer(orderdetails.getProductcontainer());
		order.setProductbasemargin(orderdetails.getProductbasemargin());
		order.setShipdate(orderdetails.getShipdate());
		
		
		Orderdb updatedOrder = orderRespository.save(order);
	    return updatedOrder;
	 }
	 
	 //Two ways, either by orderid, delete all orders of that id
	
	 @DeleteMapping("/order/deleteallorders/{id}")
	    public ResponseEntity<?> deleteallOrders(@PathVariable(value="id") int id) {
	    	List<Orderdb> orders = orderRespository.findByorderid(id);
	    	
	    	orderRespository.delete(orders);
	    	
	    	return ResponseEntity.ok().build();
	    }
	 
	 //If you want to keep 2 out of 3 orders with the same orderid, delete by rowid.
	 //First get the row ids of all those orders by using the get method on the orderid
	 //Then delete specific rowid
	 @DeleteMapping("order/deletesomeorders/{id}")
	 public ResponseEntity<?> deletesomeOrders(@PathVariable(value="id") int id) {
		 Orderdb order = orderRespository.findByrowid(id);
		 
		 orderRespository.delete(order);
		 
		 return ResponseEntity.ok().build();
	 }
	 
	 
	 //This gives you the aggregated sale numbers across the daily sales
	 //Each [Output block] has 5 rows
	 //First is the aggregated sale value
	 //Second is the year, third is the month, fourth is the week, 5th is the day.
	 //Weeks and weekdays start from 0.
	 //Granularity is from highest to lowest.
	 @GetMapping("/order/dailysales")
	    public List<Orderdb> getAggregatedDaily() {
	    	return orderRespository.getAggregatedDaily();
	    }
	 
	 //Aggregated sale numbers across weekly sales. The output format for each block is
	 //Sale value,
	 //Year,
	 //Month,
	 //Week
	 @GetMapping("/order/weeklysales")
	    public List<Orderdb> getAggregatedWeekly() {
	    	return orderRespository.getAggregatedWeekly();
	    }
	 
	 //Aggregated sale numbers across monthly sales. The output format for each block is
	 //Sale value,
	 //Year,
	 //Month
	 @GetMapping("/order/monthlysales")
	    public List<Orderdb> getAggregatedMonthly() {
	    	return orderRespository.getAggregatedMonthly();
	    }
	 
	 //Aggregated sale numbers across sales categories. The output format for each block is
	 //Sale value,
	 //Category
	 @GetMapping("/order/categorysales")
	    public List<Orderdb> getAggregatedCategories() {
	    	return orderRespository.getAggregatedCategories();
	    }
	 
	 //Aggregated sale numbers across sales sub-categories. The output format for each block is
	 //Sale value,
	 //Sub-category
	 @GetMapping("/order/subcategorysales")
	    public List<Orderdb> getAggregatedSubCategories() {
	    	return orderRespository.getAggregatedSubcategories();
	    }
	 
	 //Aggregated sale numbers across sales categories and sub-categories. The output format for each block is
	 //Sale value,
	 //Category,
	 //Sub-Category
	 @GetMapping("/order/categoryandsubcategorysales")
	    public List<Orderdb> getAggregatedCategoriesAndSubcategories() {
	    	return orderRespository.getAggregatedCategoriesAndSubcategories();
	    }
	 
	 //The profit or loss over a month.
	 //Output format is profit/loss,
	 //Year
	 //Month
	 //Grouped by month first so that across profit can be measured for each month across years.
	 @GetMapping("/order/monthlyprofitloss")
	    public List<Orderdb> getMonthlyProfitOrLoss() {
	    	return orderRespository.getMonthlyProfitOrLoss();
	    }

}
