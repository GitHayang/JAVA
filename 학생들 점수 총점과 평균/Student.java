import java.util.Arrays;
import java.util.Scanner;

public class Student {

	String name;
	int kor;
	int eng;
	int math;

	int korSum[] = new int[4];
	int engSum[] = new int[4];
	int mathSum[] = new int[4];

	int cnt = 0;

	public void input() {
		int score[] = { kor, eng, math };
		System.out.print(name + " : ");
		System.out.println(Arrays.toString(score));
		korSum[cnt] = score[0];
		engSum[cnt] = score[1];
		mathSum[cnt] = score[2];
		cnt++;

	}

	public void result() {
		System.out.println("");
		System.out.println("과목별 점수 합계");
		int koreansum = 0;
		for (int i = 0; i < korSum.length; i++) {
			koreansum = koreansum + korSum[i];
		}
		System.out.println("국어 : " + koreansum);
		
		int englishsum = 0;
		for (int i = 0; i < engSum.length; i++) {
			englishsum = englishsum + engSum[i];
		}
		System.out.println("영어 : " + englishsum);
		
		int mathsum = 0;
		for (int i = 0; i < mathSum.length; i++) {
			if(mathSum[i] != 0) {
			mathsum = mathsum + mathSum[i];
			}
			}
		System.out.println("수학 : " + mathsum);
		

		System.out.println("");
		System.out.println("과목별 점수 평균");
		System.out.printf("국어 : " +"%.2f\n", ((double)koreansum/korSum.length));
		System.out.printf("영어 : " +"%.2f\n", ((double)englishsum/engSum.length));
		System.out.printf("수학 : " +"%.2f\n", ((double)mathsum/mathSum.length));
	}

}
