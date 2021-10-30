
import java.util.Scanner;

public class Q0 {

	public static void main(String[] args) {
		
		double assign0;
		double assign1;
		double assign2;
		double assign3;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First assignment: ");
		assign0 = scan.nextDouble();
		
		System.out.print("Second assignment: ");
		assign1 = scan.nextDouble();
		
		System.out.print("Third assignment: ");
		assign2 = scan.nextDouble();
		
		System.out.print("Fourth assignment: ");
		assign3 = scan.nextDouble();
		
		double assignAverage;
		assignAverage = (assign0 + assign1 + assign2 + assign3)/4;
		
		System.out.printf("Assignment average: %,.2f", assignAverage);
		System.out.println(" ");
						
		scan.close();
		
		
	}

}
