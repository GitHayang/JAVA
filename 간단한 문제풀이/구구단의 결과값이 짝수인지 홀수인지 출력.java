package forms;

// 구구단의 결과값이 짝수인지 홀수인지 출력

public class form7 {
	public static void main(String[] args) {

		for (int i = 7; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i * j) % 2 == 1) {
					System.out.println(i + " * " + j + " = " + (i * j) + " , " + "홀수입니다.");
				} else {
					System.out.println(i + " * " + j + " = " + (i * j) + " , " + "짝수입니다.");
				}
			}
			System.out.println("-----------------");
		}

	}
}
