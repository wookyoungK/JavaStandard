package ch7;
class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
		p3.getLocation();
	}
}

class Point2 {
	int x;	
	int y;

//	public Point2() {
//		System.out.println("������ ����");
//	}
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point2 {
	int z;

	Point3D(int x, int y, int z) {
		// ���� Ŭ������ �����ڸ� �ʱ�ȭ�����־���Ѵ�. ��ó�� �ʱ� �����ڸ� ������־� �ڵ�����  super();�� �����ǵ����ϴ���
		// ���� Ŭ������ �����ڸ� �ʱ⼱������־���Ѵ�.
		super(x,y);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {	// �������̵�
		return "x :" + x + ", y :"+ y + ", z :" + z;
	}	
}
