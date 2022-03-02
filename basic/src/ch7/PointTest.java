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
//		System.out.println("생성자 생성");
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
		// 조상 클래스의 생성자를 초기화시켜주어야한다. 위처럼 초기 생성자를 만들어주어 자동으로  super();가 생성되도록하던가
		// 조상 클래스의 생성자를 초기선언시켜주어야한다.
		super(x,y);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {	// 오버라이딩
		return "x :" + x + ", y :"+ y + ", z :" + z;
	}	
}
