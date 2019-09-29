package com.niit.dao;

import java.util.List;

import com.niit.model.Order;

public interface OrderDAO {
	public List<Order> getOrderByList();
	public boolean createOrder(Order order);
	public boolean updateOrder(Order order);
	public boolean deleteOrder(Order order);
	public Order getOrderById(int orderId);

}
