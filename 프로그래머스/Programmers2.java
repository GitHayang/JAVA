import java.util.Arrays;
import java.util.Random;

public class Programmers2 {
	public static void main(String[] args) {

		solution(10);

	}

	public static boolean solution(int x) {

		String num = Integer.toString(x);
		String arr[] = num.split("");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + Integer.parseInt(arr[i]);
		}
		boolean answer = true;
		
		if(x%sum==0) {
			answer = true;
		}else if(x%sum!=0) {
			answer = false;
		}
		
		System.out.println(answer);
		return answer;
	}
}