
public class Example_1_2_27 {
	public static void main(String[] args) {
		double u = Math.random();
		double v = Math.random();
		
		
//		array2[ij+1]=           sin(2*PI*array1[ij+1])*pow((-2)*log(array1[ij]),(1/2));

		System.out.println(Math.sin(2*Math.PI*v)*Math.pow(((-2)*Math.log(u)), (1/2)));
	}
}
