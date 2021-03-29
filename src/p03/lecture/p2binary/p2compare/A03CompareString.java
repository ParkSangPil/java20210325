package p03.lecture.p2binary.p2compare;

public class A03CompareString {
public static void main(String[] args) {
	String a = "abc";
	String b = "def";
	
//	System.out.println(a<b);  //비교 불가능
	
	String c = "a";
	String d = "b";
	
//	System.out.println(c<d);  // 한글자도 불가능
	
	char e = 'a';
	char f = 'b';
	System.out.println(e<f);   // 요건 됨 ㅋㅋㅋ
	
	// 동긍한가(==) 동등하지 않다 (!=) 정도는 쓴다.
	String str1 = "java";
	String str2 = "java";
	System.out.println(str1 == str2);
	
	String str3 = "ja";
	String str4 = "va";
	String str5 = str3 + str4;
	System.out.println(str1);
	System.out.println(str5);
	
	//문자열이 같은지 확인하는 메소드
	//equals
	
	System.out.println(str1.equals(str5));
}
}
