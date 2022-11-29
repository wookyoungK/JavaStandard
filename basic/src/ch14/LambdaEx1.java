package ch14;

@FunctionalInterface
interface MyFunction1 {
	void run();  // public abstract void run();
}

class LambdaEx1 {
	static void execute(MyFunction1 f) { // �Ű������� Ÿ���� MyFunction1�� �޼���
		f.run();
	}

	static MyFunction1 getMyFunction1() { // ��ȯ Ÿ���� MyFunction1�� �޼���
		MyFunction1 f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		// ���ٽ����� MyFunction1�� run()�� ����
		MyFunction1 f1 = ()-> System.out.println("f1.run()");

		MyFunction1 f2 = new MyFunction1() {  // �͸�Ŭ������ run()�� ����
			public void run() {   // public�� �ݵ�� �ٿ��� ��
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
