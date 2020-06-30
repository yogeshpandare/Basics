import java.util.Arrays;

public class RemoveDupsArr {

	public static void main(String[] args) {
		Integer[] orgArr = new Integer[] { 8, 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };

		System.out.println(Arrays.toString(orgArr));

		Integer[] tempArr = remDups(orgArr);

		System.out.println(Arrays.toString(tempArr));
	}

	private static Integer[] remDups(Integer[] orgArr) {

		for (int i = 0; i < orgArr.length - 1; i++) {
			if (orgArr[i] == orgArr[i + 1]) {
				orgArr[i] = null;
			}
		}

		return orgArr;
	}

}
