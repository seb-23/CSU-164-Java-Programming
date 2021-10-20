
// P2 Assignment
// Author: Sebastian Infantes
// Date:   09/04/2018
// Class:  CS 164
// Email:  sebby23@rams.colostate.edu

import java.util.Scanner;


public class P2 {

	public static void main(String[] args) {
		
		// Declare variables for mysterious formulas
		double alphaAcid;
		double ounces;
		double weight;
		double lovibond;
		double volume;				
		
        // Instantiate scanner
        Scanner keyboard = new Scanner(System.in);

        // Prompt and read alphaAcid from keyboard
        
        System.out.print("Alpha Acid? ");
        alphaAcid = keyboard.nextDouble();
        
        // Prompt and read ounces from keyboard
        System.out.print("Ounces? ");
        ounces = keyboard.nextDouble();
        
        // Calculate HBUs
        
        double HBUs;
        
        HBUs =  alphaAcid * ounces;

        // Print HBUs to console

        System.out.printf("The HBUs are %.2f.\n", HBUs);
        
        // Prompt and read remaining variables
                     
        System.out.print("Weight? ");
        weight = keyboard.nextDouble();
        
        System.out.print("Lovibond? ");
        lovibond = keyboard.nextDouble();
        
        System.out.print("Volume? ");
        volume = keyboard.nextDouble();
        
        
        // Compute the SRM value using the formula

        double SRM;
        SRM = (0.3 * weight * lovibond / volume) + 4.7;
        
        // Print SRM to console

        System.out.printf("The SRM value is %.4f.\n", SRM);
        
        // Close scanner
        keyboard.close();

	}

}
