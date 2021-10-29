import java.util.ArrayList;

public class Animal {
	
	private String name;
	private int topSpeed;
	
	
	
	//create the getters and setters for the instance variables
        //there is a shortcut by hovering over the variable names
	public String getName() {
		return this.name;
	}
	
	// For the setter associated with topSpeed make sure the values are between 0 and 70
    // Print "Invalid Speed" if it is not within these values and leave
    // the speed unchanged.

	
	public int gettopSpeed() {
		if ((topSpeed >= 0) && (topSpeed <= 70)) {
			return this.topSpeed;
		}
		else {
			System.out.println("Invalid Speed");
			return this.topSpeed;
		}	
	}
	
	
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables
	
	public Animal(String name2, int topSpeed2) {
		name = name2;
		topSpeed = topSpeed2;
						
	}


        //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other
	
	public boolean equals(Object other) {
		
		if (other instanceof Animal) {
			Animal a = (Animal)other;
			if (Math.abs((a.gettopSpeed() - this.topSpeed)) <= 2) {
				return true;
			}
		}	
		return false;
	}
	
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25
	
	public String toString() {
		String output = "";
		output = "Name: " + name + "      Top Speed: " + topSpeed + "\n";
		return output;
	}



	
}
