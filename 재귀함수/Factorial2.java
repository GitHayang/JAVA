
public class Factorial2 {
	public static void main(String[] args) {
		System.out.println(Facto(5));
	}

	public static int Facto(int i) {
		if (i == 1) {
			return i;
		} else {
			return i * Facto(i - 1);
		}
	}
}
