package ch6;
class CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	}

	static void firstMethod() {
		secondMethod();
	}
	// static �޼���� ��ü �������� ȣ�� ����  
	static void secondMethod() {
		System.out.println("secondMethod()");		
	}
}
