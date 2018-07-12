package com.kunal.superstore.crud.main;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


//import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orderdb, Integer> {

//	@Query(value = "SELECT o from Orderdb o WHERE o.shipmode = :shipmode", nativeQuery = true)
//    List<Orderdb> findByshipmode(@Param("shipmode") String text);
	//Orderdb findById(int id);
	
	List<Orderdb> findByorderid(int id);
	Orderdb findByrowid(int id);
	
	//Aggregated sale number across daily sales
	@Query(value = "SELECT sum(od.sales), year(orderdate), month(orderdate), week(orderdate), weekday(orderdate) from Orderdb od group by year(orderdate), month(orderdate), week(orderdate), weekday(orderdate)")
	List<Orderdb> getAggregatedDaily();
	
	//Aggregated sale number across weekly sales
	@Query(value = "SELECT sum(od.sales), year(orderdate), month(orderdate), week(orderdate) from Orderdb od group by year(orderdate), month(orderdate), week(orderdate)")
	List<Orderdb> getAggregatedWeekly();
	
	//Aggregated sale number across monthly sales
	@Query(value = "SELECT sum(od.sales), year(orderdate), month(orderdate) from Orderdb od group by year(orderdate), month(orderdate)")
	List<Orderdb> getAggregatedMonthly();
	
	//Aggregated sale number across product categories
	@Query(value = "SELECT productcategory, sum(od.sales) from Orderdb od group by productcategory")
	List<Orderdb> getAggregatedCategories();
	
	//Aggregated sale number across product sub-categories
	@Query(value = "SELECT productsubcategory, sum(od.sales) from Orderdb od group by productsubcategory")
	List<Orderdb> getAggregatedSubcategories();
	
	//Aggregated sale number across product categories and sub-categories together for better reference
	@Query(value = "SELECT productcategory, productsubcategory, sum(od.sales) from Orderdb od group by productcategory, productsubcategory")
	List<Orderdb> getAggregatedCategoriesAndSubcategories();
	
	//Total profit or loss within each month
	@Query(value = "SELECT sum(profit), year(orderdate), month(orderdate) from Orderdb od group by month(orderdate), year(orderdate)")
	List<Orderdb> getMonthlyProfitOrLoss();
}
