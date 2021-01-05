/*
 *SalaryIncrease.java
 *@Patryck Brenner
 *2nd of Dec 2020
*/

public class SalaryIncrease{
	//Variables
	private int ePosition, years;
	private double salary, newSalary;

	//constructor
	public SalaryIncrease(){
		ePosition = 0;
		years = 0;
		salary = 0.0;
		newSalary = 0.0;
	}

	//set methods
	public void setEPosition(int ePosition){
		this.ePosition = ePosition;
	}

	public void setYears (int years){
		this.years = years;
	}

	public void setSalary (double salary){
		this.salary = salary;
	}

	//compute method
	public void compute(){


			if (ePosition == 1 && years <=6){
				newSalary = salary * 1.02;
			} else if (ePosition == 1 && years >6){
				newSalary = salary * 1.03;
			} else if (ePosition == 2 && years <=6){
				newSalary = salary * 1.025;
			} else if (ePosition == 2 || ePosition == 3 && years >6){
				newSalary = salary * 1.04;
			} else {
				newSalary = salary * 1.03;
			}

	}

	//get methods
	public double getNewSalary(){
		return newSalary;
	}


}