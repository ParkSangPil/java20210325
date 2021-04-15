package p06.textbook.s060705;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car() {

	}

	Car(String model) {
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
		System.out.println("string string int");//뭘 쓰려면 this가 위에 있어야 함
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}