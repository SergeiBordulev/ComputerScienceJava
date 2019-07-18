
public class Example_1_2_30 {
	public static void main(String[] args) {
		double a = Math.random();
		double b = Math.random();
		
		System.out.println(Math.min(a, b));
		System.out.println(((((a+b)/2) - Math.min(a, b))/2)+ Math.min(a, b));
		System.out.println((a+b)/2);
		System.out.println(((((a+b)/2) - Math.max(a, b))/2)+ Math.max(a, b));
		System.out.println(Math.max(a, b));
	}
}
