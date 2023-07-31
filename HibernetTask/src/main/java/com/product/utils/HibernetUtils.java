package com.product.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.product.Product;

public class HibernetUtils {
	public static Session getSession() {
		Configuration configurtion=new Configuration();
		configurtion.configure("hibernate.cfg.xml");
		configurtion.addAnnotatedClass(Product.class);
		SessionFactory sessionFactory=configurtion.buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session;
	}

}
