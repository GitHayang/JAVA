import java.util.Random;
import java.util.Scanner;

// 가위바위보 게임 만들기
public class HW_Repeat {
	public static void main(String[] args) {

		// 통계를 위한 로직
		int win = 0;
		int lose = 0;
		int draw = 0;

		for (int i = 0; i < 99999999; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("가위 : 0, 바위 : 1, 보 : 2 // q : 종료");
			System.out.println("입력해주세요 : ");
			String inputSign = s.nextLine();

			int count = i;

			// 종료기능
			if (inputSign.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			}

			// 가위 바위 보 위해 정수로 변형
			int put = Integer.parseInt(inputSign);
			
			// 가위 바위 보의 범위에서 벗어나는 경우
			if (put > 2 || put < 0) {
				System.out.println("다시 입력해주세요");
				System.out.println("-------------------");
				continue;
			}

			// 컴퓨터 입력
			Random r = new Random();
			int com = r.nextInt(3); // 0~2까지 생성

			// 가위 바위 보 결과
			if (put == 0) {// 가위 일때
				if (com == 0) {
					System.out.println("나 : 가위");
					System.out.println("상대 : 가위");
					System.out.println("결과 : 무승부");
					draw = draw + 1;
				} else if (com == 1) {
					System.out.println("나 : 바위");
					System.out.println("상대 : 가위");
					System.out.println("결과 : 승리");
					win = win + 1;
				} else if (com == 2) {
					System.out.println("나 : 보");
					System.out.println("상대 : 가위");
					System.out.println("결과 : 패배");
					lose = lose + 1;
				} else {
					System.out.println("");
				}
			} else if (put == 1) {// 바위 일때
				if (com == 0) {
					System.out.println("나 : 바위");
					System.out.println("상대 : 가위");
					System.out.println("결과 : 승리");
					win = win + 1;
				} else if (com == 1) {
					System.out.println("나 : 바위");
					System.out.println("상대 : 바위");
					System.out.println("결과 : 무승부");
					draw = draw + 1;
				} else if (com == 2) {
					System.out.println("나 : 바위");
					System.out.println("상대 : 보");
					System.out.println("결과 : 패배");
					lose = lose + 1;
				} else {
					System.out.println("");
				}
			} else if (put == 2) {// 보 일때
				if (com == 0) {
					System.out.println("나 : 보");
					System.out.println("상대 : 가위");
					System.out.println("결과 : 패배");
					lose = lose + 1;
				} else if (com == 1) {
					System.out.println("나 : 보");
					System.out.println("상대 : 바위");
					System.out.println("결과 : 승리");
					win = win + 1;
				} else if (com == 2) {
					System.out.println("나 : 보");
					System.out.println("상대 : 보");
					System.out.println("결과 : 무승부");
					draw = draw + 1;
				} // 가위 바위 보 로직 끝
			}

			// 전적
			System.out.println(count + 1 + "전 " + "승리 : " + win + " " + "패배 : " + lose + " " + "무승부 : " + draw);
			// 승률 구하기
			double winAvg = (double) win / (win + lose + draw);
			// 승률
			System.out.println("승률 : " + winAvg);
			// 다음 게임과 구분짓기
			System.out.println("--------------------");

		} // for문 종료지점
	}
}
