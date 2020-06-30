import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneDir = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phoneDir.put(name, phone);
		}

		while (in.hasNext()) {
			String s = in.next();
			if (phoneDir.containsKey(s)) {
				System.out.println(s + "=" + phoneDir.get(s));
			} else
				System.out.println("Not found");
		}

		in.close();
	}
}
