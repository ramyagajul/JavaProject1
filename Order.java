package org.java.learn;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Comparable<Order>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7176526774870022499L;
	private int orderId;
	private Date orderDate;
	private List<OrderItem> orderedItems;
	private Customer customer;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<OrderItem> getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(List<OrderItem> orderedItems) {
		this.orderedItems = orderedItems;
	}
	public Date getOrderDate() {
		return new Date();
	}
	
	public double getTotalPrice() {
		double totalPrice = 0.0;
		for (OrderItem order : getOrderedItems()) {
			totalPrice = totalPrice+order.getPrice();
		}
		return totalPrice;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order = [Order ID = " +orderId+ " ,Order Date = " + getOrderDate() + " , Customer Details = "+customer+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + orderId;
		result = prime * result + ((orderedItems == null) ? 0 : orderedItems.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderId != other.orderId)
			return false;
		if (orderedItems == null) {
			if (other.orderedItems != null)
				return false;
		} else if (!orderedItems.equals(other.orderedItems))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Order o) {
		 	if (this.customer.compareTo(o.getCustomer()) == 0) {
		 		return this.orderDate.compareTo(o.getOrderDate());
		}
		else return this.customer.compareTo(o.getCustomer()) ;
	}
	
	
	
}
