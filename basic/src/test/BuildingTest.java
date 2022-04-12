package test;

public class BuildingTest {

	public static void main(String[] args) {
		// 인터페이스 설계 예시) 건물
	}
	class Building {
		
	};
	
	
	interface Liftable {
		void liftOff();

		void move(int x, int y);

		void stop();

		void land();
	};

	class LiftableImpl implements Liftable{
		public void liftOff() {
			System.out.println("liftoff");
		}

		public void move(int x, int y) {
			System.out.println("move");
		}

		public void stop() {
			System.out.println("stop");
		}

		public void land() {
			System.out.println("land");
		}
	};

	
	class Barrack extends Building implements Liftable {
		
		LiftableImpl l = new LiftableImpl();
		
		void radio() {
			l.stop();
		};
		
		public void liftOff() {
			System.out.println("liftoff");
			l.liftOff();
		}

		public void move(int x, int y) {
			System.out.println("move");
			l.move(x, y);
		}

		public void stop() {
			System.out.println("stop");
			l.stop();
		}

		public void land() {
			System.out.println("land");
			l.land();
		}
	}
	class Factory extends Building implements Liftable {
		LiftableImpl l = new LiftableImpl();
		public void liftOff() {
			System.out.println("liftoff");
			l.liftOff();
		}

		public void move(int x, int y) {
			System.out.println("move");
			l.move(x, y);
		}

		public void stop() {
			System.out.println("stop");
			l.stop();
		}

		public void land() {
			System.out.println("land");
			l.land();
		}
	}

}
