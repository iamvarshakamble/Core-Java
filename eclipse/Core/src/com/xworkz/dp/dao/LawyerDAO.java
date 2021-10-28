package com.xworkz.dp.dao;

import com.xworkz.dp.dto.LawyerDTO;

public class LawyerDAO {
	private LawyerDTO[] lawyerDTOs = new LawyerDTO[10];
	private int count;

	public void save(LawyerDTO dto) {
		if (dto != null && this.count < this.lawyerDTOs.length && this.count >= 0) {
			this.lawyerDTOs[this.count++] = dto;
			System.out.println("The added array is: ".concat(dto.getName()));
		} else {
			System.err.println("Array is full or dto is null");
		}
	}

	public void delete(int index) {
		if (index > 0 && index < this.lawyerDTOs.length) {
			this.lawyerDTOs[index] = null;
			System.out.println("The deleted index is: ".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public void save(LawyerDTO dto, int index) {
		if (dto != null && index >= 0 && index < this.lawyerDTOs.length) {
			this.lawyerDTOs[index] = dto;
			System.out
					.println("The added name is: ".concat(String.valueOf(index).concat(" and ").concat(dto.getName())));
			this.count++;
		} else {
			System.err.println("Array is full or invalid index");
		}
	}

	public boolean search(String name) {
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref = lawyerDTOs[i];

			if (ref != null) {
				System.out.println("ref is :".concat(String.valueOf(i)));
				String tempName = ref.getName();
				System.out.println(tempName);
				if (tempName.equals(name)) {
					System.out.println("name found");
					return true;
				}
			}
		}

		return false;
	}

	public boolean searchcase(int casesWon) {
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref = lawyerDTOs[i];

			if (ref != null) {
				System.out.println("ref is: ".concat(String.valueOf(i)));
				int tempCase = ref.getCasesWon();
				System.out.println(tempCase);
				if (tempCase == casesWon) {
					System.out.println("Found");
					return true;
				}
			}
		}
		return false;
	}

	public int getExperienceByname(String name) {
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref = lawyerDTOs[i];

			if (ref != null) {
				System.out.println("ref is: ".concat(String.valueOf(i)));
				String tempName = ref.getName();
				System.out.println(tempName);
				if (tempName.equals(name)) {
					System.out.println("name matched");
					System.out.println("Experience is:" + ref.getExperience());
					return ref.getExperience();
				} else {
					System.out.println("name not matched");
				}
			}
		}
		return 0;
	}

	public String getQualificationByName(String name) {
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref = lawyerDTOs[i];

			if (ref != null) {
				System.out.println("ref is :".concat(String.valueOf(i)));
				String tempName = ref.getName();
				System.out.println(tempName);
				if (tempName.equals(name)) {
					System.out.println("name matched");
					String qualification = ref.getQualification();
					System.out.println("Qualification is: ".concat(qualification));
					return ref.getQualification();
				} else {
					System.out.println("name not matched");
				}

			}
		}
		return null;
	}

	public LawyerDTO getLawyerWithMaxExp() {
		int max = 0;
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref = lawyerDTOs[i];
				if(ref.getExperience()>max) {
					max=ref.getExperience();
				}
			}
		System.out.println("The maximum experience: ".concat(String.valueOf(max)));
		return null;
		}

	}

