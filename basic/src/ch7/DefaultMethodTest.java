package ch7;
class DefaultMethodTest {
	public static void main(String[] args) {
		ChildDefaultMethod c = new ChildDefaultMethod();
		c.method1(); 
		c.method2();
		MyInterface.staticMethod(); //인터페이스의 static 메서드 접근가능 
		MyInterface2.staticMethod();
	}
}

  class ChildDefaultMethod extends ParentChildDefaultMethod implements MyInterface, MyInterface2 { 
	  public void method1() { 
		  System.out.println("method1() in Child"); // 오버라이딩 -> 인터페이스 메서드를 오버라이딩 하여 변경가
	  }
  }
  
  class ParentChildDefaultMethod { 
	  public void method2() {
		  System.out.println("method2() in Parent"); //조상클래스의 메서드는 다른 인터페이스 메서드(디폴트 메서드)를 무시한다.
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
