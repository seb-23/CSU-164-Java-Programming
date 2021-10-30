import java.util.Arrays;

// Q3 Assignment
// Author: Sebastian Infantes
// Date:   Oct 26, 2018
// Class:  CS164
// Email:  sebby23@rams.colostate.edu

public class Q3 {

	/*
	 * Method: fillArray
	 */
	public char[] fillArray(String var){
		char[] k = new char[var.length()];
		for (int i = 0; i < var.length(); i++) {
			k[i] = var.charAt(i);
		}
		System.out.println(Arrays.toString(k));
		
		return k;
	}

	/*
	 * Method: productMatrix
	 */
	public int[][] productMatrix(int n){
		int[][] s = new int[n][n];
		if ((0 > n) && (n > 100)) {
			return null;
		}
		if ((n >= 0) && (n <= 100)) {
			for (int i = 0; i < s.length; i++) {
				for (int j = 0; j < s[i].length; j++) {
					s[i][j] = n * n;
					System.out.print(s[i][j] + " ");
				}
				System.out.println("");
			}
		}
		
		
		return s;

	}

	/*
	 * Method: sumOfSquares
	 */
	public long sumOfSquares (int[] intArray) {
		long t = 0;

		if (intArray.length > 1) {
			for (int i = 0; i<intArray.length; i++) {
				t += intArray[i];
			}
			return t;
		}
		
		return 0;
		
	}

	/*
	 * Method: incPosArray
	 */
	public void incPosArray (int[] intArray) {
		
		
		if ((intArray == null) || (intArray.length == 0)) {
			return;
		}
		
		if (intArray.length >= 1) {
			
			for (int i = 0; i < intArray.length; i++) {
				
				if (intArray[i] > 0) {
					intArray[i] += 1;					
				}				
			}
			Arrays.sort(intArray);
			System.out.println(Arrays.equals(intArray, intArray));
			System.out.print(Arrays.toString(intArray));
		}
		
		
	}


	public static void main (String[] args) {
		
		Q3 a = new Q3();
		int[] intr = new int[3];
		intr[0] = 3;
		intr[1]=2;
		intr[2]=3;
		System.out.println(a.sumOfSquares(intr));
		
		Q3 b = new Q3();
		b.fillArray("what up");	
		b.productMatrix(7);
		
		Q3 q3 = new Q3();
		int[] k = {2,5,7,6};
//		q3.incPosArray(k);
//		System.out.println(q3);
		q3.incPosArray(k);
		//a.incPosArray(intr);
		
		
		//Put your test code here
		
	}
}
