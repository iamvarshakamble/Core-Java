package com.xworkz.dp.dto;

public class CameraDTO {
	private String company;
	private String type;
	private float pixel;
	private int cost;
	private int batteryCapacity;
	private float weight;
	
	public CameraDTO() {
		System.out.println("Invoke CameraDTO constructor");
	}

	public CameraDTO(String company, String type, float pixel, int cost, int batteryCapacity, float weight) {
		super();
		this.company = company;
		this.type = type;
		this.pixel = pixel;
		this.cost = cost;
		this.batteryCapacity = batteryCapacity;
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPixel() {
		return pixel;
	}

	public void setPixel(float pixel) {
		this.pixel = pixel;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
