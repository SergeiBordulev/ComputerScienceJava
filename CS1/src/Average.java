
public class Average {
	public static void main(String[] args) { // Вычисление среднего для чисел из стандартного ввода
		double sum = 0.0;
		int n = 0;
		StdOut.println("Enter a floating point number. Press Ctrl+Z to finish.");
		while(!StdIn.isEmpty()) { // Чтение числа из стандартного ввода и прибавление его к sum
			double value = StdIn.readDouble();
			sum += value; // накопленная сумма
			n++; // количество прочитанных чисел
		}
		double average = sum / n;
		StdOut.println("Average is " + average);
	}
}
