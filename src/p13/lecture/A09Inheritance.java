package p13.lecture;

public class A09Inheritance {

}

class Generic9<T> {
	
}

class ChildGeneric9<T> extends Generic9<T> { // 부모의 타입 파라미터를 명시해야 한다.
	
}

class ChildGeneric92<T, U> extends Generic9<T> { // 또는 더 추가할 수 있다.
	
}

class ChildGeneric93 extends Generic9<String>{ // 또는 명시해 놨다면 쓸 필요는 없다.
	
}