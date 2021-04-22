package p11.textbook.exercise.ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-z][a-zA-Z0-9]{7,11}";
//		String regExp = "[a-zA-z](\\d|[a-zA-Z]{7,11})";        \w => [a-zA-Z0-9_]
		
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}else {
			System.out.println("ID로 사용할 수 없없없없없습니다.");
		}
	}
}
