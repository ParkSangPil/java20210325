package p05.lecture;

import java.util.Arrays;

public class A18ArraySample {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3,4,5,6,7};
		int[] arr2 = new int[] {99,88,70};
		
		double avg1 = avg(arr1);
		double avg2 = avg(arr2);
		
		System.out.println(avg1);
		System.out.println(avg2);
		
		int[] arr3 = new int[] {3,6,8,1,9,22};
		Arrays.sort(arr3);
		System.out.println(arr3);
		for(int i =0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}
	
	public static double avg(int[] arr) {
		double sum = 0;
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum/arr.length;
	}
}
