import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to be reversed: ");
		int num = in.nextInt();
		int revNum = 0;
		/*
		 * while (num != 0) { revNum = revNum * 10 + num % 10; num = num / 10; }
		 */

		for (; num != 0; ) {
			revNum = revNum * 10 + num % 10;
			num /= 10;
		}
		System.out.print("Reversed number: " + revNum);
	}

}
