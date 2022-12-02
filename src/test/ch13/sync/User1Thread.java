package test.ch13.sync;

public class User1Thread extends Thread {

	private Calculator calculator;

	public User1Thread() {
		setName("user1Thread"); // 쓰레드 이름 변경
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	// 쓰레드가 실행될 때 실행되는 코드
	@Override
	public void run() {
		calculator.setMemory1(100);
	}

}
