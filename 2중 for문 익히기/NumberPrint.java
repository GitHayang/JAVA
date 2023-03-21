// 숫자 찍기
public class NumberPrint {
	public static void main(String[] args) {
		
//		1
//		12
//		123
//		1234
		for(int i =1; i<6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}System.out.println("");
		}
		
		System.out.println("----------------");
		
//		   1
//		  222
//		 33333
		for(int i=1; i<6; i++) {
			for(int k=6; k>i ; k--) {
				System.out.print(" ");
			}
			for(int j =1; j<=(2*i)-1; j++) {
				System.out.print(i);
			}System.out.println("");
		}
		
	}
}
