package com.niit.backend;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppContxt.class)
public class CategoryTest {
	
	@Autowired
	CategoryDAO categorydao;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void createCategory() {
		Category category = new Category();
		category.setCategoryname("New Arrivals");
		category.setCategorydesc("pick the best products");
		
		assertEquals(true, categorydao.createCategory(category));
	}

}
