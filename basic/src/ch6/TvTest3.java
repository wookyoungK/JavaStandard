package ch6;
class TvTest3 {
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

		t2 = t1;		// t1이 저장하고 있는 값(주소)을 t2에 저장한다.
						// 그렇게 되면 t2역시 t1이 참조하고 있던 인스턴스를 같이 참조하게 되어 t2가 원래 참조하고 있던 인스턴스는 더이상 사용할 수 없다
						// 카비지 컬렉터에 의해서 자동적으로 메모리에서 삭제된다.
						// 자신을 참조하고 있는 참조변수가 하나도 없는 인스턴스는 더이상 사용되어질 수 없다.
		t1.channel = 7;	// channel 값을 7로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}

//class Tv { 
//// Tv의 속성(멤버변수) 
//String color;          // 색상 
//boolean power;         // 전원상태(on/off) 
//int channel;           // 채널 
//
//// Tv의 기능(메서드) 
//void power()   { power = !power; }  
//void channelUp()   {  ++channel; }  
//void channelDown() {  --channel; }   
//}
