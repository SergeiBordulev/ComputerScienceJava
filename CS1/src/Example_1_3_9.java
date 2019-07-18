
public class Example_1_3_9 {
	public static void main(String[] args) {
		
		for(int i=1000; i < 2000; i++) {
			if (i>0) {
				System.out.print("String - " + (i));
				System.out.print(" String - " + (i+1));
				System.out.print(" String - " + (i+2));
				System.out.print(" String - " + (i+3));
				System.out.println(" String - " + (i+4));
				i=i+4;
			}
		};
	}
}
