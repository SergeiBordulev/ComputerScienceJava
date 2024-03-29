
public class Factors {
	public static void main(String[] args) {
		long n = Long.parseLong(args[0]);
		for(long factor = 2; factor <= n; factor++) {
			while (n % factor == 0) {
				n = n / factor; // n/= factor
				System.out.print(factor + " ");
			}
		}
		if(n > 1) System.out.print(n);
		System.out.println();
	}
}
