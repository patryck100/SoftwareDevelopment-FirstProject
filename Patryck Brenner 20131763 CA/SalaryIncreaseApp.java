/*
 *SalaryIncreaseApp.java
 *@Patryck Brenner
 *2nd of Dec 2020
*/

import java.util.*;
public class SalaryIncreaseApp{
	public static void main (String args[]){
		//variables
		int ePosition, years;
		double salary, newSalary;
		String position = "";

		//constants
		final int manager = 1;
		final int teamLeader = 2;
		final int softwareDeveloper = 3;

		//objects
		Scanner sc = new Scanner (System.in);
		SalaryIncrease mySalary = new SalaryIncrease();

		//input
		System.out.println("Please enter enter your position: [" + manager + "] for manager, ["
							+ teamLeader + "] for Team Leader or [" + softwareDeveloper + "] for Software Developer." );
		ePosition = sc.nextInt();

		if (ePosition == 1 || ePosition == 2 || ePosition == 3){

			mySalary.setEPosition(ePosition);

			System.out.println("Please enter the number of years you worked in the company:");
			years = sc.nextInt();
			mySalary.setYears(years);

			System.out.println("Please enter your salary: ");
			salary = sc.nextDouble();
			mySalary.setSalary(salary);

			//compute
			mySalary.compute();

			if (ePosition == manager){
				position = "Manager";
			} else if (ePosition == teamLeader){
				position = "Team Leader";
			} else {
				position = "Software Developer";
			}

			//output
			newSalary = mySalary.getNewSalary();
			System.out.println("Being a " + position + " who worked for " + years + " years, your new salary will be: " + newSalary);

		}else {
					System.out.println("You inserted an invalid position.");
		}

	}
}