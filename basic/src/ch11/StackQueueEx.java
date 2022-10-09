package ch11;

import java.util.*;

/*
* Stack : LIFO -> ArrayList 에 더 적합(한 방향으로 넣고 빼는 파이프구조)
* 			자바에서는 Stack클래스로 구현하여 제공
* Queue : FIFO -> LinkedList 에 더 적합(위아래로 뚫려 있어 한 방향으로 넣고 다른 한 방향으로 빼는 구조)
* 			Queue인터페이스로만 정의해 놓음 별도의 클래스 제공하지 않는다. Queue인터페이스를 구현한 클래스들이 있어서 이 들 중의 하나사용
* */
class StackQueueEx {
	public static void main(String[] args) {
		Stack st = new Stack(); //Stack클래스
		Queue q = new LinkedList();	 // Queue인터페이스의 구현체인 LinkedList를 사용

		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
