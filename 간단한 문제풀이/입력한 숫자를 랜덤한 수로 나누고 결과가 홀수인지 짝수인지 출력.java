package forms;

//입력한 숫자를 랜덤한 수로 나누고 결과가 홀수인지 짝수인지 출력

import java.util.Random;
import java.util.Scanner;

public class form8 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();

		int me = s.nextInt();
		int ran = r.nextInt(11);

		for (int i = 0; i < 9999; i++) {
			if (me > 101 || me < 0) {
				System.out.println("범위를 벗어났습니다.");
			}

			int result = (me / ran);

			if (result % 2 == 1) {
				System.out.println("입력한 숫자 : " + me + "를 " + ran + "으로 나눈 숫자는 " + result + "입니다");
				System.out.println("홀수입니다");
				break;
			} else {
				System.out.println("입력한 숫자 : " + me + "를 " + ran + "으로 나눈 숫자는 " + result + "입니다");
				System.out.println("짝수입니다.");
				break;
			}
		}

	}
}
