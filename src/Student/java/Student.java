package Student.java;

public class Student {
	private int age;
	private String name;
	
	void setdata(int a,String s) {
		age= a;
		name= s;
	}
	void getdata() {
		System.out.println(age);
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.setdata(22, "Mayuri");
		
		s.getdata();
	}

		}


