package Com.hi;

public class ClassA {
	public void m1() 	{  // It is Public Method/Modifier - The code is accessible for
		                    // all  classes
		System.out.println("Hello");
	}
	public void m2() {  // it is private method/Modifier - Within same/Declared class
		System.out.println("Hi");
	}
	void m3() {		// Its Default method/Modifier - In same package 
		System.out.println("java");
	}
	
	public static void main(String[] args) {
		ClassA aa = new ClassA();
		aa.m1();
		aa.m2();
		aa.m3();
	}

}
