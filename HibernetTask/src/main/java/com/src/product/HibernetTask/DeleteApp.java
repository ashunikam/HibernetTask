package com.src.product.HibernetTask;

import org.hibernate.Session;

import com.entity.product.Product;
import com.product.utils.HibernetUtils;

public class DeleteApp {
	public void deleteData(int id){
		Session session=HibernetUtils.getSession();
		Product product=session.get(Product.class, id);
		session.beginTransaction();
		session.delete(product);
		session.getTransaction().commit();
		System.out.println(product);
	}
	

}
