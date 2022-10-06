package ch11;

import java.util.*;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);	// �뷮(capacity)�� 5�� Vector�� �����Ѵ�.
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);

		v.trimToSize();	// �� ������ ���ش�.(�뷮�� ũ�Ⱑ ��������.)
		// �迭�� ũ�⸦ ������ �� ���� ������ ���ο� �迭�� �����ؼ� �� �ּҰ��� ���� v�� �Ҵ��Ѵ�. ������ vector�ν��Ͻ��� �� �̻� ����� �� ������ gc�� ���� ���� �ȴ�.
		System.out.println("=== After trimToSize() ===");
		print(v);

		// �뷮�� ����ϸ� �ƹ��ϵ� �Ͼ�� �ʴ´�. ������ ������� �ʴٸ� ���ο� �ν��Ͻ��� �Ҵ�ȴ�.
		v.ensureCapacity(6);
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);

		// �뷮�� ����ϸ� �ƹ��ϵ� �Ͼ�� �ʴ´�. ������ ������� �ʴٸ� ���ο� �ν��Ͻ��� �Ҵ�ȴ�.
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
