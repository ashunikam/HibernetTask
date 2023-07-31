package com.src.product.HibernetTask;

import org.hibernate.Session;

import com.entity.product.Product;
import com.product.utils.HibernetUtils;

public class UpdateApp {

	public void updateData(int id, String choice,String data) {
		// TODO Auto-generated method stub
		Session session=HibernetUtils.getSession();
		Product product=session.get(Product.class,id);
		if(choice.equals("name")) {
		product.setProductName(data);
		}
		else if(choice.equals("price")) {
			product.setProductPrice(Integer.parseInt(data));
			
		}else if(choice.equals("tax")) {
			product.setProductTax(Integer.parseInt(data));
		}
		else if(choice.equals("qty")) {
			product.setQuantity(Integer.parseInt(data));
		}
		else if(choice.equals("price")) {
			product.setProductPrice(Integer.parseInt(data));
		}
		else if(choice.equals("total price")) {
			product.setTotalPrice(Integer.parseInt(data));
		}
		session.beginTransaction();
		session.update(product);
		session.getTransaction().commit();
		System.out.println(product);
		
	}

}
