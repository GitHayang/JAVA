
public class Quiz_P2 {
	public static void main(String[] args) {
		solution(5);
	}

	public static int solution(int n) {
		int answer = 0;
		int arr[] = new int[n + 1];

		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0) {
				arr[i] = i;
			}
		}

		for (int i = 1; i < n + 1; i++) {
				answer = answer + arr[i];
		}

		System.out.println(answer);

		return answer;
	}
}
