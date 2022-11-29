package ch14;

@FunctionalInterface
interface MyFunction1 {
	void run();  // public abstract void run();
}

class LambdaEx1 {
	static void execute(MyFunction1 f) { // 매개변수의 타입이 MyFunction1인 메서드
		f.run();
	}

	static MyFunction1 getMyFunction1() { // 반환 타입이 MyFunction1인 메서드
		MyFunction1 f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		// 람다식으로 MyFunction1의 run()을 구현
		MyFunction1 f1 = ()-> System.out.println("f1.run()");

		MyFunction1 f2 = new MyFunction1() {  // 익명클래스로 run()을 구현
			public void run() {   // public을 반드시 붙여야 함
				System.out.println("f2.run()");
			}
		};

		MyFunction1 f3 = getMyFunction1();

		f1.run();
		f2.run();
		f3.run();

		execute(f1);
		execute( ()-> System.out.println("run()") );
	}
}
