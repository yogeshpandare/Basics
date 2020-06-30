import java.util.HashSet;
import java.util.Set;

// O(1)

public class FindDuplicatesArraySet {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 1, 2, 3, 8, 9, 4 };
		Set<Integer> s = new HashSet<>();

		for (int num : arr) {
			if (s.add(num) == false) {
				System.out.print(num + " ");
			}
		}

	}

}
