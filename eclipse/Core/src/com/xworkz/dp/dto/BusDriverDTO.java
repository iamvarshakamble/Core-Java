package com.xworkz.dp.dto;

public class BusDriverDTO {
	private String driverName;
	private int experience;
	private double salary;
	private String busName;
	private int age;
	private String place;
	private String workingHours;
	
	public BusDriverDTO() {
		System.out.println("BusDriver Constructor");
	}

	public BusDriverDTO(String driverName, int experience, double salary, String busName, int age, String place,
			String workingHours) {
		super();
		this.driverName = driverName;
		this.experience = experience;
		this.salary = salary;
		this.busName = busName;
		this.age = age;
		this.place = place;
		this.workingHours = workingHours;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

}
