import java.beans.beancontext.BeanContextServiceProviderBeanInfo;
import java.util.Scanner;

// 3과목의 점수를 받아서 평균에 따른 점수를 출력하는 로직
public class Score2_1 {
	public static void main(String[] args) {

		int KoreanScore = 0;
		int MathScore = 0;
		int EngScore = 0;

		String[] subject = { "KoreanScore", "EngScore", "MathScore" };

		// 국어

		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("국어 점수 : ");
			KoreanScore = s.nextInt();
			if (KoreanScore > 100) {
				System.out.println("잘못된 입력");
				continue;
			} else {
				System.out.println("국어 점수 : " + KoreanScore);
				break;
			}
		}

		// 영어
		while (true) {
			Scanner s2 = new Scanner(System.in);
			System.out.println("영어 점수 : ");
			EngScore = s2.nextInt();
			if (EngScore > 100) {
				System.out.println("잘못된 입력");
				continue;
			} else {
				System.out.println("영어 점수 : " + EngScore);
				break;
			}
		}

		// 수학
		while (true) {
			Scanner s3 = new Scanner(System.in);
			System.out.println("수학 점수 : ");
			MathScore = s3.nextInt();
			if (MathScore > 100) {
				System.out.println("잘못된 입력");
				continue;
			} else {
				System.out.println("수학 점수 : " + MathScore);
				break;
			}
		}

		// 합계 및 평균
		int sum = KoreanScore + EngScore + MathScore;
		System.out.println("합계 : " + sum);
		double avg = (double) sum / (int) subject.length;
		System.out.println("평균 : " + avg);

		// 학점
		if (avg >= 90) {
			System.out.print("학점 : ");
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.print("학점 : ");
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.print("학점 : ");
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.print("학점 : ");
			System.out.println("D");
		} else {
			System.out.print("학점 : ");
			System.out.println("F");
		}

	}
}
