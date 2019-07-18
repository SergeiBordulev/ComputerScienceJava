
public class RGBtoCMYK {
	public static void main(String[] args) {
		
		int r = 124; // Integer.parseInt(args[0]);
		int g = 10; // Integer.parseInt(args[1]);
		int b = 2; // Integer.parseInt(args[2]);
		
		// r/255 // 124/255=0.4862
		// g/255 // 10/255=0.0392
		// b/255 // 2/255=0.0078
		
		// 0.5332
		
		double w = (Math.max((double)(Math.max(r/255, g/255)), (double)(Math.max(g/255, b/255)) )); // w = 0.73
		double c = (w - (r / 255.0)) / w;
		double m = (w - (g / 255.0)) / w;
		double y = (w - (b / 255.0)) / w;
		double k = 1.0 - w; 
		
		System.out.println("c : " + c + ";");
		System.out.println("m : " + m + ";");
		System.out.println("y : " + y + ";");
		System.out.println("k : " + k + ";");
		
		System.out.println("RGBtoCMYK = 33 ; 100 ; 80 ; 27");
        
	}
}
