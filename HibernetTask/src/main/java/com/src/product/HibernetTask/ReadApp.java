package com.src.product.HibernetTask;

import org.hibernate.Session;

import com.entity.product.Product;
import com.product.utils.HibernetUtils;

public class ReadApp {

	public void readData(int id) {
		// TODO Auto-generated method stub
		Session session =HibernetUtils.getSession();
		session.beginTransaction();
		Product product=session.get(Product.class, id);
		System.out.println(product);

	}

}
