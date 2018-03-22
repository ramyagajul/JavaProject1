package org.java.learn;
import static org.java.learn.datasource.OrderItemDataSource.ORDER_ITEMS_1;
import static org.java.learn.datasource.OrderItemDataSource.ORDER_ITEMS_2;
import static org.java.learn.datasource.OrderItemDataSource.ORDER_ITEMS_3;
import static org.java.learn.datasource.OrderItemDataSource.ORDER_ITEMS_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		// Creating customer objects
		Customer customer1= new Customer(7001, "Smith", "Will", "Baltimore", 876546789, "ws@gmail.com");
		Customer customer2= new Customer(7002, "George", "Mary", "St Louis", 787654234, "mg@gmail.com");
		Customer customer3= new Customer(7003, "Davidson", "Shane", "Chicago", 908765422, "sd@gmail.com");
		Customer customer4= new Customer(7004, "Wiiliams", "Bruce", "Houston", 234455667, "bw@gmail.com");
		
		// Creating Order1 object
		Order order1= new Order();
		order1.setOrderedItems(ORDER_ITEMS_1);
		order1.getOrderDate();
		order1.setOrderId(9001);
		order1.setCustomer(customer1);
		
		// Creating Order2 object
		Order order2=new Order();
		order2.setOrderedItems(ORDER_ITEMS_2);
		order2.getOrderDate();
		order2.setOrderId(9002);
		order2.setCustomer(customer2);
	
		// Creating Order3 object
		Order order3=new Order();
		order3.setOrderedItems(ORDER_ITEMS_3);
		order3.getOrderDate();
		order3.setOrderId(9003);
		order3.setCustomer(customer3);

		// Creating Order4 object
		Order order4=new Order();
		order4.setOrderedItems(ORDER_ITEMS_4);
		order4.getOrderDate();
		order4.setOrderId(9004);
		order4.setCustomer(customer4);

		// Creating Order5 object
		Order order5=new Order();
		order5.setOrderedItems(ORDER_ITEMS_1);
		order5.getOrderDate();
		order5.setOrderId(9001);
		order5.setCustomer(customer1);
		
		
		// Array List for the orders
		ArrayList<Order> ordersForTheDay = new ArrayList<>();
		ordersForTheDay.add(order1);
		ordersForTheDay.add(order2);
		ordersForTheDay.add(order3);
		ordersForTheDay.add(order4);
		
		// Printing array list before Sorting
		System.out.println("Before Sorting");
		for(Order o : ordersForTheDay) {
			System.out.println(o);
		}
		
		// Sorting the array list
		Collections.sort(ordersForTheDay);
		System.out.println("After Sorting");
		for(Order o : ordersForTheDay) {
			System.out.println(o);
		}
			
		// Hash set for removing duplicate items	
		HashSet<Order> hashSet = new HashSet<>();
		hashSet.add(order1);
		hashSet.add(order2);
		hashSet.add(order3);
		hashSet.add(order4);
		hashSet.add(order5);
		
		System.out.println("Hash Set");
		for(Order hashSetOrder : hashSet) {
			System.out.println(hashSetOrder + "Hashcode of each object" + hashSetOrder.hashCode() );
		}
		
		System.out.println("Java 8 Stream");
		ordersForTheDay.stream() 
		.filter(streamedItems->{return streamedItems.getOrderId()>9002 ;}) 
		.collect(Collectors.toList()) 
		.forEach(System.out::println); 
		
		// Modify order
		
		
		// String reversal - Task 2
		String str = "The quick brown fox jumps over a lazy dog" ;
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
	
	}

}
