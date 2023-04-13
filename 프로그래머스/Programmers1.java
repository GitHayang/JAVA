import java.util.Arrays;

public class Programmers1 {
	public static void main(String[] args) {
		int array[] = { 1, 5, 2, 6, 3, 7, 4 };
		int commands[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		solution(array, commands);

	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] arr = new int[array.length];
			int count = 0;
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				arr[j] = array[j];
				if (arr[j] != 0) {
					count++;
				}
			}
			Arrays.sort(arr);
			int re[] = new int[arr.length];
			int cc = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] != 0) {
					re[cc] = arr[k];
					cc++;
				}
			}

			answer[i] = re[commands[i][2] - 1];
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
