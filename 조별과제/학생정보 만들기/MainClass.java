import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ClassRoom classRoom = new ClassRoom();
		Student student = new Student();
		Test test = new Test();

		int index = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 9999; i++) {
			// 메뉴입력
			System.out.println("메뉴를 선택하세요 [a]정보입력 [b]전체정보 조회 [c] 점수통계");
			String inputMenu = scanner.nextLine();
			if (inputMenu.equals("a")) {
				System.out.println("반을 입력하세요.[A][B][C]");
				String name = scanner.nextLine();
				classRoom.inputRoom(name);
				index++;
			} else if (inputMenu.equals("b")) {
				for (int j = 0; j < index; j++) {
					classRoom.printScore();
					System.out.println("---------------------------------------------------------");
				}
			} else if (inputMenu.equals("c")) {
				for (int j = 0; j < index; j++) {
					classRoom.printInfo();
					System.out.println("---------------------------------------------------------");
				}
			} else {
				System.out.println("메뉴를 다시 입력하세요.");
			}
		}

	}

}