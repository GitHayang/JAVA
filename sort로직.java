import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// 소트를 직접하라
// 0~100까지의 임의의 수 30개를 발생시켜 배열에 저장하고 
// 정렬 전후의 숫자 배열을 출력

public class HW2 {
	public static void main(String[] args) {

		Random random = new Random();

		int num[] = new int[30];
		
		// 숫자 넣기
		for (int i = 0; i < 30; i++) {
			num[i] = random.nextInt(101);
		}

		// 기존 상태의 배열
		for (int i = 0; i < 30; i++) { 
			System.out.print(num[i] + " ");
		}
		System.out.println("");
		System.out.println("소트 개시");
		
		//소트 로직
		int target = -1;
		int arr[] = new int[30];
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				if (arr[i] < num[j]) {
					arr[i] = num[j];
					target = j;					
				}
			}num[target]=-1;
		}

		// 소트 이후의 배열
		for (int i = 0; i < 30; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
