import java.util.Arrays;
import java.util.Scanner;

public class ClassRoom {

	Student[] student = new Student[100];
	Test test = new Test();

	int classIndex = 0;
	int stuIndex = 0;
	int stuIndex2 = 0;
	int stuIndex3 = 0;
	int stuIndex4 = 0;

	public void inputRoom(String Name) {
		if (Name.equals("A") || Name.equals("a")) {
			student[stuIndex] = new Student();
			inputName();
			inputAddress();
			inputSex();
			inputInfo();
			stuIndex++;
		} else if (Name.equals("B") || Name.equals("b")) {
			student[stuIndex] = new Student();
			inputName();
			inputAddress();
			inputSex();
			inputInfo();
			stuIndex++;
		} else if (Name.equals("C") || Name.equals("c")) {
			student[stuIndex] = new Student();
			inputName();
			inputAddress();
			inputSex();
			inputInfo();
			stuIndex++;
		} else {
			System.out.println("반을 다시 입력하세요.");
		}

	}

	public void inputName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		student[stuIndex].name = scanner.nextLine();
	}

	public void inputAddress() {
		for (int i = 0; i < 9999; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("주소를 입력해주세요: ");
			System.out.println("주소에 해당하는 번호를 입력해주세요.");
			System.out.println("[1]서울 [2]경기 [3]강원");
			System.out.println("[4]충청 [5]전라 [6]경상");
			student[stuIndex].address = scanner.nextLine();
			if (student[stuIndex].address.equals("1")) {
				student[stuIndex].address = "서울";
				break;
			} else if (student[stuIndex].address.equals("2")) {
				student[stuIndex].address = "경기";
				break;
			} else if (student[stuIndex].address.equals("3")) {
				student[stuIndex].address = "강원";
				break;
			} else if (student[stuIndex].address.equals("4")) {
				student[stuIndex].address = "충청";
				break;
			} else if (student[stuIndex].address.equals("5")) {
				student[stuIndex].address = "전라";
				break;
			} else if (student[stuIndex].address.equals("6")) {
				student[stuIndex].address = "경상";
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	public void inputSex() {
		for (int i = 0; i < 9999; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("성별을 입력해주세요. (1: 남자, 2: 여자)");
			String sex = scanner.nextLine();
			if (sex.equals("1")) {
				student[stuIndex].sex = "남자";
				break;
			} else if (sex.equals("2")) {
				student[stuIndex].sex = "여자";
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}

	}

	public String StudentInfo() {
		String stuInfo = ("이름: " + student[stuIndex].name + ", 주소: " + student[stuIndex].address + ", 성별: "
				+ student[stuIndex].sex);
		return StudentInfo();
	}

	public void inputInfo() {
		System.out.println("중간고사 점수 입력하세요.");
		mid();
		System.out.println("기말고사 점수 입력하세요.");
		finalTest();

	}

	public void mid() {
		test.midtest[stuIndex] = new Test();
		Scanner scanner = new Scanner(System.in);
		String inputText = "";
		System.out.println("");
		System.out.println("국어 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		test.midtest[stuIndex].korScore = Integer.parseInt(inputText);
		System.out.println("영어 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		test.midtest[stuIndex].engScore = Integer.parseInt(inputText);
		System.out.println("수학 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		test.midtest[stuIndex].mathScore = Integer.parseInt(inputText);
		test.midtest[stuIndex].sum = (test.midtest[stuIndex].korScore + test.midtest[stuIndex].engScore
				+ test.midtest[stuIndex].mathScore);
		test.midtest[stuIndex].avg = (float) (test.midtest[stuIndex].korScore + test.midtest[stuIndex].engScore
				+ test.midtest[stuIndex].mathScore) / 3;
	}

	public void finalTest() {
		test.finaltest[stuIndex] = new Test();
		Scanner scanner = new Scanner(System.in);
		String inputText = "";
		System.out.println("");
		System.out.println("국어 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		test.finaltest[stuIndex].korScore = Integer.parseInt(inputText);
		System.out.println("영어 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		test.finaltest[stuIndex].engScore = Integer.parseInt(inputText);
		System.out.println("수학 점수를 입력해주세요.");
		inputText = scanner.nextLine();
		test.finaltest[stuIndex].mathScore = Integer.parseInt(inputText);
		test.finaltest[stuIndex].sum = (test.finaltest[stuIndex].korScore + test.finaltest[stuIndex].engScore
				+ test.finaltest[stuIndex].mathScore);
		test.finaltest[stuIndex].avg = (float) (test.finaltest[stuIndex].korScore + test.finaltest[stuIndex].engScore
				+ test.finaltest[stuIndex].mathScore) / 3;

	}

	public String printScore() {
		String printScore = "";
		printScore = ("[이름]" + student[stuIndex2].name + ", [주소]" + student[stuIndex2].address + ", [성별]"
				+ student[stuIndex2].sex + "\n[중간고사] " + "[총점]" + test.midtest[stuIndex2].sum + "[평균]"
				+ (test.midtest[stuIndex2].avg) + " [국어]" + test.midtest[stuIndex2].korScore + " [영어]"
				+ test.midtest[stuIndex2].engScore + " [수학]" + test.midtest[stuIndex2].mathScore + "\n[기말고사] " + "[총점]"
				+ test.finaltest[stuIndex2].sum + "[평균]" + (test.finaltest[stuIndex2].avg) + " [국어]"
				+ test.finaltest[stuIndex2].korScore + " [영어]" + test.finaltest[stuIndex2].engScore + " [수학]"
				+ test.finaltest[stuIndex2].mathScore);
		stuIndex2++;
		System.out.println(printScore);
		return printScore;
	}

	int sumScore = 0;
	float avgScore = 0;
	int sumkor = 0;
	int sumEng = 0;
	int sumMath = 0;
	int cnt = 1;

	public String totalMid() {
		sumkor = sumkor + test.midtest[stuIndex3].korScore;
		sumEng = sumEng + test.midtest[stuIndex3].engScore;
		sumMath = sumMath + test.midtest[stuIndex3].mathScore;
		sumScore = (int) (sumScore + test.midtest[stuIndex3].sum);
		avgScore = (float) (sumScore) / (3 * cnt);
		String printScore = ("[총점]" + sumScore + "[평균]" + avgScore + " [국어]" + sumkor + " [영어]" + sumEng + " [수학]"
				+ sumMath);
		stuIndex3++;
		cnt++;
		return printScore;
	}

	int sumScore2 = 0;
	float avgScore2 = 0;
	int sumkor2 = 0;
	int sumEng2 = 0;
	int sumMath2 = 0;
	int cnt2 = 1;

	public String totalFinal() {
		sumkor2 = sumkor2 + test.finaltest[stuIndex4].korScore;
		sumEng2 = sumEng2 + test.finaltest[stuIndex4].engScore;
		sumMath2 = sumMath2 + test.finaltest[stuIndex4].mathScore;
		sumScore2 = (int) (sumScore2 + test.finaltest[stuIndex4].sum);
		avgScore2 = (float) (sumScore2) / (3 * cnt2);
		String printScore = ("[총점]" + sumScore2 + "[평균]" + avgScore2 + " [국어]" + sumkor2 + " [영어]" + sumEng2 + " [수학]"
				+ sumMath2);
		stuIndex4++;
		cnt2++;
		return printScore;
	}

	public void printInfo() { // 이제는 아예 합쳐서 나오게 해보자
		System.out.println("[중간고사 점수]" + totalMid());
		System.out.println("[기말고사 점수]" + totalFinal());
	}
}