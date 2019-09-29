package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Repository
@Transactional

public class ProductDaoImpl implements ProductDAO
{
	@Autowired(required = true)
	SessionFactory sessionfactory;
	@SuppressWarnings("unchecked")
	public List<Product> getProductList()
	{
		List<Product> getProductList = sessionfactory.getCurrentSession().createQuery("from product").list();
		return getProductList;
	}
	public boolean createProduct(Product product)
	{
		sessionfactory.getCurrentSession().save(product);
		return true;
	}
	public boolean updateProduct(Product product)
	{
		sessionfactory.getCurrentSession().update(product);
		return true;
	}
	public boolean deleteProduct(Product product)
	{
		sessionfactory.getCurrentSession().delete(product);
		return true;
	}
	@SuppressWarnings("unchecked")
	public List<Product> getProductByName(String productname) {
		return (List<Product>) sessionfactory.getCurrentSession().createQuery("from Product where productname like"+ "'%"+ productname +"%'").list();
	}
	public Product getProductById(int productId) {
		Product product=(Product) sessionfactory.getCurrentSession().createQuery("from Product where productid ="+productId).uniqueResult();
		return product;
	}
	@SuppressWarnings("unchecked")
	public List<Product> getProductByPrice(int price) {
		return (List<Product>) sessionfactory.getCurrentSession().createQuery("from Product where price ="+price).list();
	}
	
	public List<Product> getProductList1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean createProduct1(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Product getProductById1(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean updateProduct1(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean deleteProduct1(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public List<Product> getProductByPrice1(int price) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Product> getProductByName1(String productname) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

