package com.xworkz.dp.dto;

public class Bracelet {
private String color;
private float price;
private String material;
private boolean gemUsed;
private boolean gifted;

public Bracelet() {
	System.out.println("Bracelet Constructor invoked");
}

public Bracelet(String color, float price, String material, boolean gemUsed, boolean gifted) {
	super();
	this.color = color;
	this.price = price;
	this.material = material;
	this.gemUsed = gemUsed;
	this.gifted = gifted;
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

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public boolean isGemUsed() {
	return gemUsed;
}

public void setGemUsed(boolean gemUsed) {
	this.gemUsed = gemUsed;
}

public boolean isGifted() {
	return gifted;
}

public void setGifted(boolean gifted) {
	this.gifted = gifted;
}

}
