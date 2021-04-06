import java.util.Scanner;

public class ConfidenceInterval {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("Question: \n");
		System.out.println(
				"You survey 100 Brits and 100 Americans about their television-watching habits, and find that both groups watch an average of 35 hours of television per week.");
		System.out.println("Find the 95% Confidence Interval.");

		System.out.println("\nPlease enter the sample mean (X̄): \t"); // sample mean/pop. mean

		double samp = stdin.nextDouble();

		System.out.println("Please enter the critical value: \t");

		double crit = stdin.nextDouble();

		System.out.println("Please enter the standard deviation of the sample (σ): \t");
		double stdev = stdin.nextDouble();

		System.out.println("Please enter the population size: \t"); // sample mean/pop. mean

		double pop = stdin.nextDouble();

		stdin.close();

		double ci, ci2;

		ci = samp + crit * stdev / Math.sqrt(pop);

		ci2 = samp - crit * stdev / Math.sqrt(pop);

		System.out.println("The lower and upper bounds of the 95% confidence interval are: " + ci2 + " and " + ci);
	}
}


// sample mean: 35
// critical value: 1.96 (from z-score)
// standard dev: 5
// population size: 100