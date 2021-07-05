package Com.jbk;

public class Car {
	 int speed;
	void m1(int sp){
		if(sp > 0) {
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
