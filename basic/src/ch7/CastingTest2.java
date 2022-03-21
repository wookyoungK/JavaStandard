package ch7;
class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();
		//Car car =new FireEngine(); 
		//로 변경해주면 ok 
		Car car2 = null;
		FireEngine fe = null;
  
		car.drive();
		// 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있지만 car라는 참조변수는 조상타입의 인스턴스를 참조함으로 형변환에는 문제가 없지만
		// 아래와 같이 자손타입의 참조변수로 조상타입의 인스턴스를 참조하기 때문에 에러가난다.
		//하지만 컴파일 시에는 참조변수간의 타입만 체그하기 때문에 실행시 생성될 인스턴스읩 타입에 대해서는 전혀 알지 못한다.
		
		
		fe = (FireEngine)car;		// 8번째 줄. 컴파일은 OK. 실행 시 에러가 발생
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
