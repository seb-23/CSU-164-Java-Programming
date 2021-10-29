
public class R7 {
	public static void reverseString(String s) {
		
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));		
		}
	    	
		System.out.println(" ");
		
	}

	public static void printAscii(char start, char end) {
		 		
		for (int i = 33; i < 58; i+=1) {
			System.out.print(i + ": ");
			System.out.println((char)i);
		}
			
	}

	public static double raiseToPower(double number, int exponent) {
		
		double t = number;
		int x = exponent;
		
		while (x>1) {
			
			number = t * number; 
			x--;
			
		}
		return number;
	}
	
	public static void main(String[] args) {
		
		 // Test reverseString
		
	    String forward = "Java Programming rules!";   
	    System.out.print("Forward string: ");
	    System.out.println(forward);
	    System.out.print("Reverse string: ");
	    reverseString(forward);
	        
	    // Test printAscii
	    System.out.println("ASCII Table");
	    printAscii('!', '9');
	        
	    // Test raiseToPower
	    System.out.printf("3.0 to the 5 = %.3f\n", raiseToPower(3.0, 5));
	    System.out.printf("2.5 to the 2 = %.3f\n", raiseToPower(2.5, 2));

	}

}
