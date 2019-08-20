
public class AddInts {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		StdOut.println("Enter " + n + " integers ... ");
		for(int i = 0; i < n; i++) {
			int value = StdIn.readInt(); // Проверка подключения новой библиотеки
			sum += value;
		}
		StdOut.println("Sum is " + sum); // Проверка подключения новой библиотеки
	}
}
