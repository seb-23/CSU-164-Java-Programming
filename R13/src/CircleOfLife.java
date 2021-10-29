public class CircleOfLife {

    public static void main(String args[]) {

        // Create a new Species object here, passing in the appropriate arguments
    	Species s = new Species("Brutus", 30, 4);
    	
    	System.out.println(s);
    	
    			
        // Print out the species' growth rate
    	System.out.println(s.growthRate);

        // Use the species' toString here
    	s.toString();
		
        // Call populationInXYears here
    	s.populationInXYears(10);
    	
		
        // Create a new Species object here, passing in the appropriate arguments
        // using a very large number for the population (e.g. 100000000)
    	Species k = new Species("Bodhi", 100000000, 21);

        // Print out the species' population to make sure it is set to 1500
    	System.out.println(k.pop);

        // Call populationInXYears here, feel free to hardcode in the int to be passed to the method
    	
    	k.populationInXYears(10);
    	

        // Call mergeSpecies here. Test that mergeSpecies is doing what you expected it to
    	
    	k.mergeSpecies(s);
    	System.out.println(k);
				
    }
}
