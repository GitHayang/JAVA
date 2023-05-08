import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("입력횟수");
		int n = scanner.nextInt();

		String arr[] = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner2.nextLine();
			String arr2[] = arr[i].split("");
			int count = 0;
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j].equals("A")) {
					count++;
				}
			}
			System.out.println(count);
		}

	}
}
