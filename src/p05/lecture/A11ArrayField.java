package p05.lecture;

import java.util.Arrays;

public class A11ArrayField {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];

		System.out.println(arr1.length);
		System.out.println(arr2.length);

//	arr1[0] = 10;
//	arr1[1] = 11;
//	arr1[2] = 12;
		for (int i = 0; i < 3; i++) {
			arr1[i] = (10 + i);
		}

//	arr2[0] = 100;
//	arr2[1] = 200;
//	arr2[2] = 300;
//	arr2[3] = 400;
//	arr2[4] = 500;
		for (int i = 0; i < 5; i++) {
			arr2[i] = (100 * i);
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
