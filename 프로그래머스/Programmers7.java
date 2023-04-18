import java.util.Arrays;

public class Quiz_P1 {
	public static void main(String[] args) {
		solution(3, 21);
	}

	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		int arr[] = new int [m+n];
		for (int i = 1; i < m+n; i++) {
			if (n % i == 0 && m % i == 0) {
				arr[i] = i;
			}
		}
		
		Arrays.sort(arr);
		answer[0] = arr[m+n-1];
		answer[1] = (m*n)/answer[0];

		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
