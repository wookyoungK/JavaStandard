package ch6;
class BlockTest {
	// �����ؼ� ���� ���� 
	static {
		System.out.println("static { }");
	}

	{
		System.out.println("{ }");
	}

	public BlockTest() {     
		System.out.println("������");
	}

	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();

		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}
