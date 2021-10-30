
public class Q2 {
	
	public static boolean isZero(int a, int b) {
		boolean isZero;
		if ((a==0) || (b==0)) {
			isZero = true;
		}
		else {
			isZero = false;
		}
		return isZero;
	}
	
	public static boolean isNegative(int a, int b) {
		boolean isNegative;
		if ((a<0) || (b<0)) {
			isNegative = true;
		}
		else {
			isNegative = false;
		}
		return isNegative;
	}
	
	public static int toFahrenheit(int celsius) {
		double toFahrenheit = (9.0/5.0) * (double)celsius + 32;
		return (int)toFahrenheit;
	}
	
	public static String multString(String s, int n) {
		int i;
		String multString = "";
		for (i=0; i<n; i++) {
			multString += s;
		}
		return multString;
	}

	public static void main(String[] args) {
		
		int a = -1;
		int b = 0;
		
		System.out.println(isZero(a, b));
		System.out.println(isNegative(a,b));
		
		int celsius = 5;
		System.out.print(toFahrenheit(celsius));
		
		
		

	}

}
