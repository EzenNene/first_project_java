package test.ch06;

public class Car2 {

	// 인스턴스 필드
	int speed;

	
	// 인스턴스 메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static {
		this.speed = 200;
	}
	
	// 정적(static) 메소드
	static void simulate() {
		Car2 myCar = new Car2();
		
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car2 myCar = new Car2();
		
		myCar.speed = 60;
		myCar.run();

	}

}
