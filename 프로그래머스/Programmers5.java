import java.util.Arrays;

public class Programmers5 {
	public static void main(String[] args) {
		solution("TRY   HELLO          WORLDS ");
	}

	public static String solution(String s) {
		// 공백이 연달아 있을 경우 지워야한다.
		String answer = "";
		String[] str = s.split(" ",-1);
		String[][] string = new String[str.length][];

		String ss = "";
		for (int i = 0; i < str.length; i++) {
			ss = str[i];
			string[i] = ss.split("");
		}

		for (int i = 0; i < string.length; i++) {
			for (int j = 0; j < string[i].length; j++) {
				if (j % 2 == 0) {
					string[i][j] = string[i][j].toUpperCase();
				} else if (j % 2 != 0) {
					string[i][j] = string[i][j].toLowerCase();
				}
			}
			str[i] = String.join("", string[i]);
		}

		String s1 = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i] != "") {
				if(i==0) {
					s1 = s1 + str[i];
				}else {
					s1 = s1 + " " + str[i];
				}
//			System.out.println(s1);
			}
		}

		answer = s1;
		System.out.println(answer);
		return answer;

	}
}