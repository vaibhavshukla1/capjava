package com.cart.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cart.beans.Product;

@Repository // annotation for repository class
@Transactional // ability to declaratively control transaction boundaries
public class IProductRepoImpl implements IProductRepo {

	@PersistenceContext // expresses a dependency on container-managed EntityManager
	private EntityManager entityManager;

	// to save product details in database
	@Override
	public Product save(Product products) {
		entityManager.persist(products);
		return findProduct(products.getId());
	}

	// to find product from database
	// after finding product return product details to service class
	@Override
	public Product findProduct(String id) {
		Product products = new Product();
		products = entityManager.find(Product.class, id);
		return products;
	}

	// to delete product from database by entering product id
	// get product id from service class
	@Override
	public boolean deleteProduct(String id) {
		Product products = entityManager.find(Product.class, id);
		entityManager.remove(products);
		return true;
	}

	// to find all the product details from database
	// after fetching details of product send them to service class
	@Override
	public List<Product> findAll() {
		return entityManager.createQuery("select p from Product p", Product.class).getResultList();
	}

	// to update product details in database by entering product id
	// get product id from service class
	// show details of product after updation
	@Override
	public Product updateProduct(Product products, String id) {
		Product prod = entityManager.find(Product.class, id);
		prod.setName(products.getName());
		prod.setModel(products.getModel());
		prod.setPrice(products.getPrice());
		return prod;
	}

}
