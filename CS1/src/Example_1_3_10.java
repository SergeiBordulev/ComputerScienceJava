
public class Example_1_3_10 {
	public static void main(String[] args) {
		int n = 15; // Integer.parseInt(args[0]);
		double t = 0.00;
		
		for(int i = 1; i < n ; i++) {
			double v = 0.00;
			
			if(v>=t) {
				v = Math.random();
				System.out.println("v: " + v + " - t: " + t);
				
				}
			t=v;
		}
		
		/*
		System.out.println(Math.min(a, b));
		System.out.println(((((a+b)/2) - Math.min(a, b))/2)+ Math.min(a, b));
		System.out.println((a+b)/2);
		System.out.println(((((a+b)/2) - Math.max(a, b))/2)+ Math.max(a, b));
		System.out.println(Math.max(a, b));
		*/
		
		
		
	}
}
