import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesArrayHashMap {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 1, 2, 3, 8, 9, 4 };
		Map<Integer, Integer> hMap = new HashMap<>();

		for (int num : arr) {
			Integer count = hMap.get(num);
			if (count == null) {
				hMap.put(num, 1);
			} else {
				count = count + 1;
				hMap.put(num, count);
			}

		}

	}

}
