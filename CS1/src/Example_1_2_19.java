
public class Example_1_2_19 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int randomA = ((int) (Math.random() * b));
		int randomB = ((int) (Math.random() * b));
		
		System.out.println("Value randomA : " + randomA);
		System.out.println("Value randomB : " + randomB);
		System.out.println(randomA + randomB);

	}
}
