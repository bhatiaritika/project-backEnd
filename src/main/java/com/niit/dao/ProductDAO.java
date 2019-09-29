package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {
	public List<Product> getProductList();
	public boolean createProduct(Product product);
	public Product getProductById(int productId);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	public List<Product> getProductByPrice(int price);
	public List<Product> getProductByName(String productname);

}
