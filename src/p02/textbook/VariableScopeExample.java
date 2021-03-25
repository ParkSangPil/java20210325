package p02.textbook;

public class VariableScopeExample {
public static void main(String[] args) {
	int v1 = 15;
	if(v1>10) {
		int v2 = v1 - 10;
	}
	int v3 = v1 + v2 + 5; //v2 를 쓸 수가 없어서 컴파일 에러가 생김
}
}
