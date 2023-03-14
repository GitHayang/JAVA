import java.util.Random;

public class ExecClass5 {
	public static void main(String[] args) {

		boolean a;
		a = 3 == 10;
		System.out.println(a);

		boolean b;
		b = 3 == 3;
		System.out.println(b);

		a = 3 == 3;
		// 동일하다
		a = 3 != 4;
		// 앞과 뒤가 다르다
		a = 3 > 4;
		// 보다 크다
		a = 3 < 4;
		// 보다 작다
		a = 3 >= 4;
		// 크거나 같다
		a = 3 <= 4;
		// 작거나 같다

		int x = 0;
		a = x < 10 || x % 2 == 0;
		a = true || (10 < x); // or 하나만 true면 true
		a = true && true; // and 둘다 true여야 true

	}
}
