
public class Example_1_2_15 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("Value a : " + a);
		System.out.println("Value b : " + b);
		System.out.println("Value c : " + c);
		
		System.out.println(!(a+b <= c) && !(a + c <= b) && !(b + c <= a));
	}
}
