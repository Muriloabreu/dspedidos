package com.devsuperior.dspedidos.entities;

public class Order {
	
	private int code;
	private double basic;
	private double discount;
	
	//constructor
	
	public Order() {
		
	}

	public Order(int code, double basic, double discount) {
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}
	
	
	//Métodos Acessores 

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	

}
