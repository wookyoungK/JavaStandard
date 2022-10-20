package ch11;

import java.util.*;

class HashSetEx4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));

		System.out.println(set);
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {

		System.out.println("obj : "+obj);
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}

		return false;
	}

	//String클래스 메서드를 오버라이딩
	public int hashCode() {
		System.out.println("hash");
//		return (name+age).hashCode();
		return Objects.hash(name,age); //가능한 이 코드 사용
	}

	public String toString() {
		return name +":"+ age;
	}
}
