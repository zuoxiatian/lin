package com.atguigu.mybatis.bean;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	
	private Integer id;
	private String lastName;
	
	private Set<Order> orders = new HashSet<>();

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String lastName, Set<Order> orders) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.orders = orders;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastName=" + lastName + ", orders="
				+ orders + "]";
	}
	
	
}
