package test.ch07.poly;

public class CarEx {
	// 메인함수 먼저실행
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		/* 
		Car 클래스 타입(Car 클래스의 필드와 메소드를 참조하는)의 myCar 변수선언,
		new 연산자를 사용해, Car 클래스(설계도)를 바탕으로 한 객체를 생성. myCar라는 변수에 대입
		(정확히는 myCar는 힙에담긴 객체의 주소를 갖고있음) 
		*/
		
		myCar.tire = new HankookTire();
		
		/*
		new 연산자를 사용해, HankookTire 클래스(설계도)를 바탕으로 한 객체를 생성하고,
		변수 myCar가 참조하는 Car 객체의 tire 필드값에 HankookTire 객체 대입
		
		★ myCar변수를 통해 객체에 접근하려면
		도트연산자 (객체접근연산자) 를 통해 객체가 가진 필드나 메소드 호출 가능
		 */
		
		myCar.run();
		
	}

}
