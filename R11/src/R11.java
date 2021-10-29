import java.util.Arrays;

public class R11 {
	
	public static void arrayAverage(double[] a) {
		
		int i;
		double average = 0;
		for (i=0; i < a.length; i++) {
			average += a[i];
		}
		System.out.printf("%.3f", average /= (a.length));
	}

	public static void main(String[] args) {
		double[] grades = {81.2, 92.5, 48.9, 78.8, 45.5};		
		
		int[] numbers = {12, 42, 33, 67, 92, 58, 33};
		
		String[] arguments = new String[9];
		
		System.out.println(grades.length);
		System.out.println(numbers.length);
		System.out.println(arguments.length);
		
		System.out.println(grades[0]);
		System.out.println(grades[2]);
		System.out.println(numbers[6]);
		
		grades[3] = 90.5;
		numbers[2] = 99;
		
		int i;
		
		for (i=0; i<6; i++) {
			arguments[i] = "Java";
		}
		
		for (i=6; i < arguments.length; i++) {
			arguments[i] = "C++";
		}
		
		for (i=0; i < grades.length; i++) {
			System.out.print(grades[i] + ",");
		}
		
		System.out.println("");
		
		for (i=0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("");
		
		for (i=0; i < arguments.length; i++) {
			System.out.print(arguments[i] + "_");
		}
		
		System.out.println("");
		
		System.out.println(Arrays.toString(grades));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(arguments));
		
		arrayAverage(grades);
		
	}

}
