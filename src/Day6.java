// Day 6 from Hackerrank tutorials
import java.util.Scanner;

public class Day6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int j = in.nextInt();
		in.nextLine();

		while (j > 0) {

			String str = in.nextLine();
			for (int n = 0; n < str.length(); n += 2) {
				System.out.print(str.charAt(n));
			}
			System.out.print(" ");
			for (int n = 1; n < str.length(); n += 2) {
				System.out.print(str.charAt(n));
			}
			System.out.println();
			j--;
		}

	}
}
