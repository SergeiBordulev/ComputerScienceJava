
public class Example_1_2_34 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		int first = Math.max((Math.max(a, b)), (Math.max(b, c)));	
		int other = Math.min((Math.min(a, b)), (Math.min(b, c)));
		int second = (( a + b + c ) - first ) - other;
		
		System.out.println(other + " - " + second + " - " + first);
	}
}
