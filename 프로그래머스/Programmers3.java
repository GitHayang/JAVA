import java.util.Arrays;
import java.util.Random;

public class Programmers3 {
	public static void main(String[] args) {

		solution(1);

	}

	public static int solution(int num) {

		int answer = 0;
		double sum = num;
		int cnt = 0;
		for (int i = 0; i <= 501; i++) {
			if (i == 0 && sum == 1) {
				cnt = 0;
				break;
			} else if (sum == 1) {
				break;
			} else if (sum % 2 == 0) {
				sum = (sum / 2);
				cnt++;
			} else if (sum % 2 != 0) {
				sum = (sum * 3) + 1;
				cnt++;
			} 
			if (i >= 500) {
				cnt = -1;
				break;
			}
		}
		answer = cnt;
		return answer;
	}
}