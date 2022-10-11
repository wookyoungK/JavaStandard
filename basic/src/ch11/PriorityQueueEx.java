package ch11;

import java.util.*;


/*
	Queue�������̽��� ����ü ���� �ϳ���, ������ ������ ������� �켱����(priority)�� ���� �ͺ��� ������ �ȴٴ� Ư¡
	null�� ������ �� ������, ���� �� �����߻�
	PriorityQueue�� ����������� �迭�� ����ϸ�, �� ��Ҹ� ��(heap)�̶�� �ڷᱸ���� ���·� �����Ѵ�.
	���� Ʈ���� �� ������ ���� ū ���̳� ���� ���� ���� ������ ã�� �� �ִٴ� Ư¡�� �ִ�.

	�� �ܿ���
	Deque(DOuble - Ended Queue)
	Queue�� �������� �� �� �����θ� �߰�/������ �� �ִ� ť�� �޸�
	Deque(��,��ť)�� ���� ���� �߰�/������ �����ϴ�, ����ü�δ� ArrayDeque, LinkedList���� �ִ�.
	���� ���ð� ť�� �ϳ��� ���ĳ��� �Ͱ� ����.
 */
class PriorityQueueEx {
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);  // pq.offer(new Integer(3)); ����ڽ�
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);

		System.out.println(pq); // pq�� ���� �迭�� ���

		Object obj = null;

		// PriorityQueue�� ����� ��Ҹ� �ϳ��� ������.
		while((obj = pq.poll())!=null) 
			System.out.println(obj);
	}
}
