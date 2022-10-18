package ch11;

import java.util.*;

class HashSetLotto {
	public static void main(String[] args) {
//		Set set = new HashSet();
		HashSet set = new HashSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}

		//�������� ���ÿ� ������� ����
		//Collection : �������̽� , Collections : Ŭ����
		List list = new LinkedList(set);	// LinkedList(Collection c)
		Collections.sort(list);				// Collections.sort(List list)
		System.out.println(list);
	}
}
