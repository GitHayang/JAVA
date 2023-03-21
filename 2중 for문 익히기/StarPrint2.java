// 별찍기
public class StarPrint2 {
	public static void main(String[] args) {

//		*
//		**
//		***
//		****
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("------------------");
		
//		****
//		 ***	
//		  **	
//		   *
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("----------------");

//		   *
//		  ***
//		 *****
		for (int i = 1; i < 6; i++) {
			for (int k = 6; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("--------------");

//		*****
//		 ***
//		  *		
		for (int i = 1; i < 6; i++) {
			for (int k = -1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 9-2*i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
