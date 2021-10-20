// P4 Assignment
// Author: Sebastian Infantes
// Date:   09/17/2018
// Class:  CS 164
// Email:  sebby23@rams.colostate.edu

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double grossSalary;
		double interestIncome;
		double capitalGains;
		
		int exemptions;
		
		double totalIncome;
		double adjustedIncome;
		double federalTax;
		double stateTax;
		
		System.out.print("Salary: ");
		grossSalary = scan.nextDouble();
		
		System.out.print("Exemptions: ");
		exemptions = scan.nextInt();
		
		System.out.print("Interest: ");
		interestIncome = scan.nextDouble();
		
		System.out.print("Gains: ");
		capitalGains = scan.nextDouble();
		
		totalIncome = (grossSalary + interestIncome + capitalGains - 5000.00);
		System.out.println("Total Income: $" + totalIncome);
		
		if (exemptions > 6) {
			exemptions = 6;
		}		
		
		adjustedIncome = totalIncome - (exemptions * 1500.00);		
		System.out.println("Adjusted Income: $" + adjustedIncome);
		
		if (adjustedIncome >= 0 && adjustedIncome < 20000) {
			System.out.println(federalTax = 0 * adjustedIncome);
			System.out.printf("Total Tax: $%.2f\n", federalTax);
		}
		else if (adjustedIncome >= 20000 && adjustedIncome < 35000) {
				System.out.println(federalTax = .13 * (35000 - adjustedIncome));
				System.out.printf("Total Tax: $%.2f\n", federalTax);
			}
		else if (adjustedIncome >= 35000 && adjustedIncome < 50000) {
					System.out.println(federalTax = .23 * (50000.00 - adjustedIncome) + 1950.00);
					System.out.printf("Total Tax: $%.2f\n", federalTax);
				}
		else if (adjustedIncome >= 50000) {
						federalTax = .28 * (adjustedIncome - 50000.00) + 3450.00 + 1950.00;
						System.out.printf("Total Tax: $%.2f\n", federalTax);
					}	
		
					
		stateTax = adjustedIncome * .065;		
		System.out.printf("State Tax: $%.2f\n", stateTax);
		
		scan.close();

	}

}
