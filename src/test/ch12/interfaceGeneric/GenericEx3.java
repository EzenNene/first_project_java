package test.ch12.interfaceGeneric;

// 결정되지 않은 타입 파라메터로 처리

interface Rentable<P> {
	P rent(); // 메소드의 리턴타입 미정
}

//================================================

class Car {
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
}
class Home {
	public void turnOnLight() {
		System.out.println("전등을 켭니다.");
	}
}

//================================================

class CarAgency implements Rentable<Car> {
	@Override
	public Car rent() {
		return new Car(); // car 객체를 리턴
	}
}
class HomeAgency implements Rentable<Home> {
	@Override
	public Home rent() {
		return new Home(); // home 객체를 리턴
	}
}

//================================================

public class GenericEx3 {

	public static void main(String[] args) {
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
		
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
	}

}
