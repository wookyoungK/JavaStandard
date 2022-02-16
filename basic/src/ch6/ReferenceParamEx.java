package ch6;
class Data { int x; }
class ReferenceParamEx {
	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

	}
	// 값이 저장된 주소 값을 넘겨줌 
	// 일반 변수로 매개변수를 바꾸면 error 
	static void change(Data d) { // 참조형 매개변수 
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}

