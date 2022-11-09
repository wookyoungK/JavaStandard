package ch12;

import java.util.ArrayList;

class Fruit		          { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}

class Juice {
	String name;

	Juice(String name)	     { this.name = name + "Juice"; }
	public String toString() { return name;		 }
}

//static메서드에는 타입 매개변수 T를 매개변수에 사용할 수 없으므로 아래와 같이 특정 타입을 지정
class Juicer {
	 /*
	 하지만 지네릭 타입을 고정해 놓으면 매개변수에 해당 지네릭 타입만 와야한다. 그래서 각각의 타입을 매개변수로 갖는 makeJuice()를 만들어야하지만
	 지네릭 타입이 다른 것만으로는 오버로딩이 성립하지 않는다. -> 오류 발생
	 이럴 때 사용하기 위해 고안된 것이 바로 '와일드 카드'이다 -> 기호 : ? 어떠한 타입도 될 수 있다.
	 상한 제한 : <? extends T> -> T와 그 자손들만 가능
	 하한 제한 : <? super T> -> T와 그 조상들만 가능
	 모두가능 <?>
	 */

	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f : box.getList()) 
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class FruitBoxEx3 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();

		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}  // main
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
//class FruitBox<T extends Fruit> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);      }
	T get(int i)     { return list.get(i); }
	ArrayList<T> getList() { return list;  }
	int size()       { return list.size(); }
	public String toString() { return list.toString();}
}
