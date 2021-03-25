package p02.lecture;

public class A07TypeChar {
public static void main(String[] args) {
//	char : 2byte (8bit) 문자 저장
	
//	javascript
//	var a  = "a";
//	var b = "가";
	
//	java 문자열
	String s1 = "Hello"; //큰 따옴표 string literal
	s1 = "자바";
	s1 = "자";
	s1 = "a";
	
//	java 문자
	char charVar;
//	charVar = "a"; //not ok
	charVar = 'a'; //char literal
	charVar = '\uB208';
	System.out.println(charVar);
	charVar = 45576;
	System.out.println(charVar);
	charVar = '\u10E6';
	System.out.println(charVar);
}
}
