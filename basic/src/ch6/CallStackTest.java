package ch6;
class CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	}

	static void firstMethod() {
		secondMethod();
	}
	// static 메서드는 객체 생성없이 호출 가능  
	static void secondMethod() {
		System.out.println("secondMethod()");		
	}
}
