package forms;

// 구구단 종료후 구분자를 출력

public class form6 {
	public static void main(String[] args) {

		for (int i = 7; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println("-----------------");
		}

	}
}
