package p05.lecture;

import java.util.Arrays;

public class A10Array {
public static void main(String[] args) {
	// array(배열) : 여러개의 값을 갖는 자료형
	
	int i;
	i = 5;
	
	int[] arr; // 배열도 참조타입이다
	arr = new int[3];
	arr[0] = 5;
	arr[1] = 7;
	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	
	// 한번에 출력하는 법
	System.out.println(Arrays.toString(arr));
}
}
