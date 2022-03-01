package ch7;
class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

class Point2 {
	int x;	
	int y;

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

		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {	// �������̵�
		return "x :" + x + ", y :"+ y + ", z :" + z;
	}	
}
