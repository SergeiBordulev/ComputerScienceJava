
public class Example_1_2_23 {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		
		System.out.println((m == 3) && (d >= 20) || (m == 4) && (d <= 30) || (m == 5) && (d <= 30) || (m == 6) && (d <= 20));
		

	}
}
