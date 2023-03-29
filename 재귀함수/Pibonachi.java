
public class Pibonachi {
	public static void main(String[] args) {
		System.out.println(PibonachiTen(10));
	}

	public static int PibonachiTen(int i) {
		if (i == 0) {
			return 0;
		} else if (i == 1) {
			return 1;
		} else {
			return PibonachiTen(i - 1) + PibonachiTen(i - 2);
		}
	}

}
