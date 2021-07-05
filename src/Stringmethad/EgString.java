package Stringmethad;

public class EgString {
	public static void main(String[] args) {
		String s = "hello welcome";//s=hello//
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.concat("jbk"));
		System.out.println(s.indexOf('l'));
		System.out.println(s.endsWith("me"));
		System.out.println(s.startsWith("he"));
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(2));
		System.out.println(s.substring(3, 7));
		System.out.println(s.replace('e', 'p'));
	}

}
