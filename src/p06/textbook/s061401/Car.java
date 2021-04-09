package p06.textbook.s061401;

public class Car {

	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() { //기본값이 false 다
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
