package com.testapplicationdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer temp;
	
	private Integer itemno;
	private String itemName;
	private Float price;
	private Integer quantity;
	
	public Integer getTemp() {
		return temp;
	}
	public void setTemp(Integer temp) {
		this.temp = temp;
	}
	
	
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getItemno() {
		return itemno;
	}
	public void setItemno(Integer itemno) {
		this.itemno = itemno;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
