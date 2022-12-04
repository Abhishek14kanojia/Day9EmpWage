package com.day9EmpWage;

public class EmployeesWage {

	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int EmpWage = 20;
	public static final int WorkingDay = 2;
	public static final int HrsInmonth =100;
	
	public static int cumputerEmpWage() {
		int emphrs = 0;
		int totalEmphrs = 0;
		int totalWorkingDays =0;
		
		while (totalEmphrs <= HrsInmonth && totalWorkingDays < WorkingDay) {
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
		
		int totalEmpWage = totalEmphrs * EmpWage;
		System.out.println("Total Employee Wage : " + totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args) {
		cumputerEmpWage();
	}
	
}
