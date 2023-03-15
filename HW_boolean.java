import java.util.Random;
import java.util.Scanner;

// 가위바위보 게임 만들기
public class HW_boolean {
	public static void main(String[] args) {

		// 통계를 위한 변수 선언
		int win = 0;
		int lose = 0;
		int draw = 0;
		int count = 0;

		for (int i = 0; i < 99999999; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("가위 : 0, 바위 : 1, 보 : 2 // q : 종료");
			System.out.println("입력해주세요 : ");
			String inputSign = s.nextLine();

			// 컴퓨터 입력
			Random r = new Random();
			int com = r.nextInt(3); // 0~2까지 생성

			// 종료기능, 가위 바위 보 결과
			if (inputSign.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			} else if (Integer.parseInt(inputSign) == com) {// 비긴다.
				System.out.println("비겼습니다");
				draw = draw + 1;
				count = count + 1;
			} else if (Integer.parseInt(inputSign) - com == 2 || com - Integer.parseInt(inputSign) == 1) {// 진다
				System.out.println("패배");
				lose = lose + 1;
				count = count + 1;
			} else if (com - Integer.parseInt(inputSign) == 2 || Integer.parseInt(inputSign) - com == 1) {// 이긴다.
				System.out.println("승리");
				win = win + 1;
				count = count + 1;
			} else {// 가위 바위 보의 범위에서 벗어나는 경우
				System.out.println("다시 입력해주세요");
				System.out.println("---------------------------------------------");
			}

			// 전적
			System.out.println(count + "전 " + "승리 : " + win + " " + "패배 : " + lose + " " + "무승부 : " + draw);
			// 승률 구하기
			double winAvg = (double) win / (win + lose + draw);
			// 승률
			System.out.println("승률 : " + winAvg);
			// 다음 게임과 구분짓기
			System.out.println("---------------------------------------------");

		} // for문 종료지점
	}
}
