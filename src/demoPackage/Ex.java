package demoPackage;

public class Ex { 
	void m1() {
		int v = m2(10);
		System.out.println("A class" +v);
	}
	int m2(int a) {
		int c = m3();
		System.out.println(a);
		return 30 + c;
	}
	int m3() {
		return 50;
	}
	
	public static void main(String[] args) {
		Ex e = new Ex();
		e.m1();
		
	}

}
