import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Maze implements IMaze {
	
	
	public char[][] readFile(String filename) {
        int length, width;
    	
        
        Scanner scan = null;
        File file = new File(filename);
        try {
            scan = new Scanner(file);
            length = scan.nextInt();
            width = scan.nextInt();
            char[][] maze = new char[length][width];
            char[] t = new char[width];
            scan.nextLine();
            int j = 0;
            while(scan.hasNextLine()) {
            	//scan.nextLine().getChars(0, width, t, 0);
            	t = scan.nextLine().toCharArray();
//                System.out.println(Arrays.toString(t));
                
            	for(int i = 0; i < width; i++) {
            		maze[j][i] = t[i];
            		//System.out.print(maze[j][i]);
            	}
            	//System.out.println("");
            	
            	j++;

            }
            
            scan.close();
            return maze;

            
            
        } catch (FileNotFoundException e) {
            return null;
        }
	}

	

	public int[] findStart(char[][] maze) {
		for (int i = 0; i<maze.length; i++) {
			for (int j=0; j<maze[i].length; j++) {
				if (maze[i][j] == 'S') {
					int[] startPosition = {i, j};
					return startPosition;
				}
		
			}
		}
		
		return null;
	}
	
	
    private String recPath(char[][] maze, int i, int j) {
    	if (maze.length < i || i<0 || maze[0].length < j || j<0) {
    		return "";
    	}
    	
    	if (maze[i][j]=='#' || maze[i][j]=='.') {
    		return "";
    	}
    	
    	if (maze[i][j]=='G') {		
    		return "G";
    	}
    	
    	
    	if (maze[i][j] != 'S') {
    		maze[i][j] = '.';
    	}
    	
		if (maze[i-1][j] == ' ' || maze[i-1][j] == 'G') {
			i--;						
			return "U" + recPath(maze, i, j);
		}
		
		
		if (maze[i][j+1] == ' ' || maze[i][j+1] == 'G') {
			j++;
			return "R" + recPath(maze, i, j);
		}
		
		if (maze[i+1][j] == ' ' || maze[i+1][j] == 'G') {
			i++;
			return "D" + recPath(maze, i, j);
		}
		
		if (maze[i][j-1] == ' '|| maze[i][j-1] == 'G') {
			j--;
			return "L" + recPath(maze, i, j);
		}
		
		maze[i][j] = 'X';		
		
		return "";
    	
    }


	public String findPath(char[][] maze, int[] startPosition) {
		String s = "";
		s = recPath(maze, startPosition[0], startPosition[1]);
		
		if (!s.endsWith("G")) {
	        for(int i = 0; i < maze.length; i++) {
	        	for (int j = 0; j < maze[i].length; j++) {
	        		if (maze[i][j] == '.') {
	        			maze[i][j] = 'X';
	        		}
	        	}
	        }
	        	        		
			return recPath(maze, startPosition[0], startPosition[1]);
		}
		
        				
		return s;
	}

	public String printMaze(char[][] maze) {
		String s = "";
            
        for(int i = 0; i < maze.length; i++) {
        	for (int j = 0; j < maze[i].length; j++) {
        		if (maze[i][j] == 'X') {
        			maze[i][j] = ' ';
        		}

        		s += maze[i][j];
        		 
        	}

        	s += "\n";
        }
        
       	
		return s;
	}
	
    public static void main(String[] args) {
        
        Maze s = new Maze();
        char[][] maze;
        int[] startPosition;
        maze = s.readFile(args[2]);
        startPosition = s.findStart(maze);
        System.out.println(Arrays.toString(startPosition));
        System.out.println(s.findPath(maze, startPosition));
        System.out.println(s.printMaze(maze));
        
    }

}