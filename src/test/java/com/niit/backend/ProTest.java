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

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppContxt.class)
public class ProTest {
	
	@Autowired
	ProductDAO productdao;
	
	@Before
	public void setUp() throws Exception {
}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Ignore
	@Test
	public void createProduct() {
		Product product = new Product();
		product.setProductname("Teddy");
		product.setPrice(100);
		product.setProductdescription("teddy is a soft toy");
		product.setQuantity(1);
		
		assertEquals(true,productdao.createProduct(product));
	}
	
	@Ignore
	@Test
	public void updateProduct() {
		Product product = productdao.getProductById(11);
		product.setPrice(1000);
		product.setProductdescription("It is a free size tshirt");
		product.setProductname("Solid Black");
		product.setQuantity(2);
		
		assertEquals(true, productdao.updateProduct(product));
	}

	@Test
	public void deleteProduct() {
		Product product = productdao.getProductById(11);
		assertEquals(true,productdao.deleteProduct(product));
	}
	
}