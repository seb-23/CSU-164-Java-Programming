
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class R8 {

	public static void main(String[] args) {

		// Declare variables
		int int0=0, int1=0;
		double real0=0.0, real1=0.0;
		char char0=' ', char1=' ', char2=' ';
		String string0="", string1="", string2="";

		try {

			// Open input stream
			Scanner scan = new Scanner(new File("data.txt"));

			// Read contents
			string0 = scan.nextLine();
			string1 = scan.nextLine();
			string2 = scan.nextLine();
			char0 = scan.next().charAt(0);
			char1 = scan.next().charAt(0);
			char2 = scan.next().charAt(0);
			int0 = scan.nextInt();
			int1 = scan.nextInt();
			real0 = scan.nextDouble();
			real1 = scan.nextDouble();

			// Close input stream
			scan.close();

		} catch (IOException e) {
			System.out.println("Cannot read file: data.txt");
			System.exit(0);
		}

		System.out.println(int0*17 + int1*7);
		System.out.println((real0 - real1)/4.321);
		System.out.printf("%.6f\r", Math.pow(real1, 5.0));
		System.out.println(string0.charAt(5) + ", " + string1.charAt(4) + ", " + (string2.length()-1));
		System.out.println(string1.length() + (int)string1.charAt(0));
		System.out.println((int)char0 * (int)char1 * (int)char2);
		System.out.println(string2.equals("Hello World!"));
		
		if (Character.isUpperCase(string1.charAt(0))) {
			System.out.println("Starts with uppercase letter.");
		}
				
		else if (Character.isLowerCase(string1.charAt(0))) {
			System.out.println("Starts with lowercase letter.");
		}
		else {
			System.out.println("Does not start with a letter.");
		}
		
		
		switch (char1) {
		
		case '$':
			System.out.println("Special Character");
			
		case '@':
			System.out.println("Special Character");
			
		case '#':
			System.out.println("Special Character");
			
		case '2':
			System.out.println("Even Digit");
			
		case '4':
			System.out.println("Even Digit");
			
		case '6':
			System.out.println("Even Digit");
			
		case '8':
			System.out.println("Even Digit");
			
		case '1':
			System.out.println("Odd Digit");
			
		case '3':
			System.out.println("Odd Digit");
			
		case '5':
			System.out.println("Odd Digit");
			
		case '7':
			System.out.println("Odd Digit");
			
		case '9':
			System.out.println("Odd Digit");
			
		case 'a':
			System.out.println("Vowel Letter");
			
		case 'e':
			System.out.println("Vowel Letter");
			
		case 'i':
			System.out.println("Vowel Letter");
			
		case 'o':
			System.out.println("Vowel Letter");
			
		case 'u':
			System.out.println("Vowel Letter");
			
		default:
			System.out.println("Unknown character");
			
		}
				
			
	}


}


