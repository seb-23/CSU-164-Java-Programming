// P8 Assignment
// Author: Sebastian Infantes
// Date:   10/15/2018
// Class:  CS 164
// Email:  sebby23@rams.colostate.edu

public class Transforms implements ImageInterface {
	
	PictureLibrary pc = null;
	int width = 0;
	int height = 0;
	int[][] data;
	
	public Transforms(){
        //Instantiate PictureLibrary object
		pc = new PictureLibrary();
    }

@Override
public void readImage(String inFile) {
	try {
		pc.readPGM(inFile);
		height = pc.getHeight();
		width = pc.getWidth();
		data = pc.getData();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
	
}

@Override
public void writeImage(String outFile) {
	pc.setData(data);
	try {
		pc.writePGM(outFile);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}

@Override
public int[][] imageData() {
	// TODO Auto-generated method stub
	return data;
}

@Override
public void decode() {
	for (int i=0; i<data.length; i++) {
		for (int j=0; j<data[i].length; j++) {
			int k = data[i][j];
			
			int s = k /16;
		
			int d = k % 16;
			
			int r = 15 - s;
			
			data[i][j] = (r * 16) + d;
		
		}
		
	}
	
}

@Override
public void swap() {
	for (int i=0; i<height; i++) {
		for (int j=0; j<width; j++) {
			int k = data[i][j];
			
			int u = k & 0b11000000;

			int m = k & 0b00111100;
		
			int b = k & 0b00000011;
			
			data[i][j] = (u >> 6) | m | (b << 6);
		
		}
	}
	
}

@Override
public void mirror() {
	for (int i=0; i < height/2; i++) {
			int[] tempVal = data[height - 1 - i];
			
			data[height - 1 - i] = data[i];
			
			data[i] = tempVal;
						
		}
	}
	


@Override
public void exchange() {
	for (int i = 10; i < 310; i++) {
		for (int j = 10; j < 160; j++) {
			int k = 300;
			int tempVal = data[i][k + j];
			data[i][k + j] = data[i][j];
			data[i][j] = tempVal;
			
		}
	}
	
	
}


}


