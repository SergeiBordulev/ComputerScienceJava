
public class Example_1_3_2 {
	public static void main(String[] args) {
		double a = 4;
		double b = 22;
		double c = 4;
		
		if (a == 0) System.out.println("Division by Zero");
		else {		
			double discriminant = Math.pow(b, 2) - (4 * (a *c)) ;
			System.out.println(discriminant);
			if (discriminant < 0) System.out.println("Discriminant by Zero");
			
			if (discriminant > 0) {
				double x1 = (-b + Math.sqrt(discriminant))/(2*a);
				System.out.println(x1);
				double x2 = (-b - Math.sqrt(discriminant))/(2*a);
				System.out.println(x2);
			};
		};
	}
}
