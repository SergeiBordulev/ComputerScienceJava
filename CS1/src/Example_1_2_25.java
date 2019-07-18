
public class Example_1_2_25 {
	public static void main(String[] args) {
		
		double T = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		
		
		System.out.println(35.74+(0.6215*T)+(((0.4275*T)-35.75)*(double)Math.pow(v, 0.16)));

	}
}
