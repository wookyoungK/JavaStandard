package ch7;
class Card2 {
	final int NUMBER;		// 상수지만 선언과 함께 초기화 하지 않고
	final String KIND;		// 생성자에서 단 한번만 초기화할 수 있다.
	static int width  = 100;	
	static int height = 250;

	// 인스턴스를 생성할 때 final이 붙은 멤버변수를 초기화하기 위해 필요한 값을 생성자의 매개변수로부터 제공받는다.
	Card2(String kind, int num) {	
		KIND = kind;
		NUMBER = num;
	}

	Card2() {
		this("HEART", 1);
	}

	public String toString() {
		return KIND +" "+ NUMBER;
	}
}

class FinalCardTest {
	public static void main(String args[]) {
		Card2 c = new Card2("HEART", 10);
//		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());
	}
}
