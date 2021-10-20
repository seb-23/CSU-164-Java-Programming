import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Interface.java: Interface for Temperature Analysis
// Author: Sebastian Infantes
// Date:   11/02/2018
// Class:  CS164
// Email:  sebby23@rams.colostate.edu

public class P10 implements Interface {

	@Override
	public Temperature[] readTemperatures(String filename) {
		Temperature[] temperature = null;
		File file = new File(filename);
		Scanner scan = null;
		
		try {
			scan = new Scanner(file);
			temperature = new Temperature[scan.nextInt()];
			for(int i = 0; i < temperature.length; i++) {
				
				temperature[i] = new Temperature(scan.next(), scan.next(), scan.nextDouble(), scan.nextDouble());
			}	
			scan.close();	
			//return temperature;
			
			
		} catch(Exception e) {
			System.out.println("Invalid");
		}
		
		return temperature;
		
	
	}

	@Override
	public double findMinimum(Date start, Date end, Temperature[] data) {
		double min = Double.MAX_VALUE;
		for(int i =0; i < data.length; i++) {
			Temperature t = data[i];
			if (t.inInterval(start, end)) {
				if (t.temperature < min) {
					min = t.temperature;
				}
			}
			
		}
		
		
		return min;
	}

	@Override
	public double findMaximum(Date start, Date end, Temperature[] data) {
		double max = Double.MIN_VALUE;
		for(int i = 0; i < data.length; i++) {
			Temperature m = data[i];
			if(m.inInterval(start, end)) {
				if(m.temperature > max) {
					max = m.temperature;
				}
			}
		}
		return max;
	}

	@Override
	public double findAverage(Date start, Date end, Temperature[] data) {
		double k = 0;
		double count = 0.0;
		for(int i=0; i<data.length; i++) {
			Temperature w = data[i];
			if(w.inInterval(start, end)) {
				k += w.temperature;
				count++;
			}
		}
		double average = k/count;
		return average;
	}

	@Override
	public double findHighest(Date start, Date end, Temperature[] data) {
		double highestWspeed = Double.MIN_VALUE;
		for (int i = 0; i<data.length; i++) {
			Temperature s = data[i];
			if (s.inInterval(start, end)) {
				if (s.windspeed > highestWspeed) {
					highestWspeed = s.windspeed;
				}
			}
		}
		return highestWspeed;
	}

	public static void main(String[] args) {
	    
	    // Instantiate student code
	    P10 p10 = new P10();
	    
	    // Test readTemperatures
	    Temperature[] data = p10.readTemperatures(args[0]);
	    
	    //Arrays.toString(data);
	    
	    // Test findMinimum
	    Date start = Temperature.createDate("04-Jul-2008", "06:00");
	    Date end = Temperature.createDate("17-Aug-2010", "23:00");
	    System.out.println("Verifying findMinimum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Minimum = %.1f degrees\n", p10.findMinimum(start, end, data));
	    
	    
//
//	    // Test findMaximum 
	    start = Temperature.createDate("19-Sep-2011", "07:00");
	    end = Temperature.createDate("23-Mar-2015", "13:00");
	    System.out.println("Verifying findMaximum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Maximum = %.1f degrees\n", p10.findMaximum(start, end, data));
//
//	    // Test findAverage
	    start = Temperature.createDate("09-Apr-2006", "19:00");
	    end = Temperature.createDate("31-Oct-2013", "10:00");
	    System.out.println("Verifying findAverage method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Average = %.1f degrees\n", p10.findAverage(start, end, data));

//	    // Test findHighest
	    start = Temperature.createDate("01-Jan-2015", "00:00");
	    end = Temperature.createDate("31-Dec-2015", "23:00");
	    System.out.println("Verifying findHighest method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Highest windspeed = %.1f\n", p10.findHighest(start, end, data));
	}

	}

