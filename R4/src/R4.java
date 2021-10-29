import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		
		double positiveRoot;
		double negativeRoot;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter coefficient A: ");
		A = scan.nextInt();
		System.out.print("Enter coefficient B: ");
		B = scan.nextInt();
		System.out.print("Enter coefficient C: ");
		C = scan.nextInt();
	
		System.out.println("Formula: "+A+"x^2 +"+B+ "x +"+ C);
		
		System.out.print("Positive Root: " );
		positiveRoot = (-B+Math.sqrt(B*B-4*A*C))/2*A;
		System.out.println(positiveRoot);
		
		System.out.print("Negative Root: ");
		negativeRoot =(-B-Math.sqrt(B*B-4*A*C))/2*A;
		System.out.print(negativeRoot);
		
		scan.close();
		

	}

}
