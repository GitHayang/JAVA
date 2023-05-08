import java.util.Arrays;
import java.util.Scanner;

//n개의 문자열
//각행을 오름차순으로 정렬

public class Q4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("줄수");
		int n = scanner.nextInt(); // 문자열의 줄수이자, 테스트 횟수
		String arr[] = new String[n];

		System.out.println("입력");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner2.nextLine();
			String[] arr2 = arr[i].split(" ");
			int arr3[] = new int[arr2.length];
			
			for(int z= 0; z<arr2.length; z++) {
				arr3[z] = Integer.parseInt(arr2[z]);
			}
			
			for (int a = 0; a < arr2.length - 1; a++) {
				for (int j = (a + 1); j < arr2.length; j++) {
					if (arr3[a] > arr3[j]) {
						int temp = arr3[a];
						arr3[a] = arr3[j];
						arr3[j] = temp;
					}
				}
			}

			System.out.println(Arrays.toString(arr3));
		}

	}
}
