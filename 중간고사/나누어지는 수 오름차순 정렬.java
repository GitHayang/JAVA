import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Q5 {
	public static void main(String[] args) {

		int target = 5;
		int arr[] = { 5, 5, 9, 7, 11, 15 };

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList());

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % target == 0) {
				count++;
			}
		}

		int arr2[] = new int[count];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % target == 0) {
				list.add(arr[i]);
			}
		}

		Collections.sort(list);

		HashSet<Integer> hs = new HashSet<Integer>(list);

		list.clear();

		list.addAll(hs);

		if (list.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println(list);
		}

	}
}
