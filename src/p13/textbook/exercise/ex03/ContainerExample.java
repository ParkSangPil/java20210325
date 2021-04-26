package p13.textbook.exercise.ex03;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1);
		System.out.println(job);

		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2);
		System.out.println(age);
	}
}

class Container<T, V> {
	private T Key;
	private V Value;

	public void set(T Key, V Value) {
		this.Key = Key;
		this.Value = Value;
	}

	public T getKey() {
		return this.Key;
	}
	public V getValue() {
		return this.Value;
	}
}