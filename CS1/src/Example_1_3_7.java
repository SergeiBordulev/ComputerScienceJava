
public class Example_1_3_7 {
	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=0 , j=0 ; i<10 ; i++ )  j += i;

		// j = j + i (0 + 1 = 1
		// 1 + 2 = 3
		// 3 + 3 = 6 
		// 6 + 4 = 10
		// 10 + 5 = 15
		// 15 + 6 = 21
		// 21 + 7 = 28 
		// 28 + 8 = 36
		// 36 + 9 = 45
		
		System.out.println("End 1 : " + j);		
		System.out.println("- -");
		
		for(i=0, j=1; i<10; i++) j += j;
		// j = j + j (1 + 1 = 2)
		// 2 + 2 = 4
		// 4 + 4 = 16
		// 16 + 16 = 32
		// 32 + 32 = 64
		// 64 + 64 = 128
		// 128 + 128 = 256
		// 256 + 256 = 512
		// 512 + 512 = 1024
		System.out.println("End 2 : " + j);
		
		System.out.println("- - - ");
		
		for(j=0; j<10 ;j++) {
			j += j ;
			System.out.println(j);};
		// j=0
		// j=1 ... 1+1=2 (j = j + j) ... j=2
		// j=2 ... 3+3=6 ... j=6
		// j=6 ... 7+7=14 ... j=14
		// j=14 ... j++ ... j=15
		// the condition j<10 is not met. End programm

		System.out.println("End 3 : " + j);
		System.out.println("- - - -");
		
		for(i=0, j=0 ; i<10 ; i++) j += j++;
		System.out.println("End 4 : " + j);
		
	}
}
