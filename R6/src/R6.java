import java.util.Scanner;

public class R6 {

	public static void main(String[] args) {
		
		String myString0 = "Java";
		String myString1 = "Programming";
		String myString2 = "Language";
		
		Scanner scan = new Scanner(System.in);		
		
		System.out.println(myString0 + " is a " + myString1 + " " + myString2 + ".");
		
		System.out.println(myString1.length() + myString2.length());
		
		System.out.print(myString1.charAt(1) + ", ");
		System.out.print(myString1.charAt(3) + ", ");
		System.out.println(myString1.charAt(6));
		
		System.out.println(myString0.indexOf('a'));
		
		System.out.println(myString2.toUpperCase());
		System.out.println(myString1.substring(2, 7));
		
		
		
		String myString3 = "Whatever!";
		String myString4 = new String("Whatever!");
		
		System.out.println(myString3 == myString4);
		System.out.println(myString3.equals(myString4));
		
		char c0 = '^';
		char c1 = 'G';
		char c2 = '7';
		
		System.out.println(c0 + "; " + c1 + "; " + c2);
		
		System.out.println((int)c0 + "; " + (int)c1 + "; " + (int)c2);

	}

}
