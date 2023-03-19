package forms;

// 입력한 숫자에 랜덤한 숫자를 더하고
// 컴퓨터의 경우 랜덤한 두수를 더해서 더 큰 쪽이 이기는 게임

import java.util.Random;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class form5 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		Random r2 = new Random();
		Random r3 = new Random();

		for (int i = 0; i < 99999; i++) {

			int me = s.nextInt();
			int com = r.nextInt(101);

			System.out.println("랜덤 숫자 게임");
			System.out.println("0~100까지의 숫자를 입력하세요");

			if (me > 100 || me < 0) {
				System.out.println("입력범위 초과");
				continue;
			}

			int ranMe = r2.nextInt(101);
			int ranCom = r3.nextInt(101);

			int resultMe = me + ranMe;
			System.out.println("------------");
			System.out.println("사용자의 숫자는 : " + me + " 추가된 숫자는 : " + ranMe + " 합계 : " + resultMe);

			for (int k = 0; k < 9999; k++) {
				if (ranMe == ranCom) {
					continue;
				} else if (ranMe != ranCom) {
					int resultCom = (com + ranCom);// 컴 숫자에 랜덤 수 추가
					System.out.println("컴퓨터의 숫자는 : " + com + " 추가된 숫자는 : " + ranCom + " 합계 : " + resultCom);
					if (resultMe > resultCom) {
						System.out.println("사용자 : 컴퓨터 = " + resultMe + " : " + resultCom + " 승리");
					} else if (resultMe < resultCom) {
						System.out.println("사용자 : 컴퓨터 = " + resultMe + " : " + resultCom + " 패배");
					} else {
						System.out.println("사용자 : 컴퓨터 = " + resultMe + " : " + resultCom + " 무승부");
					}
					break;
				}

			}
		}

	}
}
