import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = scanner.nextInt();
		int j = scanner.nextInt();

		int arr[][] = new int[i][j];

		for (int a = 0; a < i; a++) {
			for (int b = 0; b < j; b++) {
				arr[a][b] = scanner.nextInt();
			}
		}


		int test = scanner.nextInt();

		for (int a = 0; a < test; a++) {
			int row = scanner.nextInt()-1;
			int cal = scanner.nextInt()-1;

			int sum = 0; 
			int sum2 = 0; 
			
			for (int x = 0; x < j; x++) {
				sum = sum + arr[row][x];
			}

			for (int z = 0; z < i; z++) {
				sum2 = sum2 + arr[z][cal];
			}

			System.out.println(sum);
			System.out.println(sum2);

		}

	}
}
