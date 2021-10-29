public class Species {	

    // Put the instance variable here.
	public String name;
	public int pop;
	public int growthRate;
	

    // ....

    // Create a Species constructor that takes in a String for its name, an int for
    // its population, and an int for its growth rate per year as a percent.
	public Species(String name, int pop, int growthRate) {
		
		this.name = name;
		
		if (pop > 1500) {
			this.pop = 1500;
		}
		
		else if (pop < 1) {
			this.pop = 1;
		}
		
		else {
			this.pop = pop;
		}
		
		if (growthRate > 20) {
			this.growthRate = 20;
		}
		
		else if (growthRate < 1) {
			this.growthRate = 1;
		}
		
		else {
			this.growthRate = growthRate;
		}
		
						
	}

    // ....
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.

    public void mergeSpecies(Species other) {
    	this.name += other.name;
        this.pop += other.pop;
        
        if (this.growthRate < other.growthRate) {
        	this.growthRate = other.growthRate;
        }
               
    }

    public String toString(){

        String output = "";
        output += "Name: " + this.name + "\n";
        output += "Population: " + this.pop + "\n";
        output += "Growth Rate: " + this.growthRate + "%" + "\n";
        		
        return output;
       
//        System.out.println("toString NOT IMPLEMENTED YET");
//        return "";
    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by adding to it the growth rate/100 times the current population.

    public void grow() {
    	
    	this.pop += this.pop * (this.growthRate/(double)100);
        
    
    }

    // Returns the population of the species in x years according to its growth rate.

    public int populationInXYears(int x){
    	int population = this.pop;
    	
        for (int i = 1; i < x; i++) {
        	population += population * (this.growthRate/(double)100);
        	
        }
              
        return population;
    }

    public static void main(String[] args) {

        // Put simple code here to test the Species class.  It is always a good idea to include
        // a main method in any class you define.

        Species a = new Species("Frog", 100, 10);
        System.out.println(a);

        a.grow();
        System.out.println(a);

        System.out.println("a.populationInXYears(10) returns " + a.populationInXYears(10));

        Species b = new Species("Rabbit", 10, 23);
        a.mergeSpecies(b);
        System.out.println("a.mergeSpecies(b) is " + a);
        
    }
}
