package com.niit.backend;

import static org.junit.Assert.assertEquals;



import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.dao.UserDAO;
import com.niit.model.User;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppContxt.class)
public class UserTest {
	
	
	@Autowired
	UserDAO userdao;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	
	@Test
	public void addUser() {
		User user = new User();
		user.setUsername("Rishi");
		user.setPassword("0980");
		user.setPhone_number("55442226666");
		
		assertEquals(true, userdao.createUser(user));
	}
	@Test
	public void deleteUser()
	{
		User user = userdao.getUserById("9");
		assertEquals(true, userdao.deleteUser(user));
	}

	@Ignore
	@Test
	public void updateUser() {
		User user = userdao.getUserById("9");
		user.setPassword("76543");
		
		assertEquals(true, userdao.updateUser(user));
	}
	
}