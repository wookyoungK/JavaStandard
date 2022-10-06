package ch11;
import java.util.*; 

class ArrayListEx2 { 
	public static void main(String[] args) { 
		final int LIMIT = 10;	// 자르고자 하는 글자의 개수를 지정한다.
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		int length = source.length(); 

/*		생성할 때 지정한 크기보다 더 많은 객체를 저장하면 자동적으로 크기가 늘어나기는 하지만 이 과정에서 처리시간이 많이 소요된다.
		ArrayList, Vector 같은 배열을 이용한 자료구조는 데이터를 읽어오고 저장하는 데는 효율이 좋지만, 변경 시 새로운 배열을 생성후(효율이 떨어짐)
		기존의 배열로부터 복사해 와야하기 때문에 처음 인스턴스 생성 시 고려해야한다.
*/
		List list = new ArrayList(length/LIMIT + 10); // 크기를 약간 여유 있게 잡는다.
//		ArrayList list = new ArrayList(length/LIMIT + 10);

		for(int i=0; i < length; i+=LIMIT) { 
			if(i+LIMIT < length ) 
				list.add(source.substring(i, i+LIMIT)); 
			else 
				list.add(source.substring(i)); 
		} 

		for(int i=0; i < list.size(); i++) { 
			System.out.println(list.get(i)); 
		} 
	} // main()
} 
