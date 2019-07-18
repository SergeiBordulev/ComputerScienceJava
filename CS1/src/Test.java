
public class Test {

	public static void main(String[] args) {
		int a1, b1;
		a1 = 2;
		
		int t1 = a1; b1 = t1; a1 = b1;
		
		System.out.println("Value a1: " + a1 + "; " + "Value b1: " + b1 + "; " + "Value t1: " + t1 +";");
		
		System.out.println();
		System.out.println("1.2.3.");
				
		boolean a2 = false;
		boolean b2 = false;
		
		System.out.println((!(a2&&b2) && (a2||b2)) || ((a2&&b2) || !(a2||b2)));
		
		System.out.println();
		System.out.println("1.2.4.");
		int a3,b3;
		
		
		System.out.println();
		System.out.println("1.2.7.");
		System.out.println(2 + "bc");
		System.out.println(2 + 3 + "bc");
		System.out.println((2+3) + "bc");
		System.out.println("bc" + (2+3));
		System.out.println("bc" + 2 + 3);
		
		System.out.println();
		System.out.println("1.2.9.");
		
		
		System.out.println('b'); // Вызывается метод PrintStream.println(char x)
		System.out.println('b' + 'c'); // Так как имеется арифметическая операция вызывается метод PrintStream.println(int x)
		System.out.println(((int)'b') + " + " +((int)'c'));
		System.out.println((char) ('a' + 4)); // Сперва производится арифметическое действие, а потом это арифметическое действие принудительно приводится к типу char
		
		// Двойные кавычки используются для строк
		// Одинарные кавычки используются для символов
		
		System.out.println();
		System.out.println("1.2.10.");
		
		int a4 = 2147483647;
		
		System.out.println(a4); // 2147483647 наибольшее значение int
		System.out.println(a4 + 1); // -2147483648 - пошел на второй круг
		System.out.println(2 - a4); // -2147483645
		System.out.println(-2 - a4); // 2147483647
		System.out.println(2 * a4); // -2
		System.out.println(4 * a4); // -4
		
		System.out.println();
		System.out.println("1.2.11.");
		
		double a5 = 3.14159;
		
		System.out.println(a5); // 3.14159 = вызывается метод PrintStream.println(double d) так как а5 является типом double
		System.out.println(a5+1); // 4.14159 = 1 приводится к типу double = 1.0 и вызывается метод PrintStream.println(double d) 
		System.out.println(8/(int) a5); // 2 = a5 приводится к типу int 3, далее произвоится деление (2.5464812403910124), и целове значение выводится
		System.out.println(8/a5); // 2.5464812403910124 = 8 приводится к типу double = 8.0 и вызывается метод PrintStream.println(double d) 
		System.out.println((int) (8/a5)); // 2 = производится деление, а уже после значение приводится к типу int.
		
		System.out.println();
		System.out.println("1.2.13.");
		
		System.out.println(Math.sqrt(2)*Math.sqrt(2)==2);
		
		System.out.println();
		System.out.println("1.2.17.");
		
		int a6 = 1;
		System.out.println(a6 = a6 + a6); // 2
		System.out.println(a6 = a6 + a6); // 4
		System.out.println(a6 = a6 + a6); // 8
		
		boolean a7 = true;
		System.out.println(a7 = !a7); // false
		System.out.println(a7 = !a7); // true
		System.out.println(a7 = !a7); // false
		
		int a8 = 2;
		System.out.println(a8 = a8 * 2); // 4
		System.out.println(a8 = a8 * 2); // 8
		System.out.println(a8 = a8 * 2); // 16
		
	}
}
