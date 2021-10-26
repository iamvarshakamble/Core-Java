package com.xworkz.dp.dto;

public class ElevatorDTO {
	private boolean cardAccess;
	private int elevatorButtons;
	private boolean doorSenors;
	private boolean doorRestraints;
	private boolean safetyBrakes;
	private String elevatorType;
	private String elevatorFor;
	
	public ElevatorDTO() {
		System.out.println("ElevatorDTO Constructor");
	}

	public ElevatorDTO(boolean cardAccess, int elevatorButtons, boolean doorSenors, boolean doorRestraints,
			boolean safetyBrakes, String elevatorType, String elevatorFor) {
		super();
		this.cardAccess = cardAccess;
		this.elevatorButtons = elevatorButtons;
		this.doorSenors = doorSenors;
		this.doorRestraints = doorRestraints;
		this.safetyBrakes = safetyBrakes;
		this.elevatorType = elevatorType;
		this.elevatorFor = elevatorFor;
	}

	public boolean isCardAccess() {
		return cardAccess;
	}

	public void setCardAccess(boolean cardAccess) {
		this.cardAccess = cardAccess;
	}

	public int getElevatorButtons() {
		return elevatorButtons;
	}

	public void setElevatorButtons(int elevatorButtons) {
		this.elevatorButtons = elevatorButtons;
	}

	public boolean isDoorSenors() {
		return doorSenors;
	}

	public void setDoorSenors(boolean doorSenors) {
		this.doorSenors = doorSenors;
	}

	public boolean isDoorRestraints() {
		return doorRestraints;
	}

	public void setDoorRestraints(boolean doorRestraints) {
		this.doorRestraints = doorRestraints;
	}

	public boolean isSafetyBrakes() {
		return safetyBrakes;
	}

	public void setSafetyBrakes(boolean safetyBrakes) {
		this.safetyBrakes = safetyBrakes;
	}

	public String getElevatorType() {
		return elevatorType;
	}

	public void setElevatorType(String elevatorType) {
		this.elevatorType = elevatorType;
	}

	public String getElevatorFor() {
		return elevatorFor;
	}

	public void setElevatorFor(String elevatorFor) {
		this.elevatorFor = elevatorFor;
	}
	
}
