package test;
class InterfaceTest {
	public static void main(String args[]) {
		
	}
	
	abstract class Player{
		abstract void play(int pos);
		abstract void stop();
	}
	class AudioPlayer1 extends Player{
		void play(int pos) {};
		void stop() {};
		
	}
	abstract class AbstractPlayer extends Player{
		void play(int pos) {} 
	}
//	class AbstractPlayer2 extends Player{
//		void play(int pos) {} 
//		//만약 추상메서드를 모두 구현해주지 않는다면 자손 역시 추상클래스로 지정해 주어야 한다.
//	}
}
