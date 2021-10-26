package com.xworkz.dp.dto;

public class ParkDTO {
	private String parkName;
	private String location;
	private String timings;
	private int noOfBenches;
	private String holidays;
	private boolean gymInstruments;
	private boolean temple;
	
	public ParkDTO() {
		System.out.println("ParkDTO Constructor");
	}

	public ParkDTO(String parkName, String location, String timings, int noOfBenches, String holidays,
			boolean gymInstruments, boolean temple) {
		super();
		this.parkName = parkName;
		this.location = location;
		this.timings = timings;
		this.noOfBenches = noOfBenches;
		this.holidays = holidays;
		this.gymInstruments = gymInstruments;
		this.temple = temple;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public int getNoOfBenches() {
		return noOfBenches;
	}

	public void setNoOfBenches(int noOfBenches) {
		this.noOfBenches = noOfBenches;
	}

	public String getHolidays() {
		return holidays;
	}

	public void setHolidays(String holidays) {
		this.holidays = holidays;
	}

	public boolean isGymInstruments() {
		return gymInstruments;
	}

	public void setGymInstruments(boolean gymInstruments) {
		this.gymInstruments = gymInstruments;
	}

	public boolean isTemple() {
		return temple;
	}

	public void setTemple(boolean temple) {
		this.temple = temple;
	}
	
}
