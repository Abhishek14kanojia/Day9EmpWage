package com.day9EmpWage;

public class EmployeesWage {

	public static final int PartTime = 1;
	public static final int FullTime = 2;
	
	public static int computerEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		int emphrs = 0;
		int totalEmphrs = 0;
		int totalWorkingDays =0;
		
		while (totalEmphrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			
		int empCheck = (int)Math.floor(Math.random()*10)%3;
		switch (empCheck) {
		case 1:
			System.out.println("Employee is Present in partTime");
			emphrs = 4;
			totalEmphrs = totalEmphrs + emphrs;
			System.out.println("Day : " + totalWorkingDays + "EmployeeHours :" + emphrs);
			break;
		case 2:
			System.out.println("Employee is Present in FullTime");
			emphrs = 8;
			totalEmphrs = totalEmphrs + emphrs;
			System.out.println("Day : " + totalWorkingDays + "EmployeeHours :" + emphrs);
			break;
		default :
			System.out.println("Employee is Absent");
			}
		
		}
		
		int totalEmpWage = totalEmphrs * empRatePerHour;
		System.out.println("Total Employee Wage for Company : " + company + " is : " + totalEmphrs);
		return totalEmpWage;
	}
	public static void main(String[] args) {
		computerEmpWage("TCS", 20, 2, 10);
		computerEmpWage("Infosys", 10, 4, 20);
		
	}
	
}
