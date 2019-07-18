
public class Example_1_2_29 {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		int yy = y -(14 - m) /12;
		
		int x = yy + yy / 4 - yy / 100 + yy / 400;
		
		int mm = m + 12 * ((14 - m)/12) -2;
		
		int dd = (d + x + (31 * mm) / 12)%7;
		
		System.out.println(dd);
	}
}
