package ch6;
class Tv { 
     // Tv의 속성(멤버변수) 
     String color;           	// 참조형변수 
     boolean power;         	 
     int channel;           	

     // Tv의 기능(메서드) 
     void power()   { power = !power; } 
     void channelUp()   {  ++channel; }  
     void channelDown() { --channel; }    
}

class TvTest { 
      public static void main(String args[]) { 
            Tv t;                  // Tv인스턴스를 참조하기 위한 변수 t를 선언, 메모리에 참조변수 t를 위한 공간 마련 
            t = new Tv();          // Tv인스턴스를 생성한다. Tv 클래스의 인스턴스가 메모리의 빈 공간에 생성된다.
            					   // 객체의 주소값이 참조변수 t에 저장된다. -> 참조변수 t를 통해 Tv인스턴스에 접근 가능
            t.channel = 7;         // Tv인스턴스의 멤버변수 channel의 값을 7로 한다. 
            t.channelDown();       // Tv인스턴스의 메서드 channelDown()을 호출한다. 
            System.out.println("현재 채널은 " + t.channel + " 입니다."); 
      } 
} 
