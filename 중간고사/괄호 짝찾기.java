import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("src/inputBracket.txt"));
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int i = 0; i < test; i++) {// 돌아가는 횟수
			int check = sc.nextInt(); // 인덱스 값으로는 -1 해줘야한다.
			String bracket = sc.nextLine();
			bracket = bracket.trim();

			String target[] = bracket.split("");

			System.out.println(Arrays.toString(target));

			int count = 0;
			for (int j = 0; j < target.length; j++) {
				if(target[check-1].equals(")")) {
					System.out.println(0);
					break;
				}
				if (j+1 > check - 1 &&target[j].equals("(")) {
					count++;
				} else if (j+1 > check - 1 &&target[j].equals(")")) {
					count--;
				}
				if (j > check - 1 && count == 0) {
					System.out.println(j+1);//출력은 인덱스 값이 아니라 순서로
					break;
				}
			}

		}

	}
}
