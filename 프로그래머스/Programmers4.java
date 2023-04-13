import java.util.Arrays;
import java.util.Random;

public class Programmers4 {
	public static void main(String[] args) {
//		1<=n<=50000000000000;
		solution(4);

	}

	public static long solution(long n) {
		long answer = 0;

		double num = Math.sqrt(n);

		if (num != (int) num) {
			answer = -1;
		} else {
			answer = (long) Math.pow(num + 1, 2);
		}

		System.out.println(answer);
		return answer;
	}
}