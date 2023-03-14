import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {

		int a;
		a = 100;

		long b = 1000;

		b = a;

		a = b;

//		작은걸 큰 곳에 넣는건 가능하지만, 큰걸 작은 곳에 넣으면 에러뜬다
//		메모리상 공간의 크기만큼 잘릴 수 있기 때문

		a = (int) b;
//		명시적 형변환
//		더 작은 타입으로 갈때 선언해줌으로서 사용

		double c = a;
		
		String s = "weqwd";
//		String은 기본 타입이 아니라서 형변환과 관련이 없다
		
	}
}
