import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Student s1 =new Student();		
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 30;
		s1.math = 80;
		s1.input();
		
		s1.name = "둘리";
		s1.kor = 80;
		s1.eng = 90;
		s1.math = 0;
		s1.input();

		s1.name = "사이퍼";
		s1.kor = 80;
		s1.eng = 90;
		s1.math = 55;
		s1.input();
		
		s1.name = "시공";
		s1.kor = 75;
		s1.eng = 88;
		s1.math = 100;
		s1.input();
		
		
		s1.result();
	}
}
