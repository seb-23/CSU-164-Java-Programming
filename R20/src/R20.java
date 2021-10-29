import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class R20 {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		LinkedBookList lbl = new LinkedBookList();
		
		Scanner scan = new Scanner(new File("top10.txt"));
		int bookCount = (Integer.parseInt(scan.nextLine()));
		
		//reads in all of the books, and adds them to the linked list
		for(int i = 0; i < bookCount; i++){
			String line = scan.nextLine();
			String[] parts = line.split("\t");
			String title = parts[0];
			String author = parts[1];
			int numPages = Integer.parseInt(parts[2]);
			Book b = new Book(title, author, numPages);
			lbl.add(b);
			
		}
		
		Book c = new Book("Test", "Test",111);
		
		
		System.out.println("Testing add");
		//System.out.println(lbl);
//		lbl.add(c, 8);
//		lbl.remove(c);
		System.out.println(lbl);
		lbl.remove(0);
		System.out.println
		
		scan.close();
	}
}
