package Encapsulation;

public class Encn1 {
	private int speed;
	void setspeed2(int sp) {
		if(sp > 0 && sp<300) {
			speed = sp;
		}
		else {
			speed = 0;
		}

	}
	void display() {
		System.out.println("speed t display is >>" + speed);
	}

}
