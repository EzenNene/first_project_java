package test.ch06;

public class GetSet {
	private int speed;
	private boolean stop; // 자동차 멈추면 true, 자동차 달릴때 false
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		if (speed < 0) {
			this.speed = 0;
			return; // 함수 끝냄
		} else {
			this.speed = speed;
		}
		
		public void setStop(boolean stop) {
			this.stop = stop;
			if (stop == true) this.speed = 0;
		}
		
		this.stop = stop;
	}

	
	
//	public int getSpeed() {
//		return this.speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
	
	
	
}
