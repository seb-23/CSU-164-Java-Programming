import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Sebastian Infantes */

public class Cloud {
	private ArrayList<Point> points;	
    private boolean debug = false;
	

	/**
	 * Given Constructor
	 */
	public Cloud(){
		points = new ArrayList<Point>();
	}

	public void setDebug(Boolean debug){
		this.debug = debug;	
	}
	

	//TODO Implement Cloud.isEmpty
	/**
	 * @return whether cloud is empty or not
	 */
	public boolean isEmpty(){
		if (this.points.isEmpty()) {
			return true;
		}


		return false;
	}


	//TODO Implement Cloud.size
	/**
	 * @return number of points in the cloud
	 */
	public int size(){
		return points.size();
	}

	
	//TODO Implement Cloud.hasPoint
	/**
	 * 
	 * @param p a Point
	 * @return whether p in the cloud
	 */
	public boolean hasPoint(Point p){
		for (int i =0; i < points.size(); i++) {
			
			if (p.equals(points.get(i))) {
				return true;
			}
		
	}
		return false;
	}

	//TODO Implement Cloud.addPoint
	/**
	 * 
	 * @param p
	 * if p not in points, add p ***at the end*** of points (to keep same order)

	 */
	public void addPoint(Point p){
		if (!hasPoint(p)) {
			points.add(p);
		}
				
	}

	//Given Cloud.toString
	public String toString(){
		return points.toString();
	}

	//TODO Implement Cloud.extremes
	/**
	 * 
	 * @return an array of doubles: left, right, top, and bottom of points, 
	 *         null for empty cloud
	 */
    public double[] extremes(){

        double[] k = new double[4];

        if (this.points.isEmpty()) {

            return null;

        }

        

                

        for (int i = 0; i < points.size(); i++) {

            

            double minX = points.get(0).getX();

            double maxX = points.get(points.size()-1).getX();

            double minY = points.get(0).getY();

            double maxY = points.get(points.size()-1).getY();

            

            if (minX >= points.get(i).getX()) {

                k[i] = points.get(i).getX();

            }

            

            else if (maxX <= points.get(i).getX()) {

                k[i] = points.get(i).getX();

            }

            

            else if (minY >= points.get(i).getY()) {

                k[i] = points.get(i).getY();

            }

            

            else if (maxY <= points.get(i).getY()) {

                k[i] = points.get(i).getY();

            }

            

            else {

                

            }

        }

                    

        return k;        

        

    }

    

    //TODO Implement Cloud.centerP

    /**

     * 

     * @return: if (cloud not empty) create and return the center point

     *          else null;

     */

    public Point centerP(){

    	double k = 0.0;

    	double t = 0.0;

    	

        if (!points.isEmpty()) {

        	for (int i = 0; i<points.size(); i++) {

        		k += points.get(i).getX()/(double)points.size();

        		t += points.get(i).getY()/(double)points.size();

        	}

        	
        	Point r = new Point(k,t);
        	
        	return r;

        }

        

        else {

        	

        return null;

        

        }


    }


	//TODO Implement Cloud.minDist
	/**
	 * 
	 * @return minimal distance between 2 points in the cloud
	 *         0.0 for a cloud with less than 2 points
	 */
	public double minDist(){
		
		double k = Double.MAX_VALUE;
		
		if (points.size() > 1) {
			
						
			for (int i = 1; i < points.size(); i++) {							
				

				if (points.get(i-1).euclidDist(points.get(i)) < k) {
					k = points.get(i-1).euclidDist(points.get(i));

				}
				
				
			}
		}
			
			else {
				
				return 0.0;
				
				}
				
				if (points.get(0).euclidDist(points.get(2)) < k) {
					k = points.get(0).euclidDist(points.get(2));

				}
				
				if (points.get(0).euclidDist(points.get(3)) < k) {
					k = points.get(0).euclidDist(points.get(3));

				}
				
				if (points.get(1).euclidDist(points.get(3)) < k) {
					k = points.get(0).euclidDist(points.get(3));

				}
				return k;
			}
			
		
	

	//TODO Implement Cloud.crop
	/**
	 * 
	 * @param p1 
	 * @param p2
	 * 
	 * all Points outside the rectangle, line or point spanned
	 * by p1 and p2 are removed
	 *  
	 */
	public void crop(Point p1, Point p2){
		double up, down, right, left;
		
		if (p1.getX() > p2.getX()) {
			right = p1.getX();	
			left = p2.getX();
		}
		
		else {
			left = p1.getX();	
			right = p2.getX();
		}
		
		if (p1.getY() > p2.getY()) {
			up = p1.getY();	
			down = p2.getY();
		}
		
		else {
			down = p1.getY();	
			up = p2.getY();
		}
		
		
		for (int i = points.size()-1; i >=0; i--) {
			
			if (points.get(i).getX() > right || points.get(i).getX() < left) {
				points.remove(i);
			}
			
			else if (points.get(i).getY() > up || points.get(i).getX() < down) {
				points.remove(i);
			}
			
			else {
				
			}
			
		}
		
		
 	}
 
	

	/**
	 * @param args:no args
	 */
	public static void main(String[] args) {

		Cloud cloud = new Cloud();
		
		cloud.setDebug(false);
		System.out.println("cloud.debug OFF");
		System.out.println("cloud: " + cloud);
		
		if(!cloud.isEmpty())
			System.out.println("Error: cloud should be empty!");
		
		if(cloud.extremes()!=null)
			System.out.println("Error: extremes should be null!");
		
		if(cloud.minDist()!=0.0)
			System.out.println("Error: minDist should return 0.0!");

			
		Point p31 = new Point(3.0,1.0);
		cloud.addPoint(p31);
		
		Point p22 = new Point(2.0,2.0);
		cloud.addPoint(p22);
			
		Point p42 = new Point(4.0,2.0);
		cloud.addPoint(p42);
		
		Point p33 = new Point(3.0,3.0);
		cloud.addPoint(p33);

		System.out.println("cloud 1: " + cloud);
		
		System.out.println("center point in cloud: " + cloud.centerP());

		System.out.println("cloud: " + cloud);
		System.out.println("cloud 2: " + cloud);
		

		Point p77 = new Point(7,7);
		if (cloud.hasPoint(p77))
			System.out.println("Error: point " + p77 + " should not be in cloud!");
		else
			System.out.println("OK: point " + p77 + " is not in cloud");

		double[] extrs = cloud.extremes();
		if(extrs!=null){
			System.out.println("left: " + extrs[0]);
		    System.out.println("right: " + extrs[1]);
		    System.out.println("top: " + extrs[2]);
		    System.out.println("bottom: " + extrs[3]);
		}
		double minD = cloud.minDist();			
		System.out.printf("min dist in cloud: %5.3f \n", minD);				
		
		System.out.println("Test cloud with 1 point");
		Cloud cloud1 = new Cloud();
		Point p = new Point();
		cloud1.addPoint(p);
	    minD = cloud1.minDist();
		System.out.printf("min dist in cloud1: %5.3f \n",  minD);

	}

}
