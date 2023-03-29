
public class test {
	public static void main(String[] args) {
		printHello(0);
	}

	public static void printHello(int i) {
		if (i > 10) {
			return;
		}
		System.out.println("Hello");
		printHello(++i);

//		i++;
//		printHello(i);
	}
}
