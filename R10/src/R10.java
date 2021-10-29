
public class R10 {
	
	public static double circleArea(double radius) {
		double circleArea = Math.PI * Math.pow(radius, 2);
		return circleArea;
	}
	
	public static double sphereVolume(double sphereRadius) {
		double sphereVolume = (4.0/3.0) * Math.PI * Math.pow(sphereRadius, 3);
		return sphereVolume;
	}
	
	public static int round(double positive) {
		double round = Math.floor(positive + 0.5);
		
		return (int)round;
		
	}
	
	public static String reverseCase(String input) {
		
		String returnValue = "";
		int i;
		
		for (i=0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
			returnValue += Character.toLowerCase(input.charAt(i));
			
			}
			if (Character.isLowerCase(input.charAt(i))) {
				returnValue += Character.toUpperCase(input.charAt(i));
				
				}
			else {
				returnValue += input.charAt(i);
			}
			
		}
		
		return returnValue;
							
	}
	
	
	

	public static void main(String[] args) {
		
		double radius = 2.0;
		System.out.println(circleArea(radius));
		
		double sphereRadius = 3.0;
		System.out.println(sphereVolume(sphereRadius));
		
		double positive = 3.5;
		System.out.println(round(positive));
		
		String input = "What up America? 5.0";
		System.out.print(reverseCase(input));

	}

}
