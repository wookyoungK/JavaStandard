package ch11;

import java.util.*;

/*
	���� �˻� Ʈ��(binary search tree)��
	- ��� ���� �ִ� �� ���� �ڽĳ�带 ���� �� �ִ�.
	- ���� �ڽĳ���� ���� �θ����� ������ �۰� �������ڽĳ���� ���� �θ����� ������ Ŀ���Ѵ�.
	- ����� �߰� ������ �ð��� �ɸ���.(���������� �������� �����Ƿ�)
	- �˻�(�����˻�)�� ���Ŀ� �����ϴ�.
	- �ߺ��� ���� �������� ���Ѵ�.
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
