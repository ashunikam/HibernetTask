package com.src.product.HibernetTask;
import java.util.Scanner;

import com.entity.product.Product;

public class ChatBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		String ans="y";
		do {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Create");
		System.out.println("2. Display");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1: 
			CreateApp create=new CreateApp();
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter price");
			int price=sc.nextInt();
			System.out.println("Enter tax");
			int tax=sc.nextInt();
			System.out.println("Enter qty");
			int qty=sc.nextInt();
			System.out.println("Enter total price");
			int totalPrice=sc.nextInt();
			Product p=new Product();
			p.setProductId(id);
			p.setProductName(name);
			p.setProductPrice(price);
			p.setProductTax(tax);
			p.setQuantity(qty);
			p.setTotalPrice(totalPrice);
			create.createData(p);
		break;
		case 4: 
			DeleteApp delete=new DeleteApp();
			System.out.println("Enter the id of product");
			int idDelete=sc.nextInt();
			delete.deleteData(idDelete);
		break;
		case 2: 
			ReadApp read=new ReadApp();
			System.out.println("Enter the id of product");
			int idRead=sc.nextInt();
			read.readData(idRead);
		break;
		case 3: 
			UpdateApp update=new UpdateApp();
			System.out.println("Enter the id of product");
			int idUpdate=sc.nextInt();
			String updateChoiceAns="";
			int updateChoice=0;
			do {
				System.out.println("1. Name");
				System.out.println("2. Price");
				System.out.println("3. Tax");
				System.out.println("4. Qty");
				System.out.println("5. Total Price");
				System.out.println("Enter choice");
				updateChoice=sc.nextInt();
				switch(updateChoice) {
				case 1:
					System.out.println("Enter name");
					String updateName=sc.next();
					update.updateData(idUpdate, "name",updateName);
					break;
				case 2:
					System.out.println("Enter Price");
					Integer updatetax=sc.nextInt();
					update.updateData(idUpdate, "price", updatetax.toString());
					break;
				case 3:
					System.out.println("Enter Tax");
					Integer updateQty=sc.nextInt();
					update.updateData(idUpdate, "tax",updateQty.toString());
					break;
				case 4:
					System.out.println("Enter Qty");
					Integer updatePrice=sc.nextInt();
					update.updateData(idUpdate, "qty",updatePrice.toString());
					break;
				case 5:
					System.out.println("Enter total price");
					Integer updateTotalPrice=sc.nextInt();
					update.updateData(idUpdate, "total price",updateTotalPrice.toString());
					break;
				}
				System.out.println("Do you want to continuew with update?");
				updateChoiceAns=sc.next();
				
			}while(updateChoiceAns.equals("y")||updateChoiceAns.equals("Y"));
			
		break;
		}
		System.out.println("Do you want to continue ?");
		ans=sc.next();
		}while(ans.equals("y")|| ans.equals("Y"));

	}

}
