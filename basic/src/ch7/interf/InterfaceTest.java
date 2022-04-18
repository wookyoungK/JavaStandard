package ch7.interf;

class A {
      public void methodA(I i) { 
            i.methodC(); 
      } 
} 

class B implements I { 
      public void methodC() { 
            System.out.println("methodB()"); 
      }
} 


class InterfaceTest { 
      public static void main(String args[]) { 
            A a = new A(); 
            a.methodA(new B()); 
      } 
}

interface I {
	void methodC();
}