package ch6;

public class FactorialTest2 {

	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for(int i =1; i<=n; i++) {
			result = factorial(i);
			
			if(result == -1) {
				System.out.println("유효하지않은값 ");
				break;
			}
			System.out.printf(i+"!="+i+"\n",i,result);
		}
		
		

	}

	static int factorial(int n) {
		if (n <= 0 || n>20) return -1;
		if (n<=1) return 1;
		
		return n * factorial(--n);

	}
	


}
