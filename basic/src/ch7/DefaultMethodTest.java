package ch7;
class DefaultMethodTest {
	public static void main(String[] args) {
		ChildDefaultMethod c = new ChildDefaultMethod();
		c.method1(); 
		c.method2();
		MyInterface.staticMethod(); //�������̽��� static �޼��� ���ٰ��� 
		MyInterface2.staticMethod();
	}
}

  class ChildDefaultMethod extends ParentChildDefaultMethod implements MyInterface, MyInterface2 { 
	  public void method1() { 
		  System.out.println("method1() in Child"); // �������̵� -> �������̽� �޼��带 �������̵� �Ͽ� ���氡
	  }
  }
  
  class ParentChildDefaultMethod { 
	  public void method2() {
		  System.out.println("method2() in Parent"); //����Ŭ������ �޼���� �ٸ� �������̽� �޼���(����Ʈ �޼���)�� �����Ѵ�.
  	} 
  }

interface MyInterface {
	default void method1() { 
		System.out.println("method1() in MyInterface"); // 
	}
	
	default void method2() { 
		System.out.println("method2() in MyInterface");
	}

	static  void staticMethod() { 
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() { 
		System.out.println("method1() in MyInterface2");
	}

	static  void staticMethod() { 
		System.out.println("staticMethod() in MyInterface2");
	}
}
