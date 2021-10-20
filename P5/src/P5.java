import java.util.Scanner;

// P4 Assignment
// Author: Sebastian Infantes
// Date:   09/17/2018
// Class:  CS 164
// Email:  sebby23@rams.colostate.edu

public class P5 {
	// Method to check whether an integer is prime.
	public static boolean isPrime(int number) {

	    // DO NOT CHANGE THIS CODE!
	    for(int i=2;i<=number/2;i++)
	        if(number%i==0)
	            return false;
	    return true;
	}

	// Method to print primes in a specified range
	public static void printPrimes(int start, int end) {
		int i;
		
	    for (i = start; i <= end; ++i) {
	    	if (isPrime(i)) {
	    		System.out.print(i + ", ");			
	    	}
	    	
	    }	    		    			    	
	    System.out.println();
	}

	// Method to remove vowels from a string
	public static String removeVowels(String input) {
	    
		String returnValue = "";
		int i;
		
		for (i=0; i < input.length(); ++i) {
			
			if ((input.charAt(i) == (char)65) || (input.charAt(i) == (char)97)) {
				//System.out.print("");
			}
			else if ((input.charAt(i) == (char)69) || (input.charAt(i) == (char)101)) {
				//System.out.print("");
			}
			else if ((input.charAt(i) == (char)73) || (input.charAt(i) == (char)105)) {
				//System.out.print("");
			}
			else if ((input.charAt(i) == (char)79) || (input.charAt(i) == (char)111)) {
				//System.out.print("");
			}
			else if ((input.charAt(i) == (char)85) || (input.charAt(i) == (char)117)) {
				//System.out.print("");
			}
			else {
				returnValue += input.charAt(i);
			}
			
			/*switch (input) {
			
			case "A":
				//System.out.print(input.replace("A", ""));
				break;
				
			case "E":
				//System.out.print(input.replace("E", ""));
				break;
								
			case "I":
				//System.out.print(input.replace("I", ""));
				break;
							
			case "O":
				//System.out.print(input.replace("O", ""));
				break;
								
			case "U":
				//System.out.print(input.replace("U", ""));
				break;
				
			default:
				System.out.print(input.charAt(i));
				
				
			}*/
			
		}
		return returnValue;
	}

	// Method to generate and print the value of a number raised to an exponent
	public static double evaluateExponent(double number, int exponent) {
	    
		double result = 1.0;
		
		if (exponent == 0) {
			return result;
		}
		
		int loop = 0;
		
		do {
			result = result * number;
		++loop;
		}
		while (loop != exponent);
		
		return result;
	}

	// Method to find and print the minimum/maximum/mean of a set of positive numbers
	public static void computeStatistics(int sentinel) {
	    
		Scanner keyboard = new Scanner(System.in);
		
		int value = 0;
		int count = 0;
		double mean = 0;
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		
		while (value >= 0) {	
			
			value = keyboard.nextInt();
			
			if (value == sentinel) {
				break;
			}
						
			if (value < minimum) {
				minimum = value;
			}
			
			if (value > maximum) {
				maximum = value;
			}
			
			mean += value;
			++count;			
		}
							
		mean /= count;
		
		System.out.println("Count: " + count);
		System.out.printf("Average: %.1f\n", mean);
		System.out.println("Maximum: " + maximum);
		System.out.println("Minimum: "+ minimum);
		
		keyboard.close();
	}
	
	
	public static void main(String[] args) {
		
	    // Preliminary testing
	    printPrimes(1, 50);
	    System.out.println(removeVowels("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	    double result = evaluateExponent(2.0,16);
	    System.out.println("2.0 to the 16 = " + result);
	    computeStatistics(-1);

	}

}
