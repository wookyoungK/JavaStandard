package ch6;
class TvTest3 {
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");

		t2 = t1;		// t1�� �����ϰ� �ִ� ��(�ּ�)�� t2�� �����Ѵ�.
						// �׷��� �Ǹ� t2���� t1�� �����ϰ� �ִ� �ν��Ͻ��� ���� �����ϰ� �Ǿ� t2�� ���� �����ϰ� �ִ� �ν��Ͻ��� ���̻� ����� �� ����
						// ī���� �÷��Ϳ� ���ؼ� �ڵ������� �޸𸮿��� �����ȴ�.
						// �ڽ��� �����ϰ� �ִ� ���������� �ϳ��� ���� �ν��Ͻ��� ���̻� ���Ǿ��� �� ����.
		t1.channel = 7;	// channel ���� 7�� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");

		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}

//class Tv { 
//// Tv�� �Ӽ�(�������) 
//String color;          // ���� 
//boolean power;         // ��������(on/off) 
//int channel;           // ä�� 
//
//// Tv�� ���(�޼���) 
//void power()   { power = !power; }  
//void channelUp()   {  ++channel; }  
//void channelDown() {  --channel; }   
//}
