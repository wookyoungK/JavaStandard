package ch11;

import java.util.*;

public class MyVector2 extends MyVector implements Iterator {
	int cursor  = 0;
	int lastRet = -1;
	
	public MyVector2(int capacity) {
		super(capacity);		
	}
	
	public MyVector2() {
		this(10);		
	}

	public String toString() {
		String tmp = "";
		Iterator it = iterator();

		for(int i=0; it.hasNext();i++) {
			if(i!=0) tmp+=", ";
			tmp += it.next(); 	// tmp += next().toString();
		}

		return "["+ tmp +"]";		
	}

	public Iterator iterator() {
		cursor=0;		// cursor�� lastRet�� �ʱ�ȭ �Ѵ�.
		lastRet = -1;
		return this;		
	}	
	
	public boolean hasNext() {
		System.out.println("hasNext");
		System.out.println(size());
	    return cursor != size();
	}
	
    public Object next(){
		System.out.println("next ȣ��");
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
    }
	
	public void remove() {
		System.out.println("remove ȣ��");
         // ���̻� ������ ���� ������ IllegalStateException�� �߻���Ų��.
		if(lastRet==-1) {  
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--;           // ���� �Ŀ� cursor�� ��ġ�� ���ҽ�Ų��.
			lastRet = -1;		// lastRet�� ���� �ʱ�ȭ �Ѵ�.	
		}
	}		
} // class
