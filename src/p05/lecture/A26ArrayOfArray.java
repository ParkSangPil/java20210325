package p05.lecture;

import java.util.Arrays;

public class A26ArrayOfArray {
	public static void main(String[] args) {
		// 그림 : 10.배열의 배열.png
		int[][] arr = new int[2][];
		
		
		
		System.out.println("arr 길이: "+arr.length);
		for(int[] a : arr) {
			System.out.println(a);
		}
		
		arr[0] = new int[3];
		arr[1] = new int[4];
		
		// 길이
		System.out.println("arr[0] 길이:"+arr[0].length);
		System.out.println("arr[0] 길이:"+arr[1].length);
		
		for(int[] elem : arr) {
			System.out.println(Arrays.toString(elem));
		}
	}
}
