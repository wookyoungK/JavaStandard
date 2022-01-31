package ch6;
class Tv { 
     // Tv�� �Ӽ�(�������) 
     String color;           	// ���� 
     boolean power;         	// ��������(on/off) 
     int channel;           	// ä�� 

     // Tv�� ���(�޼���) 
     void power()   { power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼���  
     void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
     void channelDown() { --channel; }   // TV�� ä���� ���ߴ� ����� �ϴ� �޼���  
}

class TvTest { 
      public static void main(String args[]) { 
            Tv t;                  // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����       
            t = new Tv();          // Tv�ν��Ͻ��� �����Ѵ�. 
            t.channel = 7;         // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�. 
            t.channelDown();       // Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�. 
            System.out.println("���� ä���� " + t.channel + " �Դϴ�."); 
      } 
} 
