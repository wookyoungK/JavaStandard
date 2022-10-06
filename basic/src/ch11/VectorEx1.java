package ch11;

import java.util.*;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);	// 용량(capacity)이 5인 Vector를 생성한다.
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);

		v.trimToSize();	// 빈 공간을 없앤다.(용량과 크기가 같아진다.)
		// 배열은 크기를 변경할 수 없기 때문에 새로운 배열을 생성해서 그 주소값을 변수 v에 할당한다. 기존의 vector인스턴스는 더 이상 사용할 수 없으면 gc에 의해 제거 된다.
		System.out.println("=== After trimToSize() ===");
		print(v);

		// 용량이 충분하면 아무일도 일어나지 않는다. 하지만 충분하지 않다면 새로운 인스턴스가 할당된다.
		v.ensureCapacity(6);
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);

		// 용량이 충분하면 아무일도 일어나지 않는다. 하지만 충분하지 않다면 새로운 인스턴스가 할당된다.
		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :" + v.size());
		System.out.println("capacity :" + v.capacity());
	}
}
