package com.entity.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="ProductDetails")
public class Product {
	@Id
	@Column(name="pid")
	private int productId;
	@Column(name="pname")
	private String productName;
	@Column(name="price")
	private int productPrice;
	@Column(name="qty")
	private int quantity;
	@Column(name="tax")
	private int productTax;
	@Column(name="totalprice")
	private int totalPrice;
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", productTax=" + productTax + ", totalPrice=" + totalPrice + "]";
	}
	public Product() {
		super();
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductTax() {
		return productTax;
	}
	public void setProductTax(int productTax) {
		this.productTax = productTax;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	

}
