package p15.lecture.sample;

import java.util.HashMap;
import java.util.Map;

public class Ex07Map {
	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 1, 3, 3, 2, 3, 2, 1, 4, 5, 5 };

		Map<Integer, Integer> map = count(arr1);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	private static Map<Integer, Integer> count(int[] arr1) {
		Map<Integer, Integer> map1 = new HashMap<>();
		for (int a : arr1) {
//			int count = 0;
//			int key = 0;
//			for(int i = 0 ; i < arr1.length ; i++) {
//				if(a == arr1[i]) {
//					count++;
//				}
//			}
//			map1.put(a, count);
			if(map1.containsKey(a)) {
//				int cnt = map1.get(a);
//				map1.put(a,cnt+1);
				map1.put(a,map1.get(a)+1);
			}else {
				map1.put(a, 1);
			}
		}
		return map1;
	}
}
