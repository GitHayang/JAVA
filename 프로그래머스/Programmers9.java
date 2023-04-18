import java.util.Arrays;

public class Quiz_P3 {
	public static void main(String[] args) {
		solution("a B z", 4);
	}

//	대문자 : 65~90,  소문자 : 97~122
	public static String solution(String s, int n) {
		String answer = "";

		char arr[] = new char[s.length()];
		int arrNum[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i);
		}

		for (int i = 0; i < arrNum.length; i++) {
			if ((int) arr[i] >= 65 && (int) arr[i] <= 90 && (int) arr[i] + n > 90) {
				arrNum[i] = ((int) arr[i] + n) - 26;
			} else if ((int) arr[i] >= 65 && (int) arr[i] <= 90 && (int) arr[i] + n <= 90) {
				arrNum[i] = (int) arr[i] + n;
			} else if ((int) arr[i] >= 97 && (int) arr[i] <= 122 && (int) arr[i] + n > 122) {
				arrNum[i] = ((int) arr[i] + n) - 26;
			} else if ((int) arr[i] >= 97 && (int) arr[i] <= 122 && (int) arr[i] + n <= 122) {
				arrNum[i] = ((int) arr[i] + n);
			} else if((int) arr[i]==32) {
				arrNum[i] = arr[i];
			}
		}

		for (int i = 0; i < arrNum.length; i++) {
			arr[i] = (char) arrNum[i];
			answer = answer + arr[i];
		}
		System.out.println(answer);

		return answer;
	}
}
