
public class Example_1_2_24 {

	public static void main(String[] args) {
		int t = 10; // Период действия вклада
		double P = 1000.00; // Колличество доллров 
		double r = 0.08; // процент
		
		
		System.out.println((double)Math.pow((P*(1 + r)),t));
		System.out.println(P*(double)Math.exp(r*t));
	}
}
