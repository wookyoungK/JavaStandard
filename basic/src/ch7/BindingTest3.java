package ch7;
class BindingTest3{
	public static void main(String[] args) {
		Parent5 p = new Child5();
		Child5  c = new Child5();

		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}
/*
 * 매서드의 경우는 오버라이딩된 것임
 * 멤버변수의 경우 참조변수의 타입에 따라 달라지지만
 * 매서드의 경우에는 참조변수의 탕비에 관계없이 항상 실제 인스턴스의 메서드(오버라이딩된 메서드) 호출
 * */

class Parent5 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child5 extends Parent5 {
	int x = 200;

	void method() {
		System.out.println("x=" + x);  // this.x와 같다.
		System.out.println("super.x=" + super.x);
		System.out.println("this.x="  + this.x);
	}
}
