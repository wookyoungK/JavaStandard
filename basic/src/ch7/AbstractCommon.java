package ch7;

public class AbstractCommon {

	public static void main(String[] args) {
		System.out.println("추상화 -> 공통화 ");
	}

	abstract class Unit{
		int x,y;
		abstract void move(int x, int y);
		void stop() {};
	}
	class Marine extends Unit{
		void move(int x, int y) {};
		void stimPack() {};
	}
	class Tank extends Unit{
		void move(int x, int y) {};
		void changePack() {};
	}
	class Dropship extends Unit{
		void move(int x, int y) {};
		void load() {};
	}
	/*
	 * class Marine{ int x,y; void move(int x, int y) {}; void stop() {}; void
	 * stimPack() {}; } class Tank{ int x,y; void move(int x, int y) {}; void stop()
	 * {}; void stimPack() {}; } class Dropship{ int x,y; void move(int x, int y)
	 * {}; void stop() {}; void stimPack() {}; }
	 */}
