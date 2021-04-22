package p11.lecture.arrays;

import java.util.Arrays;
//import static java.util.Arrays.*; 을 하면 아래에서 사용할 때 Arrays. 를 쓸 필요가 없음 

public class A02ArraysSort {
	public static void main(String[] args) {
		int[] arr1 = {29,2,5,4,98,7,9,1,9,15,6,5,6};
		
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"sprint","java","python","sugar"};
		
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
