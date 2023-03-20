import java.util.Arrays;

public class report {
	public static void main(String[] args) {
		
		int a []= {1,2,3,4,5};
		
		String strTemp = Arrays.toString(a);
		System.out.println(strTemp); 
//		"[1,2,3,4,5]"
		
		strTemp = strTemp.replace("[","");
		strTemp = strTemp.replace("]","");
//		"1,2,3,4,5"
//		strTemp = strTemp.replace(" ","");
//		"1 2 3 4 5"
//		strTemp = strTemp.trim();
		//trim()을 쓰면 공백을 날려준다
		String strTemp2 [] = strTemp.split(",");

		for(int i=0; i<strTemp2.length; i++) {
			System.out.println(strTemp2[i]);	
		}
		
						
//		for(int i =0; i<strTemp2.length(); i++) {
//			System.out.println(strTemp2);
//		}
		
	}
}