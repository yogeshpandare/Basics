import java.util.Arrays;

// O(nlogn)

public class FindDuplicatesArrayMergeSort {

	public static void main(String[] args) {
		int arr[] = { 1, 9, 3, 2, 5, 6, 2 };
		hasDups(arr);
	}

	private static void hasDups(int[] arr) {
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Array has duplicates: " + arr[i]);
			}
		}
	}

}
