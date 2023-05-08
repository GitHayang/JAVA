import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//수열의 길이 n
//더하기 기호의 숫자 m
//각 숫자가 더해지는 최대 횟수 k
//1~1000
//숫자들을 k번씩 총m+1번 더해서 나오는 가장 큰 수를 구해라
public class Q1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("n");
		int n = scanner.nextInt();
		System.out.println("m");
		int m = scanner.nextInt();
		System.out.println("k");
		int k = scanner.nextInt();

		Integer arr[] = new Integer[n];

		System.out.println("숫자입력");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int sum = 0;
		int count = 0;

		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			sum = sum + arr[i] * k;
			count = count + k;
			if (count == (m + 1)) {
				break;
			}
		}

		System.out.println(sum);

	}
}
