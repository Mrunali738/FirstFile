package Com.jbk2;

public class Car2 {
	private int speed;
	void setspeed(int sp) {
		if(sp>0) {
			speed = sp;
		}
		else {
			speed = 0;
		}


	}
	void display() {
		System.out.println("speed t display is >>"+ speed);
	}

}
