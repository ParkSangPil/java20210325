package p05.lecture;

public class A23ForEach {
public static void main(String[] args) {
	// for each
	// 향상된 for문
	
	int[] arr1 = {9,8,7,6};
	
	// 그냥for
	for(int i = 0;i<arr1.length;i++) {
		System.out.print(arr1[i]+", ");
	}
	
	System.out.println("");
	
	//for each
	for(int n : arr1) {
		System.out.print(n+", ");
	}
}
}
