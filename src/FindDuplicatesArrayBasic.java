public class FindDuplicatesArrayBasic {

// O(n2) - Brute Force

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 7, 2, 1, 5, 9, 9 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.print(arr[j] + " ");
				}
			}

		}

	}

}
