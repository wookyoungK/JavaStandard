package ch6;
class Data1 {
	int value;
}

class Data2 {
	int value;

	Data2(int x) { 	// 매개변수가 있는 생성자.
		value = x;
	}
}
//public class Data1() {} 컴파일 시 기본생성자가 생긴다. class가 public이기 때문에 기본생성자도 public

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		//Data2 d2 = new Data2();		// compile error발생
		Data2 d2 = new Data2(10); // 생성자가 이미 선언되었기 때문에
	}
}
