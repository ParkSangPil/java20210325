package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
	// 정규표현식 
	// 문자열의 패턴을 표현하는 문자열
	// 특수문자 하나 이상 넣어주세요~~~ 같은거~
	// meta-character, quantifier
	//      수량          패턴
	
	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";
		
		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);
		
		regex1 = "java";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d"; // \d -> 는 숫자라는 의미
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d";
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d\\d";
		str1 = "67";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3}"; // 숫자 3개
		str1 = "678";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,}";  // 숫자 3개 이상
		str1 = "987139785";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "010-\\d{4}-\\d{4}";
		str1 = "010-4083-6159";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,5}"; // 숫자 3개~ 5개 
		str1 = "67342";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d+"; // == \d{1,}          숫자는 적어도 한개 이상
		str1 = "10";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d*"; // == \d{0,}         숫자가 적어도 0개 이상
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d?"; // == \d{0,1}          0 or 1 
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "010-?\\d{4}-?\\d{4}";
		str1 = "010-40836159";
		System.out.println(Pattern.matches(regex1, str1));
		
		String str2 = "01098763333";
		String str3 = "010-98763333";
		
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		
		
		regex1 = "\\w";
		str1 = "s";
		str2 = "T";
		str3 = "8";
		String str4 = "_";
		String str5 = " ";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "\\w\\d+";
		str1 = "e345678456132";
		str2 = "294598452641";
		str3 = "_216546532";
		System.out.println("여기여기!!");
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java)";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "(java)+";
		str1 = "javajavaj";
		str2 = "javajava";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		
		regex1 = "(java|python)"; // 또는
		str1 = "java";
		str2 = "python";
		str3 = "spring";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java|python)+";
		str1 = "java";
		str2 = "python";
		str3 = "pythonjavajavapython";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = ".";
		str1 = "$";
		str2 = ".";
		str3 = "A";
		str4 = "_";
		str5 = " ";
		System.out.println("여깃따!");
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "\\.";
		str1 = "$";
		str2 = ".";
		str3 = "A";
		str4 = "_";
		str5 = " ";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "[abc]"; // 나열된 놈만 쓰는 거 가능
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		
		regex1 = "[^abc]"; // 나열된 놈만 아니면! 쓰는 거 가능
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		
		regex1 = "[a-zA-Z]"; // 범위
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		str5 = "A";
		String str6 = "7";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		System.out.println(Pattern.matches(regex1, str6));
		
		regex1 = "[가-힣]"; // 범위
		str1 = "김";
		str2 = "팛";
		str3 = "쵫";
		str4 = "뷁";
		str5 = "하";
		str6 = "A";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		System.out.println(Pattern.matches(regex1, str6));
		
		regex1 = "[가-힣]+"; // 범위
		str1 = "김이박쵴ㅋㅋㅋㅋㅋㅋㅋㅋㅋ";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\p{IsHangul}+"; // 한글 ㅋㅋ
		str1 = "김이박쵴ㅋㅋㅋㅋㅋㅋㅋㅋㅋ";
		System.out.println(Pattern.matches(regex1, str1));
		
	}
}
