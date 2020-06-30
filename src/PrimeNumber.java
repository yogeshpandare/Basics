import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
