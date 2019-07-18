
public class Hellos {
	public static void main(String[] args) {
		
		
		int a = Integer.parseInt(args[0]);
		int i = 1;
				
		while (i <= a) {
			if (i==1) System.out.println("1st Hello!");
			else if (i==2) System.out.println("2nd Hello!");
			else if (i==3) System.out.println("3rd Hello!");
			else if (i % 100 == 0) {
				System.out.println(i + "--th Hello!");
			}
			else if (i % 10 == 0) {
				System.out.println(i + "-th Hello!");
			}
			else System.out.println(i + "th Hello!");
			i += 1;
		}
	}
}
