package p05.lecture;

import java.util.Arrays;

public class A24ArrayOfArray {
	public static void main(String[] args) {
		int[] arr1 = new int[3];

		int[][] arr2 = new int[2][3];

		//              3 3 3
		// 행렬       2 o o o
		//            2 o o o

		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("--- 값 변경 ---");

		arr2[1][1] = 19;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("--- 값 변경 ---");

		arr2[0][2] = 8;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println("");
		}
		
		//Arrays.toString()을 활용 하려면
		System.out.println("Arrays.toSrting()");
		for(int i = 0 ; i<arr2.length;i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		for(int[] arr : arr2) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
