package p15.lecture;

import java.util.ArrayList;
import java.util.List;

public class A02List {
	// List : 순서가 있고 중복 저장 가능
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// add : 값 추가
		list.add("java");
		list.add("spring");
		list.add("python");
//		list.add(3);
		
		// size : 크기
		int len = list.size();
//		int len2 = list.length()
		System.out.println(len);
		
		// get : 꺼내기
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
//		String e4 = list.get(3);  // exception 발생!
		
		// for 탐색
		System.out.println("for 탐색");
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 향상된 for 탐색
		System.out.println("향상된 for 탐색");
		for (String e : list) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		// remove : 삭제,제거
		list.add("servlet");   // 3번 인덱스에 들어갔을 것
		System.out.println("지우기 전 탐색");
		for (String e : list) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		list.remove(3);
		System.out.println("지운 후 탐색");
		for (String e : list) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		list.add("object");
		System.out.println("지우기 전 탐색");
		for (String e : list) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		list.remove("java");
		System.out.println("지운 후 탐색");
		for (String e : list) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		
	}
}
