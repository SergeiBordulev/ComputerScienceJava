
public class Gambler {
	public static void main(String[] args) {
		int stake = Integer.parseInt(args[0]); // Stake sum
		int goal = Integer.parseInt(args[1]); // Goal sum
		int trials = Integer.parseInt(args[2]); // Trials
		int bets = 0; // Bets
		int wins = 0; // Wins
		for (int t = 0; t < trials; t++) {
			int cash = stake;
			while (cash > 0 && cash  < goal) {
				bets++;
				if(Math.random() < 0.5) cash++;
				else 					cash--;
			}
			if (cash == goal) wins++;
		}
		System.out.println(100*wins/trials +  "% wins");
		System.out.println("Avr # bets: " +  bets/trials);
	}
}
