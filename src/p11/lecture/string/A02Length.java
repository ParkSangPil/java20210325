package p11.lecture.string;

public class A02Length {
	public static void main(String[] args) {
		String str1 = "java servlet spring";
		int a = str1.length();
		System.out.println(a);
		
		String s1 = str1.substring(str1.length()-1, str1.length());  //or   (a-1,a);
		System.out.println(s1);
	}
}
