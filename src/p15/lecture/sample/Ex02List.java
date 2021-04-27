package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(5, 2, 6, 9, 0);
		List<Integer> list2 = Arrays.asList(3, 5, 8, 2, 7);

		List<Integer> merge1 = merge1(list1, list2);
		System.out.println(merge1);

		List<Integer> merge2 = merge2(list1, list2);
		System.out.println(merge2);
	}

	private static List<Integer> merge2(List<Integer> list1, List<Integer> list2) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			if (!list.contains(list1.get(i))) {
				list.add(list1.get(i));
			}
			if (!list.contains(list2.get(i))) {
				list.add(list2.get(i));
			}
		}
		return list;
	}

	private static List<Integer> merge1(List<Integer> list1, List<Integer> list2) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			list.add(list1.get(i));
			list.add(list2.get(i));
		}
		return list;
	}
}
