package com.xworkz.dp.dto;

public class SeasonDTO {
	private String seasonName;
	private String startMonth;
	private String endMonth;
	private String flowers;
	private boolean humidity;
	private float temperature;
	private String fruits;
	
	public SeasonDTO() {
		System.out.println("SeasonDTO constructor");
	}

	public SeasonDTO(String seasonName, String startMonth, String endMonth, String flowers, boolean humidity,
			float temperature, String fruits) {
		super();
		this.seasonName = seasonName;
		this.startMonth = startMonth;
		this.endMonth = endMonth;
		this.flowers = flowers;
		this.humidity = humidity;
		this.temperature = temperature;
		this.fruits = fruits;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}

	public String getFlowers() {
		return flowers;
	}

	public void setFlowers(String flowers) {
		this.flowers = flowers;
	}

	public boolean isHumidity() {
		return humidity;
	}

	public void setHumidity(boolean humidity) {
		this.humidity = humidity;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

}
