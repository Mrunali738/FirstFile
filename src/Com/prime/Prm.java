package Com.prime;


public class Prm {

	public static void main(String[] args) {
		int n=7;
		int count=0;
		for(int i=2;i<7;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("non prime");
		}
		}
	
	}
		
	
		
	

