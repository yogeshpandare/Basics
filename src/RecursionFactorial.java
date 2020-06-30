import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		System.out.println("Enter a number to be get factorial of: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(factorial(n));
	}

	static int factorial(int n) {
		if (n == 1) {
			System.out.println("factorial(" + n + ")=" + n);
			return 1;
		}
		System.out.println("factorial(" + n + ")=" + n + "*factorial(" + (n - 1) + ")");
		int fact = factorial(n - 1) * n;
		return fact;
	}

}