import java.awt.Point;
import java.util.ArrayList;

//P1 Assignment 
//Author: Sebastian J. Infantes
//Date: 08/23/2018
//Class: CS 164
//Email: sebby23@rams.colostate.edu
public class P1 {

	public static void main(String[] args) {
		System.out.println("Java programming is great!");
		System.out.println("Infantes, Sebastian");
		System.out.println("Computer Science");
		System.out.println(2468);
		System.out.println("05/23/1995");
		System.out.println("CS163/4: CS1 Java");
		System.out.println("I am taking this class to meet the requirements for Computer Science Major.");
		int s = 0b01110011;
		System.out.println("1." + s + " " + Integer.toBinaryString(s));
//		s = s >> 4;
		int b = 0b0111;
//		s >>= 1;
		int i = 15;
		System.out.println(Integer.toBinaryString(s) + " " + s + " " + Integer.toBinaryString(15));
		System.out.println(Integer.toBinaryString((i & b)) + " " + (i ^ b));
		System.out.println(Integer.toBinaryString(16));
		int k = 115;
		
		//System.out.println(~k);
		System.out.println(k<<=4);
		System.out.println(15 ^ 7);
		System.out.println("");
		
		System.out.println(Point.distance(3.0, 3.0, 5.0, 9.0));
		
		ArrayList<Integer> test = new ArrayList<Integer>(10);
		char[][] Test = new char[10][3]; 
		Test[0][0] = 1;
		Test[0][1] = 2;
		Test[0][2] = 3;
		test.add(4);
		
		
		System.out.println(Test.length + " " + Test[1].length);
		System.out.println(test.size() + " " + test.get(0));

		


	}

}
