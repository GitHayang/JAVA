
public class Repeat {	
	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + "번째");
//			System.out.println("************");
//		}

//		for (int i = 0; i < 100; i++) {
//			System.out.println(1 + i);
//		}

		// 1~100까지 합 구하기
		int sumNumber = 0;
		for (int i = 0; i < 100; i++) {
			sumNumber = sumNumber + (i + 1);
		}
		System.out.println(sumNumber);

		System.out.println("-----------------");

		// 1~1000까지의 합
		int sumThousand = 0;
		for (int i = 0; i < 1000; i++) {
			sumThousand = sumThousand + (i + 1);
		}
		System.out.println(sumThousand);

		System.out.println("-----------------");

		// 1~100중에서 짝수 합
		int sumNumber2 = 0;
		for (int j = 0; j < 101; j++) {
			if (j % 2 == 0) {
				sumNumber2 = sumNumber2 + j;
			} else {
//				System.out.println(j); // 홀수 확인
			}
		}
		System.out.println(sumNumber2);

		System.out.println("-----------------");

		// 1~100중에서 홀수 합
		int sumNumber3 = 0;
		for (int k = 0; k < 101; k++) {
			if (k % 2 == 1) {
				sumNumber3 = sumNumber3 + k;
			} else {
//						System.out.println(k); // 짝수 확인
			}
		}
		System.out.println(sumNumber3);

		System.out.println("-----------------");

		// 3의 배수 합
		int sumNumber4 = 0;
		for (int p = 0; p < 101; p++) {
			if (p % 3 == 0) {
				sumNumber4 = sumNumber4 + p;
			} else {
			}
		}
		System.out.println(sumNumber4);

	}
}
