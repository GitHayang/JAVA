import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// 스캐너 이외에 무언가를 써야한다

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] input = br.readLine().split(" ");

		int T = Integer.parseInt(input[0]);
		int S = Integer.parseInt(input[1]);

		for (int i = 0; i < 99999; i++) {
			// 숫자범위 설정
			if (T < 0 || T > 24) {
				continue;
			}
			if (S < 0 || S > 1) {
				continue;
			}

			if (T <= 11) {
				// 아침
				if (S == 0) {
					System.out.println("280");
					break;
				} else {
					System.out.println("280");
					break;
				}
			} else if (T >= 12 && T <= 16) {
				// 점심
				if (S == 0) {
					System.out.println("320");
					break;
				} else {
					System.out.println("280");
					break;
				}
			} else {
				// 저녁
				if (S == 0) {
					System.out.println("280");
					break;
				} else {
					System.out.println("280");
					break;
				}
			}

		}

	}
}
