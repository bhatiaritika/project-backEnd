package com.niit.dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO {
	public List<Category> getCategoryList();
	public boolean createCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(Category category);
	public Category getCategoryById(int categoryId);
	public List<Category> getCategoryByName(String categoryname);

}
