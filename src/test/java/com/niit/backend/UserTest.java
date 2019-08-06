package com.niit.backend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.backend.AppContxt;
import com.niit.dao.UserDAO;
import com.niit.model.User;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContxt.class)

public class UserTest {
	@Autowired
	UserDAO userdao;
	
	@Before
public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
		userdao = null;
	}
	@Test
	public void addUser() {
		User user = new User();
		user.setUsername("Shawn");
		user.setPassword("6789");
		user.setPhone_number("8888777999");
		assertEquals(true,userdao.createUser(user));
	}
}
