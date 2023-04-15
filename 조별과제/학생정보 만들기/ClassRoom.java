import java.util.Scanner;

public class ClassRoom {
	String name; // a,b....
	Student[] student = new Student[100]; // 학생수
	Test[] midtest = new Test[100];
	Test[] finaltest = new Test[100];
	Student stu = new Student();

	public void Stuin() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("학생번호 입력");
		int inputnumber = scanner.nextInt();
		student[inputnumber] = new Student();

		System.out.println("이름");
		student[inputnumber].name = scanner2.nextLine();
		System.out.println("주소");
		student[inputnumber].address = scanner2.nextLine();
		System.out.println("성별(남/여)");
		student[inputnumber].sex = scanner2.nextLine();
	}

	public void Stuout() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생번호 입력");
		int input = scanner.nextInt();
		System.out.println("이름 : " + student[input].name);
		System.out.println("주소 : " + student[input].address);
		System.out.println("성별 : " + student[input].sex);
		System.out.println("중간고사 합계 : " + (midtest[input].sum));
		System.out.println("중간고사 평균 : " + (midtest[input].avg));
		System.out.println("기말고사 합계 : " + (finaltest[input].sum));
		System.out.println("기말고사 평균 : " + (finaltest[input].avg));
	}

	public void mid() {
		for (int i = 0; i < midtest.length; i++) {
			midtest[i] = new Test();
		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("학생번호 입력");
		int input = scanner2.nextInt();

		Scanner scanner = new Scanner(System.in);
		String inputText = "";
		System.out.println("");
		System.out.println(input + "번째 학생의 중간고사 성적");
		System.out.println("국어 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		midtest[input].korScore = Integer.parseInt(inputText);
		System.out.println("영어 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		midtest[input].engScore = Integer.parseInt(inputText);
		System.out.println("수학 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		midtest[input].mathScore = Integer.parseInt(inputText);
		midtest[input].sum = (midtest[input].korScore + midtest[input].engScore + midtest[input].mathScore);
		midtest[input].avg = (float) (midtest[input].korScore + midtest[input].engScore + midtest[input].mathScore) / 3;
	}

	public void finalTest() {
		for (int i = 0; i < finaltest.length; i++) {
			finaltest[i] = new Test();
		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("학생번호 입력");
		int input = scanner2.nextInt();
		Scanner scanner = new Scanner(System.in);
		String inputText = "";
		System.out.println("");
		System.out.println(input + "번째 학생의 기말고사 성적");
		System.out.println("국어 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		finaltest[input].korScore = Integer.parseInt(inputText);
		System.out.println("영어 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		finaltest[input].engScore = Integer.parseInt(inputText);
		System.out.println("수학 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		finaltest[input].mathScore = Integer.parseInt(inputText);
		finaltest[input].sum = (finaltest[input].korScore + finaltest[input].engScore + finaltest[input].mathScore);
		finaltest[input].avg = (float) (finaltest[input].korScore + finaltest[input].engScore
				+ finaltest[input].mathScore) / 3;

	}

	public void midresult() {
		System.out.println("");
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("학생번호 입력");
		int input = scanner2.nextInt();
		System.out.println(input + "번째 학생 점수");
		System.out.println("국어 : " + (midtest[input].korScore));
		System.out.println("영어 : " + (midtest[input].engScore));
		System.out.println("수학 : " + (midtest[input].mathScore));
		System.out.println("합계 : " + (midtest[input].sum));
		System.out.println("평균 : " + (midtest[input].avg));
	}

	public void finaltestresult() {
		System.out.println("");
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("학생번호 입력");
		int input = scanner2.nextInt();
		System.out.println(input + "번째 학생 점수");
		System.out.println("국어 : " + (finaltest[input].korScore));
		System.out.println("영어 : " + (finaltest[input].engScore));
		System.out.println("수학 : " + (finaltest[input].mathScore));
		System.out.println("합계 : " + (finaltest[input].sum));
		System.out.println("평균 : " + (finaltest[input].avg));
	}

}
