package com.xworkz.dp.dto;

public class CircusDTO {
	private String owner;
	private float ticketPrice;
	private int noOfAnimals;
	private int noOfShows;
	private int duration;
	
	public CircusDTO() {
		System.out.println("Invoke CircusDTO constructor");
	}

	public CircusDTO(String owner, float ticketPrice, int noOfAnimals, int noOfShows, int duration) {
		super();
		this.owner = owner;
		this.ticketPrice = ticketPrice;
		this.noOfAnimals = noOfAnimals;
		this.noOfShows = noOfShows;
		this.duration = duration;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
