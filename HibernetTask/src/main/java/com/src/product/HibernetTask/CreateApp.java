package com.src.product.HibernetTask;

import org.hibernate.Session;

import com.entity.product.Product;
import com.product.utils.HibernetUtils;

public class CreateApp 
{
	public void createData(Product product1)
    {
    	Session session=HibernetUtils.getSession();
    	
    	session.beginTransaction();
    	session.save(product1);
    	session.getTransaction().commit();
    	System.out.println("product record saved");
        
    }

	
}
