package com.springcore.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void hey() 
	//This is init() method
	{
		System.out.println("Inside init method: hey how are you?");
	}

	public void bye() 
	//This is destroy method
	{
		System.out.println("Inside destroy method: bye bye i am going to die");
	}

}
