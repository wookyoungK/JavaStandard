package ch11;

import java.util.*;

class MyVector2Test {
	public static void main(String args[]) {
		MyVector2 v = new MyVector2();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");

		System.out.println("���� �� : " + v);
		Iterator it = v.iterator();
		it.next();
		it.remove();
		it.next();
		it.remove();

		System.out.println("���� �� : " + v);
	}
}
