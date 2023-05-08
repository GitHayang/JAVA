import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

// 순서 바꿔서 동일하면 T, 아니면 F
public class Q5_2 {
	public static void main(String[] args) {

		int target[] = { 1, 1, 2, 3, 4, 6 };
		int arr[] = { 6, 1, 2, 1, 4, 3 };

		Arrays.sort(target);
		Arrays.sort(arr);

		ArrayList<Integer> target2 = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList());

		for (int i = 0; i < target.length; i++) {
			target2.add(target[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			arr2.add(arr[i]);
		}

		boolean result = Arrays.equals(target2.toArray(), arr2.toArray());

		if (result == true) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}

	}
}
