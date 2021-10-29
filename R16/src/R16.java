import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class R16 {
//	public void EXAMPLE() {
//	PrintWriter PW = new PrintWriter("File");
//	
//	}
	
	public void readFile( String inputFile ){ 
		Scanner scan = null;
		try {
			File file = new File(inputFile);
			scan = new Scanner(file);

			while (scan.hasNext()) {
				if (scan.hasNextInt()) {
					System.out.println("Integer: " + scan.nextInt());
				}
				else if (scan.hasNextDouble()){
					System.out.println("Double: " + scan.nextDouble());
				}
				else {
					System.out.println("String: " + scan.next());
				}
			}
				
		}  catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan.close();
		
	}

	public void writeFile( String outputFile ){ 
		String s, r;
		PrintWriter pw = null;
		s = "stop";
		r = "STOP";
		try {
			File file = new File(outputFile);
			pw = new PrintWriter(file);
			System.out.println("Enter text: ");
			Scanner input = new Scanner(System.in);
			while (input.hasNextLine()) {
				String f = input.nextLine();
				if (f.equals(r) || f.equals(s)) {
					break;
				}
				else {
				pw.println(f);
				}
									
			}
			pw.close();
			input.close();
			
			}  catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
	

	public static void main(String[] args) {
		R16 r = new R16();
		
		r.readFile(args[0]);
		r.writeFile(args[1]);

	}

}
