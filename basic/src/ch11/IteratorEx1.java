package ch11;

import java.util.*;

/*
	Iterator, ListIterator, Enumeration은 모두 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스다.
	Enumeration은 Iterator의 구버전으로 가능한 Iterator을 사용하자
	ListIterator은 Iterator을 향상 시킨 것(Iterator에 양방향 조회기능추가)

	public interface Iterator {
		boolean hasNext();
		Object next();
		void remove(); //next로 읽어 온 요솔를 삭제. next()호출한 다음에 remove()를 호출해야 한다.
	}




*/
class IteratorEx1 {
	public static void main(String[] args) {
//		List list = new ArrayList(); 도 가능
//		Map인터페이스를 구현한 컬렉션 클래스는 key, value 쌍으로 저장하기 때문에 iterator() 직접호출은 어렵다.
//		key, value를각각 따로 얻어 온 후에 다시 iterator()를 호출하면 얻을 수 있다.
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
