package ch7;

public class AbstractClass {

	public static void main(String[] args) {
		System.out.println("�߻�ȭ Ŭ���� �ۼ� �׽�");
	}
	abstract class Player{
		boolean pause;
		int currentPos;
		
		Player(){ //�߻�Ŭ������ �����ڰ� �־�� �Ѵ�.
			pause = false;
			currentPos = 0;
		}
		abstract void play(int pos);
		abstract void stop();
		
		void play() {
			play(currentPos); //�߻� �޼��� ��밡
		};
		
		void pause() {/* ���� ��*/}
	}
	
	class CDPlayer extends Player{
		void play(int currentPos) {};
		void stop() {};
		/*  ������� */
	}

}
