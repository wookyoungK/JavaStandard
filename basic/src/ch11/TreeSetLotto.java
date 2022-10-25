package ch11;

import java.util.*;

/*
	이진 검색 트리(binary search tree)는
	- 모든 노드는 최대 두 개의 자식노드를 가질 수 있다.
	- 왼쪽 자식노드의 값은 부모노드의 값보다 작고 오른쪽자식노드의 값은 부모노드의 값보다 커야한다.
	- 노드의 추가 삭제에 시간이 걸린다.(순차적으로 저장하지 않으므로)
	- 검색(범위검색)과 정렬에 유리하다.
	- 중복된 값을 저장하지 못한다.
* */

class TreeSetLotto {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);  // set.add(new Integer(num));
		}

		System.out.println(set);
	}
}
