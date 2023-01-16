package com.it.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.it.model.Product;

@Component
public class ProductDao {
	
	private HibernateTemplate ht;
	
	@Transactional // use when create and update
	public void createProduct(Product product) {
		this.ht.save(product);
	}

	//get all Producs
	public List<Product> getProducts() {
		
	List<Product> list=	this.ht.loadAll(Product.class);
		
		
		return list;
	}
	
//Delete Single Product
	
	public void deleteProduct(int pid) {
		
		Product p = this.ht.load(Product.class, pid);
		
		ht.delete(p);
		
	}
	
	// get single product
	
	public Product getproduct(int pid) {
		
	return 	ht.load(Product.class, pid);
	}
	
}
