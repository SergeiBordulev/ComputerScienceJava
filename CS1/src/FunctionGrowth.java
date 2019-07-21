/******************************************************************************
 *  Exercises 1.3.12:
 *  Write a program FunctionGrowth.java that prints a table of the values of ln n, n, n ln n, n2, n3, and 2n for n = 16, 32, 64, ..., 2048. Use tabs ('\t' characters) to line up columns.
 *  
 *  Compilation:  javac FunctionGrowth.java
 *  Execution:    java FunctionGrowth
 *	Author Book: Robert Sedgewick and Kevin Wayne
 *	
 *	
 *  Print out log n, n log n, n^2, n^3, 2^n for n = 2, 4, 8, ..., 2048.
 *
 *  % java FunctionGrowth
 *  n		log n				n log n				n^2			n^3				2^n
 *  16		2.772588722239781 	44.3614195558365 	256.0		4096.0			32
 *  32		3.4657359027997265 	110.90354888959125 	1024.0		32768.0			64
 *  64		4.1588830833596715 	266.168517335019 	4096.0		262144.0		128
 *  128		4.852030263919617 	621.059873781711 	16384.0		2097152.0		256
 *  256 	5.545177444479562 	1419.565425786768 	65536.0		1.6777216E7		512
 *  512		6.238324625039508 	3194.022208020228 	262144.0	1.34217728E8	1024
 *  1024	6.931471805599453 	7097.82712893384 	1048576.0	1.073741824E9	2048
 *  2048	7.6246189861593985 	15615.219683654448 	4194304.0	8.589934592E9	4096
 *  
 ******************************************************************************/


public class FunctionGrowth {
	public static void main(String[] args) {
	
		System.out.println("n" + "\t" + "log n" + "\t" + "n log n" + "\t" + "n^2" + "\t" + "n^3" + "\t" + "2^n");
		for(int n = 16; n <= 2048; n=n*2) {
			System.out.println(n + "\t" + Math.log(n) + " \t " + n*Math.log(n) + " \t" + Math.pow(n, 2) + "\t" + Math.pow(n, 3) + "\t" + 2*n);	
		}
	}
}
