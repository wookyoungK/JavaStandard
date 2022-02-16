package ch6;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(13);
		System.out.println(result);
		System.out.println("??");

	}

//	static int factorial(int n) {
//		int result = 0;
//		if (n == 1)
//			result = 1;
//		else
//			result = n * factorial(--n);
//
//		return result;
//
//	}
	
	static int factorial(int n) {
		int result = 1;
		while(n != 0)
			result *= n--; 
		
		return result;
	}

}
