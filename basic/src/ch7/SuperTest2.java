package ch7;
class SuperTest2 {
	public static void main(String args[]) {
		Child2 c = new Child2();
		c.method();
	}
}
class Parent2 {
	int x=10;  //같은이름의 매개변수
}

class Child2 extends Parent2 {
	int x=20; //같은이름의 지역변수 

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}
