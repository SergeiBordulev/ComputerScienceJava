		
// Mercator projection 
// Running the program from the command line
// step 1 : javac MercatorProjection.java
// step 2 : java MercatorProjection longitudeOfZeroMeridian longitude latitude
// Example : java MercatorProjection 10.00 83.008469 55.0134991
// Author: Sergey Bordulev
// E-mail: skm2003@yandex.ru
// web: alfa-vista.ru


public class MercatorProjection {
	public static void main(String[] args) {
		
		double longitudeOfZeroMeridian = Double.parseDouble(args[0]);
		double longitude = Double.parseDouble(args[1]);
		double latitude = Double.parseDouble(args[2]); 
		
		double x = longitude - longitudeOfZeroMeridian;
		
		double y = (double)1/2*Math.log((1+Math.sin(latitude)) / (1-Math.sin(latitude)));
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
