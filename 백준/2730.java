import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws IOException {
		Random random = new Random();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String read = br.readLine();

		int num = Integer.parseInt(read);

		int arr [] = new int[num];
		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = random.nextInt(1000) + 1;
//			for(int j=0; j<i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
		
		for (int i = 0; i < arr.length; i++) {
			String read2 = br.readLine();
			int num2 = Integer.parseInt(read2);
			arr[i] = num2;
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
