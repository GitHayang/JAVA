
public class SumOverHund2 {
	public static void main(String[] args) {
		System.out.println(Sum(200)); // 앞은 i의 초기값, 뒤는 sum의 초기값
	}

	public static int Sum(int i) {
		if (i == 100) {
			return i;
		} else {
			System.out.println(i);
			return i +Sum(i-1);
		}
	}

}
