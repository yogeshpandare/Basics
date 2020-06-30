import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 2, 7, 2, 1, 5, 9 };
		Arrays.sort(arr);

		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j] = arr[arr.length - 1];

		for (int i = 0; i < j + 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
