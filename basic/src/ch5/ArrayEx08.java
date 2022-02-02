package ch5;
class ArrayEx08 { 
	public static void main(String[] args) { 
		// 45���� �������� �����ϱ� ���� �迭 ����. 
		int[] ball = new int[45];       

		// �迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�. 
		for(int i=0; i < ball.length; i++)       
			ball[i] = i+1;    // ball[0]�� 1�� ����ȴ�.

		int temp = 0;  // �� ���� �ٲٴµ� ����� �ӽú��� 
		int j = 0;     // ������ ���� �� ������ ���� 

		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�. 
		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for(int i=0; i < 6; i++) {
			// Math.random() * �ִ밪
			// Math.random() * 10 ���� �����ϸ� 0~10
			j = (int)(Math.random() * 45); // 0~44������ ������ ���� ��´�. 
			System.out.println(j);
			temp     = ball[i]; 
			ball[i] = ball[j]; 
			ball[j] = temp; 
		} 

		// �迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
		for(int i=0; i < 6; i++) 
			System.out.printf("ball[%d]=%d%n", i, ball[i]); 
	} 
} 
