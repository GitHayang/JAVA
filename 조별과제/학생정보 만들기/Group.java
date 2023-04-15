import java.util.Arrays;
import java.util.Scanner;

/*
 * 각 교실별 3개조 구성(각 줄별로 조 만들기, 임의의 조 생성말고)
 * 
 *  조원별로 클래스 1개
 *  조장이 클래스 만들기 관리
 *  제출시 클래스에 작성자 이름 명시 
 *  
 *  과제
 *  성적관리
 *  1학년 각 클래스별 성적 관리 (중간고사, 기말고사)
 *  각 시험은 국어 영어 수학 총 3과목
 *  
 *  만들어야하는 객체
 *  클래스(A,B,C반)
 *  학생(이름, 주소, 성별)
 *  시험(중간고사, 기말고사)
 *  
 *  각각에 대해 입력 가능하게
 *  전체 목록 출력
 *  통계(총점, 평균)
 *  
 */
public class Group {
	String bang[][] = new String[3][2]; // 교실3, 학생수2
	String[] stuInfo = new String[3];
	String room; // 교실 - 어쩌면 필요없을 수도
	String name; // 학생이름
	String address;; // 주소
	String sex; // 성별
	int kor; // 국어
	int eng; // 영어
	int math; // 수학
	String mid; // 중간
	String last; // 기말

	public void Room() { // 교실 - 양윤재
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 999999; i++) {
			System.out.println("반을 입력하세요[A][B][C]");
			this.room = scanner.nextLine();
			for (int j = 0; j < bang[i].length; j++) {
				if (this.room.equals("A") || this.room.equals("a")) {
					bang[0][j] = stuInfo();
					System.out.println(Arrays.deepToString(bang));
				} else if (this.room.equals("B") || this.room.equals("b")) {
					bang[1][j] = stuInfo();
					System.out.println(Arrays.deepToString(bang));
				} else if (this.room.equals("C") || this.room.equals("c")) {
					bang[2][j] = stuInfo();
					System.out.println(Arrays.deepToString(bang));
				} else {
					System.out.println("반을 다시 입력해주세요.");
					this.Room();
				}
			}
		}
	}

	public String stuInfo() {// 학생정보 - 우경훈
		this.inputName();
		this.inputAddress();
		this.inputSex();
		// 현재 제일 마지막 거 하나만 읽어온다
		// 통합후 배열을 읽어서 출력하게 변경
		String stuInfo = (this.name + ' ' + this.address + ' ' + this.sex);
		System.out.println(stuInfo);
		return stuInfo;
	}

	public void inputName() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		this.name = scanner.nextLine();
	}

	public void inputAddress() {
		// 사용자에게 지역별 인사 정보를 입력하라는 메시지 표시
		for (int i = 1; i <= 999999; i++) {
			System.out.println("학생 정보");
			System.out.print("이름: ");
			Scanner scanner = new Scanner(System.in);
			System.out.println("주소에 해당하는 번호를 입력해주세요.");
			System.out.println("[1]서울 [2]경기 [3]강원");
			System.out.println("[4]충청 [5]전라 [6]경상");
			String address = scanner.nextLine();
			if (address.equals("1")) {
				this.address = "서울";
				break;
			} else if (address.equals("2")) {
				this.address = "경기";
				break;
			} else if (address.equals("3")) {
				this.address = "강원";
				break;
			} else if (address.equals("4")) {
				this.address = "충청";
				break;
			} else if (address.equals("5")) {
				this.address = "전라";
				break;
			} else if (address.equals("6")) {
				this.address = "경상";
				break;
			} else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}
	}

	public void inputSex() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 999999; i++) {
			System.out.println("성별을 입력해주세요. ( 1.남 2.여 )");
			String sex = scanner.nextLine();
			if (sex.equals("1")) {
				this.sex = "남";
				break;
			} else if (sex.equals("2")) {
				this.sex = "여";
				break;
			} else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}
	}

	public void Test() { // 중간,기말 - 함지혜
		int mid[][] = new int[2][3];// 학생2 과목3
		int last[][] = new int[2][3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("중간고사 국어 점수를 입력해주세요.");

		for (int i = 0; i < mid.length; i++) {
			for (int j = 0; j < mid[i].length; j++) {
				System.out.println("국어 점수를 입력해주세요.");
				this.kor = scanner.nextInt();
				mid[i][0] = this.kor;
				System.out.println("영어 점수를 입력해주세요.");
				this.eng = scanner.nextInt();
				mid[i][1] = this.eng;
				System.out.println("수학 점수를 입력해주세요.");
				this.math = scanner.nextInt();
				mid[i][2] = this.math;
			}
			System.out.println("중간고사");
			System.out.println("국어 : " + this.kor + "영어 : " + this.eng + "수학 : " + this.math);
		}
		System.out.println("기말고사 국어 점수를 입력해주세요.");

		for (int i = 0; i < last.length; i++) {
			for (int j = 0; j < last[i].length; j++) {
				System.out.println("국어 점수를 입력해주세요.");
				this.kor = scanner.nextInt();
				last[i][0] = this.kor;
				System.out.println("영어 점수를 입력해주세요.");
				this.eng = scanner.nextInt();
				last[i][1] = this.eng;
				System.out.println("수학 점수를 입력해주세요.");
				this.math = scanner.nextInt();
				last[i][2] = this.math;
			}
			System.out.println("기말고사");
			System.out.println("국어 : " + this.kor + "영어 : " + this.eng + "수학 : " + this.math);
		}

	}

	public void TotalScore() { // 통계 - 취합후 작성

	}

	public void out() { // 출력 - 백승수(조장) / 취합전에는 임의로 점수를 받아서 만든다
		int sum = 0;
		double avg = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < bang.length; i++) {
			for (int j = 0; j < bang[i].length; j++) {
				System.out.println((i + 1) + "반의 " + (j + 1) + "번 학생의 점수를 입력해 주세요");
				System.out.println("");
				System.out.println((i + 1) + "반의 " + (j + 1) + "번 학생의 국어 점수를 입력해 주세요");
				kor = scanner.nextInt();
				System.out.println((i + 1) + "반의 " + (j + 1) + "번 학생의 수학 점수를 입력해 주세요");
				eng = scanner.nextInt();
				System.out.println((i + 1) + "반의 " + (j + 1) + "번 학생의 영어 점수를 입력해 주세요");
				math = scanner.nextInt();

				sum = this.kor + this.eng + this.math;
				avg = (this.kor + this.eng + this.math) / 3;
				System.out.println((i + 1) + "반의 " + (j + 1) + "번 학생의 총점은" + sum);
				System.out.println((i + 1) + "반의 " + (j + 1) + "번 학생의 평균은" + avg);
				System.out.println("");
			}
		}
	}

}
