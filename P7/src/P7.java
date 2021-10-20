import java.util.Arrays;

// P7 Assignment
// Author: Sebastian Infantes
// Date:   10/05/2018
// Class:  CS 164
// Email:  sebby23@rams.colostate.edu

public class P7 {
	
	public static int[] createIntegers() {
		int[] s = {16, 21, 34, 49, 55, 60, 72, 83, 101};
		return s;
	}
	
	public static double[] createDoubles() {
		double[] d = new double[7];
		
		for (int i = 0; i<7; i++) {
			d[i] = Math.pow(10.0 + (double)i * 0.5, 2);
		}
		
		return d;
		
	}
	
	public static String[] createStrings(String input) {
		String[] k = new String[4];
		
		for (int i = 0; i < 4; i++) {
			
			switch (i) {
			
			case 1:
				k[i] = input.toUpperCase();
				break;
				
			case 2:
				k[i] = input.toLowerCase();
				break;
				
			case 3:
				k[i] = input.substring(1, input.length());
				break;
				
			default:
				k[i] = input;
				break;
				
			}
			
		}
			
			return k;
			
		}
	
	public static char[] createChars(String result) {
		char[] v = new char[result.length()];
		
		for (int i = 0; i<result.length(); i++) {
			v[i] = result.charAt(i);
		}
		
		return v;
	}
	
	public static int sumArray(int[] sum) {
		int h = 0;
		for (int i = 0; i < sum.length; i++) {
			h += sum[i];
		}
		
		return h;
	}
	
	public static double findLargest(double[] largest) {
		double r = 0.0;
		for (int i = 0; i < largest.length; i++) {
			if (largest[i] > r) {
				r = largest[i];
			}
		}
		
		return r;
	}
	
	public static int charFrequency(String[] total, char letter) {
		int t = 0;
		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total[i].length(); j++)
			if (total[i].charAt(j) == letter) {
				++t;
			}
		}
		
		return t;
	}
	
	public static int[] translateChars(char[] translate) {
		int[] j = new int[translate.length];
		for (int i = 0; i < translate.length; i++) {
			j[i] = (int)translate[i];
		}
		
		return j;
	}
	

	public static void main(String[] args) {
		
		int[] integerArray = createIntegers();
	    System.out.println(Arrays.toString(integerArray));
	    double[] doubleArray = createDoubles();
	    System.out.println(Arrays.toString(doubleArray));
        String[] stringArray = createStrings("Hello There");
        System.out.println(Arrays.toString(stringArray));
        char[] charArray = createChars("Java1234!&");
        System.out.println(Arrays.toString(charArray));
        
     // Test processing
        System.out.println("Sum of integer array = " + sumArray(integerArray));
        System.out.println("Largest of double array = " + findLargest(doubleArray));
        System.out.println("Frequency of 'e' = " + charFrequency(stringArray, 'e'));
        System.out.println("Translated characters = " + Arrays.toString(translateChars(charArray)));
	}

}
