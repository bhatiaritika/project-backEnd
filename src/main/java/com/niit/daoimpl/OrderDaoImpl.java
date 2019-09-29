package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.OrderDAO;
import com.niit.model.Order;

@Repository
@Transactional
public class OrderDaoImpl implements OrderDAO {
	
	@Autowired(required = true)
	SessionFactory sessionfactory;
	
	public List<Order> getOrderByList() {
		@SuppressWarnings("unchecked")
		List<Order> getOrderByList = sessionfactory.getCurrentSession().createQuery("from Order").list();
		return getOrderByList;
	}
	public boolean createOrder(Order order) {
		sessionfactory.getCurrentSession().save(order);
		return true;
	}
	public boolean updateOrder(Order order) {
		sessionfactory.getCurrentSession().update(order);
		return true;
	}
	public boolean deleteOrder(Order order) {
		sessionfactory.getCurrentSession().delete(order);
		return true;
	}
	public Order getOrderById(int orderId) {
		@SuppressWarnings("unused")
		Order order = (Order) sessionfactory.getCurrentSession().createQuery("from Order where orderId" + orderId).uniqueResult();
		return null;
	}
	
	public List<Order> getOrderByList1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean createOrder1(Order order) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean updateOrder1(Order order) {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean deleteOrder1(Order order) {
		// TODO Auto-generated method stub
		return true;
	}
	public Order getOrderById1(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
