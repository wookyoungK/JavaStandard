package ch11;

import java.util.*;

/*
	Iterator, ListIterator, Enumeration�� ��� �÷��ǿ� ����� ��Ҹ� �����ϴµ� ���Ǵ� �������̽���.
	Enumeration�� Iterator�� ���������� ������ Iterator�� �������
	ListIterator�� Iterator�� ��� ��Ų ��(Iterator�� ����� ��ȸ����߰�)

	public interface Iterator {
		boolean hasNext();
		Object next();
		void remove(); //next�� �о� �� ��ָ� ����. next()ȣ���� ������ remove()�� ȣ���ؾ� �Ѵ�.
	}




*/
class IteratorEx1 {
	public static void main(String[] args) {
//		List list = new ArrayList(); �� ����
//		Map�������̽��� ������ �÷��� Ŭ������ key, value ������ �����ϱ� ������ iterator() ����ȣ���� ��ƴ�.
//		key, value������ ���� ��� �� �Ŀ� �ٽ� iterator()�� ȣ���ϸ� ���� �� �ִ�.
//		Map map = new HashMap();
//		Iterator it2 = map.keySet().iterator();

		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}


	} // main
}
