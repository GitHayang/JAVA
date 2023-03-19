package forms;

// 6단중 홀수를 곱한 경우만 출력

public class form2 {
	public static void main(String[] args) {

		for (int i = 6; i < 7; i++) {
			for (int j = 1; j < 10; j++) {
				if (j % 2 == 1) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
			}
		}

	}
}
