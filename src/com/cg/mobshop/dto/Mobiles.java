package com.cg.mobshop.dto;

public class Mobiles {
	
	private String mobileId;
	private String name;
	private String price;
	private String quantity;
	
	public Mobiles() {
		// TODO Auto-generated constructor stub
	}

	public Mobiles(String mobileId, String name, String price, String quantity) {
		super();
		this.mobileId = mobileId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Mobiles [mobileId=" + mobileId + ", name=" + name + ", price="
				+ price + ", quantity=" + quantity + "]\n";
	}
	
}
