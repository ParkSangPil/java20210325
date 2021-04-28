package p15.lecture;

import java.util.Stack;

public class A05Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(3);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		
		int last = stack.pop();
		System.out.println(last);
		last = stack.pop();
		System.out.println(last);
		last = stack.pop();
		System.out.println(last);
		
		System.out.println(stack);
		stack.remove(2);
		System.out.println(stack);
		
//		last = stack.pop();
//		System.out.println(last);     // 익셉션
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		last = stack.peek();
		System.out.println(last);
		last = stack.peek();
		System.out.println(last);
	}
}
