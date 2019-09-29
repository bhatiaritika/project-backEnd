package com.niit.backend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.dao.OrderDAO;
import com.niit.model.Order;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppContxt.class)
public class OrderTest {
	
	@Autowired
	OrderDAO orderdao;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {	
	}
	
	@Ignore
	@Test
	public void createOrder() {
		Order order = new Order();
		order.setOrderdesc("Your order contains 2 items");
		order.setOrderprice(2000);
		order.setOrderstat("Ready to Ship");
		
		assertEquals(true, orderdao.createOrder(order));
	}
		
	
	
	@Test
	public void updateOrder() {
		Order order = orderdao.getOrderById(12);
		order.setOrderprice(3000);
		order.setOrderstat("In Transit");	
			assertEquals(true, orderdao.updateOrder(order));	
	}
}

