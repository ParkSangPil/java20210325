package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex05List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4,6,9,10);
		List<Integer> list2 = Arrays.asList(-3,-8,-10,-99,-22);
		List<Integer> list3 = Arrays.asList(8888, 9999, 222, 111);
		List<Integer> list4 = Arrays.asList(3030,223,123);

//		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<List<Integer>> list = new ArrayList<>();

		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);

		int max = max(list);
		System.out.println(max);

		int max2 = max2(list);
		System.out.println(max);
		
		List<Integer> flatList = flat(list);
		System.out.println(flatList.size());
		System.out.println(flatList.get(15));
		System.out.println(flatList);

	}

	private static List<Integer> flat(List<List<Integer>> list) {
		List<Integer> list11 = new ArrayList<>();
		for (int i = 0 ; i < list.size() ; i++) {
			for (int j = 0 ; j < list.get(i).size() ; j++) {       //
				list11.add(list.get(i).get(j));                    // list11.addAll(list.get(i)) 로 바꿀수도 있다.
			}                                      				   //
		}
		
//		for (List<Integer> i : list) {
//			for (int item : i) {
//				list11.add(item);
//			}
//		}
		
		return list11;
	}

	private static int max2(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;

		for (List<Integer> i : list) {
			for (int item : i) {
				if (max < item) {
					max = item;
				}
			}
		}
		return max;
	}

	private static int max(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				if (max < list.get(i).get(j)) {
					max = list.get(i).get(j);
				}
			}
		}
		return max;
	}
}
