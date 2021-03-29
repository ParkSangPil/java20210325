package p03.lecture.p2binary.p3logical;

public class A03Logical {
	public static void main(String[] args) {
		// and &&, & (논리곱)
		// or ||, | (논리합)
		// xor ^ (배타적 논리 합)
		// not ! (단항 연산자에서 살펴봄)
		
		// and &&, &
		// 연산의 겨롸 boolean
		// 양변이 모두 true일 때만 true 나머지는 모두 false
		System.out.println(true && true); //true
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		//short circuit
		int i = 3;
		System.out.println(true && (i++)>0);
		System.out.println(i);
		
		System.out.println(false && (i++) > 0);
		System.out.println(i);
		// 이 쉽새끼들 처음에 오는 개체가 false면 뒤는 보지도 않고 그냥 
		// false처리 해버리기 때문에 ++연산이 작동하지 않는다
		
		System.out.println(false & (i++)>0);
		System.out.println(i);
		// 그걸 방지하기 위해서 &가 있다.
		
		
		
		// or ||, |
		// 양변이 false 일 때만 false 
		// 나머지는 모두 true
		i = 0;
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false); // false
		
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false); // false
		
		System.out.println(true || (i++) > 0);
		System.out.println(i);
		System.out.println(false || (i++) > 0);
		System.out.println(i);
		
		
		// xor ^ (exclusive or)
		// 두 항의 값이 다를 때만 true
		// 두 항의 값이 같으면 false
		System.out.println("xor");
		System.out.println(true ^ true); // false
		System.out.println(true ^ false);  // true
		System.out.println(false ^ true);  
		System.out.println(false ^ false);  
	}
}
