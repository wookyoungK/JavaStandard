package ch6;
class Car2 {
	String color;		// ����
	String gearType;	// ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;			// ���� ����

	Car2() {
		this("white", "auto", 4);	
	} // �ʱⰪ�� ������ִ°Ͱ� ���  

	Car2(String color) {
		this(color, "auto", 4);
	}
	Car2(String color, String gearType, int door) {
		// �������� this�� �ν��Ͻ� �ڽ��� ����Ű�� ���������̴�. �ν��Ͻ������� ����Ų��.
		this.color    = color;
		this.gearType = gearType;
		this.door     = door;
	}
}

class CarTest2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();	
		Car2 c2 = new Car2("blue");

		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}
