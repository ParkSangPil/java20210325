package p05.lecture;

import java.util.Arrays;

public class A27ArrayOfArray {
	// 그림 : 11.배열의 배열.png
	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 6 };

		int[][] arr2 = { { 99, 88, 77 }, { 3, 4 } };
		
		System.out.println(Arrays.toString(arr2[0]));
		System.out.println(Arrays.toString(arr2[1]));
		
		System.out.println("arr2 의 길이 : "+arr2.length);
		System.out.println("arr2[0] 의 길이 : "+arr2[0].length);
		System.out.println("arr2[1] 의 길이 : "+arr2[1].length);
		
		arr2[0][2] = 66;
	}
}
