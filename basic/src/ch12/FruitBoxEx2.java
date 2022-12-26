/*
package ch12;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

interface Eatable {
}

class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
//		FruitBox<Toy>   toyBox    = new FruitBox<Toy>();   // 에러.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 에러. Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);
    }  // main
}

// 지네릭 타입에 'extends'를 사용하면, 특정 타입의 잣곤들만 대입할 수 있게 제한
// 만약 클래스가 아니라 인터페이스를 구현해야 한다는 제약이 필요하다면, implements가 아니라 extends를 사용한다
class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
*/
