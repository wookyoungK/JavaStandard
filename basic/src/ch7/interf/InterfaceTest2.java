package ch7.interf;

/*
	매개변수를 통해서 인터페이스를 동적으로 제공받는다.
*/
class A2 {
    void autoPlay2(I2 i2) {
          i2.play2();
     }
 }

 interface I2 {
      public abstract void play2();

 }

 class B2 implements I2 {
     public void play2() {
          System.out.println("play in B class");
     }
 }

 class C2 implements I2 {
     public void play2() {
          System.out.println("play in C class");
     }
 }

class InterfaceTest2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.autoPlay2(new B2()); // void autoPlay(I i)호출
		a.autoPlay2(new C2()); // void autoPlay(I i)호출
	}
}
