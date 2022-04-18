package ch7.interf;

/*
 * 제3의 클래스를 통해서 인터페이스를 제공받는다.
*/
class InterfaceTest3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}
}

 class A3 {
    void methodA() {
          I3 i = InstanceManager.getInstance(); // 해당 메서드를 통해서 재공 받는다.
		  i.methodB();
		  System.out.println(i.toString()); // i로 Object클래스의 메서드 호출가능
     }
 }

 interface I3 {
      public abstract void methodB();
 }

 class B3 implements I3 {
     public void methodB() {
          System.out.println("methodB in B3 class");
     }

	 public String toString() { return "class B3";}
 }

 class InstanceManager {
	public static I3 getInstance() {
		return new B3();
	}
 }
