package demoPackage;


public class CalculatorTest {

	public static void main(String[] args) {
		calculator cc = new calculator();
		int add = cc.addition(10, 20);
		System.out.println(add);
		int sub = cc.substraction(10,20);
		System.out.println(sub);
		int mult = cc.multiplication(10,20);
		System.out.println(mult);
		int div =cc.division(10, 20);
		System.out.println(div);
		
		
	
	}

}
