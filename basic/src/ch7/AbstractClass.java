package ch7;

public class AbstractClass {

	public static void main(String[] args) {
		System.out.println("추상화 클래스 작성 테스");
	}
	abstract class Player{
		boolean pause;
		int currentPos;
		
		Player(){ //추상클래스도 생성자가 있어야 한다.
			pause = false;
			currentPos = 0;
		}
		abstract void play(int pos);
		abstract void stop();
		
		void play() {
			play(currentPos); //추상 메서드 사용가
		};
		
		void pause() {/* 내용 생*/}
	}
	
	class CDPlayer extends Player{
		void play(int currentPos) {};
		void stop() {};
		/*  내용생략 */
	}

}
