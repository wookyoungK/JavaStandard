package ch5;
class ArrayEx07 {
	public static void main(String[] args) {
		int[] numArr = new int[10];

		for (int i=0; i < numArr.length ; i++ ) {
             numArr[i] = i;  // �迭�� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
			System.out.print(numArr[i]);  
		}
		System.out.println();

		for (int i=0; i < 100; i++ ) {
			int n = (int)(Math.random() * 10);	// 0~9���� �� ���� ���Ƿ� ��´�.

			int tmp = numArr[0];
			
			numArr[0] = numArr[n];
			System.out.println(numArr[0]);
			System.out.println(tmp);
			numArr[n] = tmp;
			System.out.println(numArr[n]);
			
		}
		/*
		 * �����ϰ� 
		for(int i=0; i<numArr.length; i++) {
			int a = (int)(Math.random() * 10);
			int temp = numArr[i];
			numArr[i] = numArr[a];
			numArr[a] = temp;
			
		}
		*/

		for (int i=0; i < numArr.length ; i++ )
			System.out.print(numArr[i]);
		
		
		
	} // main�� ��
}
