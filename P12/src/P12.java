import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class P12 implements IMaze{
	
	
	public char[][] helper(char[][] maze, String[] s, int length, int width, int zero, int zero2){
		if (zero2 == length) {
			System.out.println(Arrays.toString(maze));
			return maze;
		}
		
		if (zero == width) {
			return helper(maze, s, length, width, 0, zero2+1);
		}

		maze[zero2][zero] = s[zero2].charAt(zero);
		
		return helper(maze, s, length, width, zero+1, zero2);
		
	}
	
//	public char[][] readFile(String filename) {
//	char[] s = null;
//	Scanner scan = null;
//	File file = new File(filename);
//	try {
//		scan = new Scanner(file);
//		char[][] maze = new char[scan.nextInt()][scan.nextInt()];
//		scan.nextLine();			
//
//				while (scan.hasNextLine()) {
//					for (int i = 0; i<maze.length; i++) {	
//						s = scan.nextLine().toCharArray();							
//							for (int j = 0; j <maze[i].length; j++) {
//								maze[i][j] = s[j];
//							}
//
//					}
//				}
//
//		scan.close();
//		return maze;
//		
//	} catch (FileNotFoundException e) {
//		return null;
//	}
//		
//}

	@Override
	public char[][] readFile(String filename) {
		int length, width;
		
		Scanner scan = null;
		File file = new File(filename);
		try {
			scan = new Scanner(file);
			length = scan.nextInt();
			width = scan.nextInt();
			char[][] maze = new char[length][width];
			System.out.println(Arrays.toString(maze));
			String[] s = new String[length];
			scan.nextLine();
			int i = 0;
			while(scan.hasNextLine()) {
				 s[i] = scan.nextLine();
				// System.out.println(Arrays.toString(s));
				 i++;
			}
			System.out.println(Arrays.toString(maze));
			//System.out.println(Arrays.toString(s));
			
			scan.close();
			return helper(maze, s, length, width, 0, 0);
			
			
		} catch (FileNotFoundException e) {
			return null;
		}
			
	}

	@Override
	public int[] findStart(char[][] maze) {
		
		return null;
	}

	@Override
	public String findPath(char[][] maze, int[] startPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printMaze(char[][] maze) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
	
		P12 s = new P12();
		s.readFile(args[0]);
				
		
	}

}













//public char[][] readFile(String filename) {
//	char[] s = null;
//	Scanner scan = null;
//	File file = new File(filename);
//	try {
//		scan = new Scanner(file);
//		char[][] maze = new char[scan.nextInt()][scan.nextInt()];
//		scan.nextLine();			
////			for (int i = 0; i<maze.length; i++) {										
////				for (int j = 0; j <maze[i].length; j++) {
//				while (scan.hasNextLine()) {
//					for (int i = 0; i<maze.length; i++) {	
//						s = scan.nextLine().toCharArray();
//						System.out.println(Arrays.toString(s));
//						//for (int i = 0; i<maze.length; i++) {										
//							for (int j = 0; j <maze[i].length; j++) {
//								maze[i][j] = s[j];
//								//System.out.println(Arrays.toString(maze));
//							}
//							System.out.println(Arrays.toString(maze));
//					}
//						//}
//				}
//				//}
//				
//			//}
//		
//		scan.close();
//		return maze;
//		
//	} catch (FileNotFoundException e) {
//		return null;
//	}
//		
//}
