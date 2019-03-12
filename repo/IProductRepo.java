package com.cart.repo;

import java.util.List;

import com.cart.beans.Product;

//creating interface 
public interface IProductRepo {
	public Product save(Product products);

	public Product findProduct(String id);

	public boolean deleteProduct(String id);

	public List<Product> findAll();

	public Product updateProduct(Product products, String id);

}
