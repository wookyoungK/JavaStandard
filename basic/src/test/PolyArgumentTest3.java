package test;
import java.util.Vector;			// VectorŬ������ ����ϱ� ���ؼ� �߰��� �־���.

class Product3 {
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product3(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product3() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv5 extends Product3 {
	Tv5() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer3 extends Product3 {
	Computer3() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio3 extends Product3 {
	Audio3() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer3 {			// ��, ������ ��� ���
	int money = 1000;  	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����
	Vector item = new Vector();	// ������ ��ǰ�� �����ϴµ� ���� Vector��ü

	void buy(Product3 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}
		money -= p.price;			// ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		item.add(p);				// ������ ��ǰ�� Vector�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void refund(Product3 p) {	// ������ ��ǰ�� ȯ���Ѵ�.
		if(item.remove(p)) {	// ��ǰ�� Vector���� �����Ѵ�.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {			//  ���ſ� ������ ���
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");		
		}
	}

	void summary() {		      // ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum = 0;		      // ������ ��ǰ�� �����հ�
		String itemList =""; 	  // ������ ��ǰ���
		
		if(item.isEmpty()) {	// Vector�� ����ִ��� Ȯ���Ѵ�.
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}

		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<item.size();i++) {
			Product3 p = (Product3)item.get(i);	
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

class PolyArgumentTest3 {
	public static void main(String args[]) {
		Buyer3 b = new Buyer3();
		Tv5 tv = new Tv5();
		Computer3 com = new Computer3();
		Audio3 audio = new Audio3();

		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
