package p08.textbook.exercise.p3;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
//		soundable.sound();         void 일 경우
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
