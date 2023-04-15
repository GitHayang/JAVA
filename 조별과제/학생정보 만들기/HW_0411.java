import java.util.Scanner;

public class HW_0411 {
	public static void main(String[] args) {
		ClassRoom classRoom = new ClassRoom();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 999999; i++) {
			System.out.println("---------------");
			System.out.println("1.학생정보 입력");
			System.out.println("2.학생정보 출력");
			System.out.println("3.점수 입력");
			System.out.println("4.점수 출력");
			int input = scanner.nextInt();

			if (input == 1) {
				classRoom.Stuin();
			}
			if (input == 2) {
				classRoom.Stuout();
			}
			if (input == 3) {
				System.out.println("1. 중간고사 입력");
				System.out.println("2. 기말고사 입력");
				int inputNum = scanner.nextInt();
				if (inputNum == 1) {
					classRoom.mid();
				} else if (inputNum == 2) {
					classRoom.finalTest();
				}
			}
			if (input == 4) {
				System.out.println("1. 중간고사 통계");
				System.out.println("2. 기말고사 통계");
				int inputNum = scanner.nextInt();
				if (inputNum == 1) {
					classRoom.midresult();
				} else if (inputNum == 2) {
					classRoom.finaltestresult();
				}
			}

		}

	}
}
