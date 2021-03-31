package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 수 입력>");
		int number1 = scanner.nextInt();
		System.out.print("두번째 수 입력>");
		int number2 = scanner.nextInt();

		System.out.println("입력한 수 : " + number1+", "+number2);
		int a = 1;
		int c = 0;
		if(number1>number2) {
			c = number1;
		}else if(number1<number2) {
			c = number2;
		}
		for(int i = 1 ; i < c ; i++) {
			if(((number1%i)==0) && ((number2%i)==0)) {
				a = i;
			}
		}
		System.out.println("최대 공약수는 "+a+"입니다.");
		scanner.close();
	}
}
