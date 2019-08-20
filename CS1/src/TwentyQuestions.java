
public class TwentyQuestions {
	public static void main(String[] args) {
		// Программа генерирует число и реагирует на догадки, пока пользователь пытается угадать число.
		int secret = 1 + (int) (Math.random() * 1000000); // Загаданное число
		StdOut.print("I'm thinking of a number ");
		StdOut.println("between 1 and 1.000.000");
		int guess = 0; // догадка пользователя
		while (guess != secret) { // Программа запрпшивает догадку и выводит ответ
			StdOut.print("What's you guess?");
			guess = StdIn.readInt();
			if (guess == secret) StdOut.println("You win!");
			if (guess < secret) StdOut.println("Too low ");
			if (guess > secret) StdOut.println("Too high ");
		}
	}
}
