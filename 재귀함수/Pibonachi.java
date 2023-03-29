import java.util.Arrays;

public class Pibonachi {
	public static void main(String[] args) {
		PibonachiTen(0, 4);
	}

	public static void PibonachiTen(int i, int n) { // i=순서,n=목표값
//		나온 값들을 배열에 저장한 후 더할때 값을 꺼내쓰면 어떨까?
		int[] arr = new int[n]; // 불러낼 때 초기화 된다.
		if (i == n) { // 타깃값이 되면 연산을 멈춰라
			return;
		}
		if (i == 0) {
			arr[i] = 0;
			System.out.println(Arrays.toString(arr));
			i++;
			PibonachiTen(i, n);
		} else if (i == 1) {
			arr[i] = 1;
			System.out.println(Arrays.toString(arr));
			i++;
			PibonachiTen(i, n);
		} else {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.println(Arrays.toString(arr));
			System.out.println(arr[i]);
			i++;
			PibonachiTen(i, n);
		}
	}

}
