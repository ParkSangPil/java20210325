package p99.programmers;

import java.util.Scanner;

public class P12969 {
	public static void main(String[] args) {
		// 직사각형 별찍기
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자연수를 입력해주세요. \n 첫번째 가로 두번째 세로");
		int a = sc.nextInt();//5
		int b = sc.nextInt();//3
		
		System.out.println(a+", "+b);
		
		for(int i =0;i<b;i++) {
			for(int j=0;j<a;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
