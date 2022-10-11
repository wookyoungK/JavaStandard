package ch11;

import java.util.*;


/*
	Queue인터페이스의 구현체 중의 하나로, 저장한 순서에 관계없이 우선순위(priority)가 높은 것부터 꺼내게 된다는 특징
	null은 저장할 수 없으며, 저장 시 에러발생
	PriorityQueue는 저장공간으로 배열을 사용하며, 각 요소를 힙(heap)이라는 자료구조의 형태로 저장한다.
	이진 트리의 한 종류로 가장 큰 값이나 가장 작은 값을 빠르게 찾을 수 있다는 특징이 있다.

	이 외에도
	Deque(DOuble - Ended Queue)
	Queue의 변형으로 한 쪽 끝으로만 추가/삭제할 수 있는 큐와 달리
	Deque(덱,디큐)은 양쪽 끝에 추가/삭제가 가능하다, 구현체로는 ArrayDeque, LinkedList등이 있다.
	덱은 스택과 큐를 하나로 합쳐놓은 것과 같다.
 */
class PriorityQueueEx {
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);  // pq.offer(new Integer(3)); 오토박싱
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);

		System.out.println(pq); // pq의 내부 배열을 출력

		Object obj = null;

		// PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
		while((obj = pq.poll())!=null) 
			System.out.println(obj);
	}
}
