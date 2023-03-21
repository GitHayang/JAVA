import java.util.Scanner;

// 학생 10명의 점수를 입력받는다
// 가장 높은 점수를 찾는다
// 해당 점수를 받은애가 몇번째인지 알아본다.

public class StudentScore {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int score[] = new int[10];
		int result = Integer.MIN_VALUE;
		int num = 0; // 최고점을 가진 학생이 몇번째인가?

		for (int i = 0; i < 10; i++) { // 배열에 집어넣기
			System.out.println((i + 1) + "번째 학생의 점수");
			score[i] = scanner.nextInt();
		}

		System.out.println("학생의 점수 확인");
		for (int i = 0; i < 10; i++) { // 점수를 확인해서 가장 높은 점수를 가진애 찾기
			if (result < score[i]) {
				result = score[i];
				num = i+1;
			}
		}
		System.out.println("최고점수");
		System.out.println(num + "번째 학생 : " + result);

	}
}
