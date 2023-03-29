
public class SumOverHund {
	public static void main(String[] args) {
		
		Sum(100,100); //앞은 i의 초기값, 뒤는 sum의 초기값
	}
	
//	i의 기본값은 100인상태
	public static void Sum(int i, int k) {
		if (i > 200) {
			return;
		}		
		k=k+i;
		i++;
		System.out.println(k);
		Sum(i,k);
		
	}

}
