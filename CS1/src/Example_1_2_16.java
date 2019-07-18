
public class Example_1_2_16 {

	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		
		System.out.println("Value x : " + x);
		System.out.println("Value y : " + y);
		
		System.out.println(Math.sqrt(x-0.0) + Math.sqrt(y-0.0));
	}
}
