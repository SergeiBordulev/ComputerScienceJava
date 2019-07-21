
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
		
/*
 * public class FivePerLine { 
	public static void main(String[] args) {
		// print integers from 1000 to 2000, 5 per line
	int START = 1000;
	int END   = 2000;
	int PER_LINE = 5;
	for (int i = START; i <= END; i++) {
		System.out.print(i + " ");
    	if ((i + 1) % PER_LINE == 0) System.out.println();
	}
	System.out.println();
   }
}*/
	
	
	
	}
}
