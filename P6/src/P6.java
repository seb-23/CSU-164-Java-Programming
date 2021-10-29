

public class P6 {

    // Class variables
    public static Maze maze;
    public static int mazeWidth;
    public static int mazeHeight;

    public static void main(String[] args) {

        // Create maze
        String fileName = args[0];
        System.err.println("Maze name: " + fileName);

        // Get dimensions
        maze = new Maze(fileName);
        mazeWidth = maze.getWidth();
        mazeHeight = maze.getHeight();
        System.err.println("Maze width: " + mazeWidth);
        System.err.println("Maze height: " + mazeHeight);

        // Add code to move around maze  
        
        
        int s;
        
        for (s=maze.getRow(); s <= maze.getHeight() - 1; s++) {
        	
        	while (maze.getColumn() < maze.getWidth() - 1) {
        		
        		if (maze.moveRight() == false) {
            		maze.moveDown();
            		maze.moveRight();
            		maze.moveRight();
            		maze.moveUp();
            	}
          	
        	  else if ((maze.getColumn() != mazeWidth - 1) && (maze.getRow() % 2 == 0)) {
          		maze.moveRight();         		
          		}
        		
        	  else {
        		  maze.moveDown();
        	  }
        	}
        	
//        	int k;
//          for (k=maze.getColumn(); k < maze.getWidth()-1; k++) {
//        	  
//        	  if (maze.moveRight() == false) {
//            		maze.moveDown();
//            		maze.moveRight();
//            		maze.moveRight();
//            		maze.moveUp();
//            	}
//          	
//        	  else if ((k != mazeWidth - 1) && (maze.getRow() % 2 == 0)) {
//          		maze.moveRight();
//          		System.out.println(8);
//          	}
          		
//          	else if (maze.moveRight() == false) {
//          		maze.moveDown();
//          		maze.moveRight();
//          		maze.moveRight();
//          		maze.moveUp();
//          	}
//          		
//          	else {
//          		maze.moveDown();
//          		}
//          		
//          	}
//          
//          maze.moveDown();
//        	
//        int k;
//        for (k=maze.getColumn(); k < mazeWidth - 1; k++) {
//        	
//        	if ((maze.getRow() % 2 == 0) && (k != maze.getWidth() - 1)) {
//        		maze.moveRight(); 
//        		System.out.println(9);
//        	}
//        		
//        	else if (maze.moveRight() == false) {
//        		maze.moveDown();
//        		maze.moveRight();
//        		maze.moveRight();
//        		maze.moveUp();
//        	}
//        		
//        	else {
//        		
//        		}
//        		
//        	}
//        	
//        }  
//        
//        maze.moveDown();
        	
        	while (maze.getColumn() > 0) {
        		
        		if (maze.moveLeft() == false) {
            		maze.moveDown();
            		maze.moveLeft();
            		maze.moveLeft();
            		maze.moveUp();
            	}
          	
        	  else if ((maze.getColumn() != 0) && (maze.getRow() % 2 != 0)) {
          		maze.moveLeft();         		
          		}
        		
        	  else {
        		  maze.moveDown();
        	  }
        	}
        	        	
		        
      
//        int j;
//        
//        for (j=maze.getColumn(); j > 0; j--) {
//        	
//        	if (maze.getRow() % 2 != 0) {
//        		maze.moveLeft();
//        	}
//        	
//        	else {
//        		maze.moveDown();
//        		maze.moveLeft();
//        		maze.moveLeft();
//        		maze.moveUp();
//        	}
//        }
//        
//        maze.moveDown();
        
        }
    }
}
        
        
        
        
        
        	
        
    
    


//int i;
//i = maze.getColumn();

//do {
//
//if ((maze.getRow() % 2 == 0) && (i != maze.getWidth() - 1)) {
//	maze.moveRight();
//}
//	
//else {
//	maze.moveDown();
//	maze.moveRight();
//	maze.moveRight();
//	maze.moveUp();
//}
//}
//
//while (i != 4);
//
//
//
//maze.moveDown();

//if ((maze.getRow() % 2 == 0) && (k != maze.getWidth() - 1))


