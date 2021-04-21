package p11.textbook.s110601;

import p06.lecture.p2field.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();		
		Class clazz1 = car.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		
		try {
			Class clazz2 = Class.forName("p06.lecture.p2field.Car");
			
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
					
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Class clazz3 = p06.lecture.p2field.Car.class;
	}
}
