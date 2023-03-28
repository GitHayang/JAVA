import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {

		TesterMain tester = new TesterMain();

		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		SaveBox saveBox = new SaveBox();
		// deposit, setName, withdraw

		while (true) {
			// 통장 개설
			System.out.println("m:개설");
			System.out.println("f:조회");
			System.out.println("원하는 통장번호 선택");
			System.out.println("q:종료");
			String sel = s.nextLine();
			if (sel.equals("q")) {
				System.out.println("종료합니다");
				break;
			} else if (sel.equals("m")) {
				// 개설
				saveBox.make();
				continue;
			} else if (sel.equals("f")) {
				// 통장조회
				saveBox.find();
				System.out.println(saveBox.coin + "원");
				continue;
			}
			// 원하는 통장을 선택후 입금이나 출금등의 처리를 해야한다.
			int num = Integer.parseInt(sel);
			System.out.println(saveBox.saveBox[num]);
			System.out.println("1 : 입금");
			System.out.println("2 : 출금");
			String soo = s2.nextLine();
			if (soo.equals("1")) {
				// 입금의 경우
				saveBox.deposit();
				continue;
			} else if (soo.equals("2")) {
				// 출금의 경우
				saveBox.withdraw();
				continue;
			}
		}

	}
}
