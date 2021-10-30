import java.util.ArrayList;
import java.util.Arrays;

public class Q4C implements IQ4C{
	
	
	public ArrayList<Integer> helper2(ArrayList<Integer> num, int atIndex, int value) {
		
		num.add(atIndex+1, value);
		
		
		return num;
	}
	
	
	
	public int helper(ArrayList<Integer> num, int atIndex, int finalIndex) {
		
		int k = 0;
		
		if (atIndex > finalIndex) {
			return 0;
		}
		
		
		k = (int) Math.pow(num.get(atIndex), 2);
		
		helper2(num, atIndex, k);
		
		return (int) Math.pow(num.get(atIndex), 2) + helper(num, atIndex+2, num.size()-1);
		
		
	}


	
	@Override
	public int sumOfSquares(ArrayList<Integer> num) {
		if (num.isEmpty()) {
			return 0;
		}
		
		
		return helper(num,  0, num.size()-1);
		
		
	}
	
	public static void main (String[] args) {
		Q4C s = new Q4C();
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println(s.sumOfSquares(num));
		System.out.println(num);
		
	}
	
	

}