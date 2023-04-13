import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers6 {
	public static void main(String[] args) {
		// 배열은 무조건 짝수
		int num[] = { 3,3,3,2,2,2 };
		solution(num);
	}

	public static int solution(int[] nums) {
		// 내가 택할 수 있는 포켓몬 수
		int answer = 0;
		int choice = nums.length / 2;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					nums[j] = -1;
				}
			}
		}

		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				cnt++;
			}
		}
		
		if(cnt>=choice) {
			answer = choice;
		}else if(cnt<choice){
			answer = cnt;
		}
		System.out.println(answer);
		return answer;
	}
}