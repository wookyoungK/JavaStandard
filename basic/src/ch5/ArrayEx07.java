package ch5;
class ArrayEx07 {
	public static void main(String[] args) {
		int[] numArr = new int[10];

		for (int i=0; i < numArr.length ; i++ ) {
             numArr[i] = i;  // 배열을 0~9의 숫자로 초기화한다.
			System.out.print(numArr[i]);  
		}
		System.out.println();

		for (int i=0; i < 100; i++ ) {
			int n = (int)(Math.random() * 10);	// 0~9중의 한 값을 임의로 얻는다.

			int tmp = numArr[0];
			
			numArr[0] = numArr[n];
			System.out.println(numArr[0]);
			System.out.println(tmp);
			numArr[n] = tmp;
			System.out.println(numArr[n]);
			
		}
		/*
		 * 심플하게 
		for(int i=0; i<numArr.length; i++) {
			int a = (int)(Math.random() * 10);
			int temp = numArr[i];
			numArr[i] = numArr[a];
			numArr[a] = temp;
			
		}
		*/

		for (int i=0; i < numArr.length ; i++ )
			System.out.print(numArr[i]);
		
		
		
	} // main의 끝
}
