// P3 Assignment
// Author: Sebastian Infantes
// Date:   09/10/2018
// Class:  CS 164
// Email:  sebby23@rams.colostate.edu

import java.util.Scanner;

public class P3 {

	 public static String evaluate(String expression) {

	        // Print expression
	        System.out.println(expression);

	        // Declare variables for operands, operator, result, and return value
	        String returnString = "";
	        String operator;	      
	        
	        double operand1;
	        double operand2;
	        double result;
	        
	        
	        
	        result = 0;
	           

	        // Create Scanner object to parse expression
	        Scanner scan = new Scanner(expression);	        

	        // Use Scanner to read operands and operator	      	        	      	      
	        if (scan.hasNextDouble()) {
	        	operand1 = scan.nextDouble();
	        }
	        else {
	        	return "Invalid Operand!";
	        }
	        	     
	        operator = scan.next();
	        
	        if (scan.hasNextDouble()) {
	        	operand2 = scan.nextDouble();
	        }
	        else {
	        	return "Invalid Operand!";
	        }

	        switch(operator) {
			
			case "+":
				result = operand1 + operand2;
				break;
				
			case "-":
				result = operand1 - operand2;
				break;
				
			case "*":
				result = operand1 * operand2;
				break;
				
			case "/":
				result = operand1 / operand2;
				break;
				
			case "%":
				result = operand1 % operand2;
				break;
				
			case "^":
				result = Math.pow(operand1, operand2);
				break;
						
			default:
				return "Invalid Operator!";
				
			}
	        	        	        	        	        	 			   	        
//	        // Compute a numerical result for the expression
//	        returnValue = scan.next();
//	        
//	        switch(returnValue) {
//	        
//	        case ("11.22 + 3.456 ="):
//	        	returnValue = "14.676 ";
//	        	break;
//	        	
//	        case ("5.555 - 32.14 ="):
//	        	returnValue = "-26.585 ";
//	        	break;
//	        	
//	        case ("25634.8 * 32.14 ="):
//	        	returnValue = "8203.136 ";
//	        	break;
//	        	
//	        case ("2.1 / 55.3377 ="):
//	        	returnValue = "0.037948812473232535 ";
//	        	break;
//	        	
//	        case ("12345 % 23 ="):
//	        	returnValue = "17.0 ";
//	        	break;
//	        	
//	        case ("5 ^ 4 ="):
//	        	returnValue = "625.0 ";
//	        	break;
//	        	
//	        case ("Whatever + 2 ="):
//	        	returnValue = "Invalid Operand! ";
//	        	break;
//	        	
//	        case ("4.0 - 1.2.3 ="):
//	        	returnValue = "Invalid Operand! ";
//	        	break;
//	        	
//	        case ("1.234 $ 0.5 ="):
//	        	returnValue = "Invalid Operator! ";
//	        	break;
//	        	
//	        
//	        }
//	        
//
	        // Convert numerical result to string
	        returnString = Double.toString(result);
	        
	        scan.close();

	        // Return result
	        return returnString;	        	        
	        
	        
	        /*	        operator = scan.next();
	        
	        if (scan.hasNext()) {
	        	System.out.println(operator);
	        }
	        else {
	        	returnString = "Invalid Operand!";
	        }	      
	        
	        */

	        
	    }
	}

