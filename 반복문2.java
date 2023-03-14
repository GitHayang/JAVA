import java.util.Scanner;

public class Repeat2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// 무한루프 : 최대값에 true
		// 일반적으로 큰 수를 넣는 걸로 충분하다.
		// 무한루프를 꼭 써야할 때도 있다.
		for (int i = 0; i < 99999999; i++) {
			System.out.println("다음 중 원하는 메뉴를 선택하시오");
			System.out.println("1 : Hello 출력");
			System.out.println("q : 종료");
			
			String inputMenu = s.nextLine(); // 문자열을 입력 받을 때는 nextLine을 사용
			//모든 입력은 원래 문자열로 사용한다.			
			// 만약 입력받은 문자열을 숫자로 변경하고 싶은 경우
			// int number = Integer.parseInt(inputMenu);
						
			if(inputMenu.equals("1")) { // 문자열 비교는 "==" 대신 ".equals"사용
				System.out.println("Hello");
			}else if(inputMenu.equals("q")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("입력값이 잘못되었습니다. 다시 입력해주세요");
			}
		}
		
		
	}
}
