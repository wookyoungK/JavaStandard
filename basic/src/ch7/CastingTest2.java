package ch7;
class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();
		//Car car =new FireEngine(); 
		//�� �������ָ� ok 
		Car car2 = null;
		FireEngine fe = null;
  
		car.drive();
		// ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� ������ �� ������ car��� ���������� ����Ÿ���� �ν��Ͻ��� ���������� ����ȯ���� ������ ������
		// �Ʒ��� ���� �ڼ�Ÿ���� ���������� ����Ÿ���� �ν��Ͻ��� �����ϱ� ������ ����������.
		//������ ������ �ÿ��� ������������ Ÿ�Ը� ü���ϱ� ������ ����� ������ �ν��Ͻ��� Ÿ�Կ� ���ؼ��� ���� ���� ���Ѵ�.
		
		
		fe = (FireEngine)car;		// 8��° ��. �������� OK. ���� �� ������ �߻�
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
