import java.util.ArrayList;

public class P11 implements IP11 {
	
	//i=hyphen
	//k=stars
	
	public String stripe(int n) {
		if (n>0) {
		

		return "-" + stripe(n-1);
		}
				
		else {
			return "";
		}
	}
	
	public String star(int n) {
		if (n>0) {
		

		return "*" + star(n-1);
		}
				
		else {
			return "";
		}
	}
	
	public void lines(int n, int k) {
		if (k<0) {
			return;
		}
		System.out.println(star(n) + stripe(k));
		lines(n+1, k-1);
		
	}

	@Override
	public void printPattern(int n) {
		
		if (n==0) {
			return;
		}

		lines(0, n);
	}
	

	
	public int result(int[] num, int atIndex, int lastIndex, int result1) {
		if (num[atIndex] >= 0 && num[atIndex] <=9) {
			if (atIndex == lastIndex) {
				return num[lastIndex];
		
			}
			result1 = (int) (num[atIndex] * Math.pow(10, lastIndex-atIndex));
		
			return result1 + result(num, atIndex+1, lastIndex, result1);
		}
		
		if (atIndex >= lastIndex) {
			return 0;
		}
		
		return 0;
	}

	@Override
	public int convertNum(int[] num) {
		if (num.length>0) {
			return result(num, 0, num.length-1, 0);
		}
		
		else {
			return 0;
		}
	}
	
	public ArrayList<String> helper(ArrayList<String> AL1, ArrayList<String> AL2, ArrayList<String> AL3, int s, int k, int al1, int al2) {
		
		if (s > al1 || s > al2) {
			return AL3;
		}
		

		
		if (AL1.get(s).contains(AL2.get(k))) {
			
			AL3.add(AL1.get(s));
			
			return helper(AL1, AL2, AL3, s, k+1, al1, al2);
		}
		
		else {
			return helper(AL1, AL2, AL3, s+1, k, al1, al2);
		}
	}

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		ArrayList<String> AL3 = new ArrayList<String>();
		
		if (AL1.isEmpty() || AL2.isEmpty()) {
			return null;
		}
		
		
		return helper(AL1, AL2, AL3, 0, 0, AL1.size()-1, AL2.size()-1);
		
		
		
	}
	
	public static void main(String[] args) {
		
		P11 s = new P11();
		s.printPattern(5);
		int[] k = {1,2,3};
		System.out.println(s.convertNum(k));
		
		  P11 A3 = new P11();
		  ArrayList<String> AL1 = new ArrayList<String>();
		  ArrayList<String> AL2 = new ArrayList<String>();
		  AL1.add("a"); AL1.add("b"); AL1.add("c");
		  AL2.add("b"); AL2.add("c"); AL2.add("d"); AL2.add("e");
		  ArrayList<String> intersect = A3.intersection(AL1,AL2);
		  System.out.println(AL1 + " intersect " + AL2 + " = " + intersect);	
	}

	
//	String s = starHyphen(i+1, n-i, k) + "-";
//	if(s.length() > k) {
//		s.substring(0, 1);
//		return s + "\n";
//	}
//	//return starHyphen(i+1, n-i, k) + "-";
//	return s;
}
