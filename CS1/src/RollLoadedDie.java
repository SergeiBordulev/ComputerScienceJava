
public class RollLoadedDie {
	public static void main(String[] args) {
		
		// 0.125 = 1/8
		// 0.375 = 3/8
		
		
		// int random = (a + (int)(Math.random() * b));
		
		double r = Math.random();
		
		int roll;
		if 		(r < 1.0/8.0) 	roll = 1; // 0.125
		else if (r < 2.0/8.0) 	roll = 2; // 0.25
		else if (r < 3.0/8.0) 	roll = 3; // 0.375
		else if (r < 4.0/8.0) 	roll = 4; // 0.5
		else if (r < 5.0/8.0) 	roll = 5; // 0.625
		else 					roll = 6;

		System.out.println(roll);
	}
}
