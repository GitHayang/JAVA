import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {

		Random random = new Random();

		int num[] = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(45) + 1; // 1~45
		}

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length; j++) {
				if (i != j) { // 자기자신은 비교대상에서 제외
					if (num[i] == num[j]) { // 현재 번호가 자기자신 제외하고 같을 때 번호 다시 돌림
						num[j] = random.nextInt(45) + 1;
					}
				}
			}
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}
}
