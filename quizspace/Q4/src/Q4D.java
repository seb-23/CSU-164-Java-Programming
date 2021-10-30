import java.util.ArrayList;

public class Q4D implements IQ4D {
	
	public ArrayList<Integer> helper2(ArrayList<Integer> num, int atIndex, int value) {
		if (atIndex==0) {
			num.add(0, value);
			return num;
		}
		
		num.add(atIndex, value);
		
		return num;
	}
	
	public int helper(ArrayList<Integer> num, int atIndex, int finalIndex) {
		int value = 0;
		
		if (atIndex > finalIndex) {
			return 0;
		}
		
		
		value = (int) Math.pow(num.get(atIndex), 3);
				
		helper2(num, atIndex, value);	
		
	
		return value + helper(num, atIndex+2, num.size()-1);

	}

	@Override
	public int sumOfCubes(ArrayList<Integer> num) {
		if (num.isEmpty()) {
			return 0;
		}
		
		return helper(num, 0, num.size());
	}
	
	public static void main(String[] args) {
		Q4D s = new Q4D();
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(2);
		num.add(3);
		System.out.println(s.sumOfCubes(num));
		System.out.println(num);

	}

}
