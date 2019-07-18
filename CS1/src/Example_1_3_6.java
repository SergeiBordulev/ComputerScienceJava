
public class Example_1_3_6 {
	public static void main(String[] args) {
		
		double T = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		
		if ( T > 50) {
			if ((v > 120) || (v < 3)) {
				System.out.println(35.74+(0.6215*T)+(((0.4275*T)-35.75)*(double)Math.pow(v, 0.16)));
			}
			else System.out.println("Value 'v' is out of range");
			
		}
		else System.out.println("Value 'T' is out of range");
	}
}
