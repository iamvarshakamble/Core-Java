package com.xworkz.dp.dto;

public class DressCodeDTO {
	private int size;
	private String material;
	private String color;
	private float price;
	private String gender;
	
	public DressCodeDTO() {
		System.out.println("Invoked DressCodeDTO constructor");
	}

	public DressCodeDTO(int size, String material, String color, float price, String gender) {
		super();
		this.size = size;
		this.material = material;
		this.color = color;
		this.price = price;
		this.gender = gender;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
