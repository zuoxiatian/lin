package com.atguigu.mybatis.bean;

public class Order {
	
	private Integer id;
	private String orderNumber;
	
	private Customer customer;

	public Order() {
		super();
	}

	public Order(Integer id, String orderNumber, Customer customer) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.customer = customer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNumber=" + orderNumber
				+ ", customer=" + customer + "]";
	}
	
	

}
