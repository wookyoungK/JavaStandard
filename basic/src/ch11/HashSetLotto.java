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

		//종복제거 동시에 저장순서 유지
		//Collection : 인터페이스 , Collections : 클래스
		List list = new LinkedList(set);	// LinkedList(Collection c)
		Collections.sort(list);				// Collections.sort(List list)
		System.out.println(list);
	}
}
