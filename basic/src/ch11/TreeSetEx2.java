package ch11;

import java.util.*;

class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

		for(int i=0; i < score.length; i++)
			set.add(new Integer(score[i]));

		//지정된 기준 값 보다 큰 값의 객체들과 작은 값의 객체들을 얻는다.
		System.out.println("50보다 작은 값 :"	+ set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 :"	+ set.tailSet(new Integer(50)));
	}
}
