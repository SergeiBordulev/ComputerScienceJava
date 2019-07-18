		
// Great Circle (1.2.33. )
// Running the program from the command line
// step 1 : javac GreatCircle.java
// step 2 : java GreatCircle x1 x2 y1 y2
// Example : java GreatCircle 48.87 2.33 37.8 122.4
// Author: Sergey Bordulev
// E-mail: skm2003@yandex.ru
// web: alfa-vista.ru

public class GreatCircle {
	public static void main(String[] args) {
		
		double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);
		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
				
		double d = Math.toDegrees(Math.acos((Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2)))+(Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2)))*( Math.cos(Math.toRadians(y1)-Math.toRadians(y2)))));
		
		System.out.println("GreatCircle");
		System.out.println("Distance : " + (60 * d) + " (mill)");
		
	}
}
