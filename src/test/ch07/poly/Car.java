package test.ch07.poly;

public class Car {
	
	// 필드
	public Tire tire =  new HankookTire();

	public void run() {
		tire.roll();
	}
}
