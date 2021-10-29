
public class R18 implements IR18 {

	@Override
	public String starString(int x) {
		if (x==0) {
			return "";
		}
		return "*"+ starString(x-1);

	}

	@Override
	public void starPattern(int x) {
		if (x==0) {
			return;
		}
		
		System.out.println(starString(x));
		starPattern(x-1);	
		
	}

	@Override
	public boolean palindrome(String word) {
		if (word.length() == 1 || word.length() == 0) {
			return true;
		}
		if (word.charAt(0) == word.charAt(word.length()-1)) {
			return palindrome(word.substring(1, word.length()-1));
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[]){
		R18 rec = new R18();
		rec.starPattern(5);

		System.out.println();
		System.out.println ("\'x\' is a palindrome?: " + rec.palindrome("x"));
		System.out.println("\'car\' is a palindrome?: " + rec.palindrome("car"));
		System.out.println("\'racecar\' is a palindrome?: " + rec.palindrome("racecar"));
		System.out.println("\'hannah\' is a palindrome?: " + rec.palindrome("hannah"));
		System.out.println("\'banana\' is a palindrome?: " + rec.palindrome("banana") + "\n");
	}

}
