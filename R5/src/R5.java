import java.util.Scanner;

// R5 Lab
// Author: Sebastian Infantes
// Date:   09/06/2018
// Class:  CS 164
// Email:  sebby23@rams.colostate.edu
public class R5 {

	public static void main(String[] args) {
		
		boolean boolean0 = true;
		boolean boolean1 = false;
		
		System.out.println("boolean0 is " + boolean0);
		System.out.println("boolean1 is " + boolean1);
		
		boolean equals = (11 == 33);
		boolean notEquals = (22 != 44);
		boolean greaterThan = (15 > 25);
		boolean lessThan = (-11 < 13);
		
		System.out.println("(11 == 33) is " + equals);
		System.out.println("(22 != 44) is " + notEquals);
		System.out.println("(15 > 25) is " + greaterThan);
		System.out.println("(-11 < 13) is " + lessThan);
		
		Scanner scan = new Scanner(System.in);
		
		int integer0;
		int integer1;
		
		System.out.println("Enter first integer: ");
		integer0 = scan.nextInt();
		
		System.out.println("Enter first integer: ");
		integer1 = scan.nextInt();
		
		if (integer0 > integer1) {
			System.out.println("First integer is larger than the second.");		
		}
		else if (integer1 > integer0) {
			System.out.println("Second integer is larger than the first.");
		}
		else {
			System.out.println("Both integers are equal.");
		}
		
		String myString;
		System.out.println("Enter a state: ");
		myString = scan.next();
		
		switch(myString) {
		
		case "Alabama":
			System.out.println("Southern State");
			break;
			
		case "Florida":
			System.out.println("Southern State");
			break;
			
		case "Colorado":
			System.out.println("Western State");
			break;
			
		case "Utah":
			System.out.println("Western State");
			break;
			
		case "Michigan":
			System.out.println("Northern State");
			break;
			
		case "Wisconsin":
			System.out.println("Northern State");
			break;
			
		case "Delaware":
			System.out.println("Eastern State");
			break;
			
		case "Maine":
			System.out.println("Eastern State");
			break;
			
		default:
			System.out.println("Not sure where that is, must be in the Midwest!");
			
		}
	
		scan.close();
		
		// System.out.println("String: " + myString.equals(myString2));
		
				
	}

}
