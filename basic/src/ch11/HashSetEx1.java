package ch11;

import java.util.*;

class HashSetEx1 {
	public static void main(String[] args) {

		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
//		Set set = new HashSet();
		HashSet set =new HashSet();
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
		}
             // HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);	
		//출력 : [1, 1, 2, 3, 4] 서로 다른 객체는 구별
	}
}
