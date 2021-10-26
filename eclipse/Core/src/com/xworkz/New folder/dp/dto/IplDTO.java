package com.xworkz.dp.dto;

public class IplDTO {
	private String teamName;
	private Integer teamCoaches;
	private Integer teamSize;
	private String owner;
	private String sponsor;
	
	public IplDTO() {
		System.out.println("Invoke IplDTO constructor");
	}

	public IplDTO(String teamName, Integer teamCoaches, Integer teamSize, String owner, String sponsor) {
		super();
		this.teamName = teamName;
		this.teamCoaches = teamCoaches;
		this.teamSize = teamSize;
		this.owner = owner;
		this.sponsor = sponsor;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getTeamCoaches() {
		return teamCoaches;
	}

	public void setTeamCoaches(Integer teamCoaches) {
		this.teamCoaches = teamCoaches;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	
}
