
public class R12 implements RecitationInterface {
	
	PictureLibrary pc = null;
	int width = 0;
	int height = 0;
	int[][] data;
	
	public R12(){
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
				
		return data;
	}
	
	@Override
	public void negateImage() {
		for (int i=0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = pc.MAXVAL - data[i][j];
		}
			
	}
		
	}
	@Override
	public void increaseContrast() {
		for (int i=0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if ((0 <= data[i][j]) && (data[i][j]<= 127)) {
					data[i][j] -= 16;
					if (data[i][j] < 0) {
						data[i][j] = 0;
					}
				}
				if ((128 <= data[i][j]) && (data[i][j] <= pc.MAXVAL)) {
					data[i][j] += 16;
					if (data[i][j] > pc.MAXVAL) {
						data[i][j] = pc.MAXVAL;
					}
				}
			}
		}
		
	}
		


	@Override
	public void decreaseContrast() {
		for (int i=0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if ((0 <= data[i][j]) && (data[i][j]<= 127)) {
					data[i][j] += 16;
				}
				if ((128 <= data[i][j]) && (data[i][j] <= pc.MAXVAL)) {
				data[i][j] -= 16;
				}
		
	}
	
	

}

	}
}
