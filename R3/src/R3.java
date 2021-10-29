// R3
// Author: Sebastian Infantes
// Date:   08/28/2018
// Class:  CS164
// Email:  sebby23@rams.colostate.edu

public class R3 {

	public static void main(String[] args) {
			
				char c0 = '$';
				char c1 = 'W';
				byte b0 = 15;
				byte b1 = 4;
				short s0 = 5577;
				short s1 = 1234;
				int i0 = 12345;
				int i1 = -99999;
				long l0 = 8000000000l;
				long l1 = -7000000000l;
				float f0 = 1.2345f;
				float f1 = 66.7788f;
				double d0 = 0.00001;
				double d1 = 83475.29837;
				
				System.out.println(b0 + b1);
				System.out.println((b0 + b1) / 4);
				System.out.println((b0 + b1) / 4.0);
				
				/* Java can accurately divide integers when a .0 is added to 
				 * the end of the integer. If a .0 is not added then it will 
				 * divide to the nearest whole number and exclude the 
				 * remainder.  
				 * .75 is the remainder in (b0 + b1) / 4) and (b0 + b1) / 4.0)
				 */
				System.out.println(s0 / 1000);
				System.out.println(s0 / 1000.0);
				/* .5777 is the remainder */
				
				System.out.println(s1 % 100);
				/*In (s1 % 100) the remainder is equal to 34 and the whole 
				 * number is excluded. */
				
				System.out.println((i0 - 2345) * l0);
				System.out.println(i0 - 2345 * l0);
				/* The oder of operations is altered when the parenthesis are
				 * not present, in these two equations. */
				
				System.out.println(l1 + i1);
				System.out.println((f0 + f1) / (d0 * d1));
				System.out.println(0.1 + 0.2 - 0.3);
				/* The translation is still in double format. */
				
				System.out.println(6 % 4 + 12 - 3 * (8 + 3) / 2);
				/* Possibly */
				
				c0++;
				c1++;
				
				System.out.println(c0 + "," + c1);
				System.out.println("5577 + 1234 = " + s0 + s1);
				System.out.printf("5577 + 1234 = %d\n",s0 + s1);
				System.out.printf("0.00001 + 83475.29837 = %.2f\n",d0+d1);
				System.out.printf("0.00001 + 83475.29837 = %.5f\n",d0+d1);


	}

}
