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

	//StringŬ���� �޼��带 �������̵�
	public int hashCode() {
		System.out.println("hash");
//		return (name+age).hashCode();
		return Objects.hash(name,age); //������ �� �ڵ� ���
	}

	public String toString() {
		return name +":"+ age;
	}
}
