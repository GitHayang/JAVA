import java.util.Scanner;

public class SaveBox {
	int coin = 0;
	String name = "돼지 저금통";
	boolean isBroken = false;

	public void deposit() {// 넣는다
		if (this.isBroken) {
			System.out.println("이 저금통은 더 이상 사용할 수 없습니다");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name + "에 입금할 금액을 입력해주세요");
		String inputString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputString);
		System.out.println("땡그랑");
		this.coin = this.coin + inputCoin;
		System.out.println("현재 보유 금액 : " + this.coin);
	}

	public void withdraw() {// 찾는다
		System.out.println(this.name + "을 깼습니다");
		System.out.println("최종 출금 금액은 " + coin + "원 입니다");
		coin = 0; // 찾고나면 돈은 0이 된다.
		this.isBroken = true;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 통장 이름 설정
	String saveBox[] = new String[100];

	public void make() {
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		// 통장 이름 설정
		System.out.println("통장번호를 입력하세요");
		int num = s2.nextInt();

		System.out.println("통장 이름을 입력하세요");
		String name = s.nextLine();

		saveBox[num] = name;
		System.out.println("이름 확인");
		System.out.println(saveBox[num]);
	}

	// 통장 조회
	public void find() {
		for (int i = 0; i < saveBox.length; i++) {
			if (saveBox[i] != null) {
				System.out.println(i+"번 통장 확인");
				System.out.println(saveBox[i]);
			}
		}
	}

}
