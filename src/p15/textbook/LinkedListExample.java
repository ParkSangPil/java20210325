package p15.textbook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<Integer> list3 = new LinkedList<>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i)); // Array 에서는 String.valueOf(i) 값을 0 에 집어넣겠단 거다
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 5; i++) {
			list2.add(String.valueOf(i));
		}
		System.out.println(list2);
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns");
		
		
		
		for (int i = 0; i < 5; i++) {
			list3.add(i);
			if (list3.get(i) == 3) {
				list3.add(50);
			}
		}
		System.out.println(list3);
		System.out.println(list3.get(4).);
		
		
		
	}
}
