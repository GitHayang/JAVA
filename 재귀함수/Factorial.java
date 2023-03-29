
public class Factorial {
	public static void main(String[] args) {
		Facto(5,5);		
	}
	
	public static void Facto(int k,int i) {
		if(i==1) {
			return;
		}
		--i;
		k=k*i;
		System.out.println(k);
		Facto(k,i);
	}
	
}
