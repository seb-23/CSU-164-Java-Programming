
public class R17 implements IR17 {

	@Override
	public int pracSeq1(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return 2 * pracSeq1(n-1);
		}
	}

	@Override
	public int sequence2(int n) {
		if (n==0) {
			return 1;
		}
		if (n==1) {
			return 2;
		}
		if (n==2) {
			return 3;
		}
		
		
		return sequence2(n-1) + sequence2(n-2) + sequence2(n-3);
		
		
	}

	@Override
	public int sequence3(int n) {
		if (n==0) {
			return 1;
		}
		if (n==1) {
			return 2;
		}
		if (n==2) {
			return 7;
		}
		
		return 2*sequence3(n-1) + 3*sequence3(n-2);
	}
	
	public static void main(String[] args) {

		R17 rec = new R17();
		System.out.println("pracSeq1(int x):");
		System.out.println("Answer: " + rec.pracSeq1(5) + "   Expecting: 32");
		System.out.println("Answer: " + rec.pracSeq1(7) + "   Expecting: 128\n");

		System.out.println("sequence(int x):");
		System.out.println("Answer: " + rec.sequence2(4) + "   Expecting: 11");
		System.out.println("Answer: " + rec.sequence2(5) + "   Expecting: 20\n");

		System.out.println("sequence3:");
		System.out.println("Answer: " + rec.sequence3(2) + "   Expecting: 7");
		System.out.println("Answer: " + rec.sequence3(3) + "   Expecting: 20");
		System.out.println("Answer: " + rec.sequence3(6) + "   Expecting: 547\n");

	}

}
