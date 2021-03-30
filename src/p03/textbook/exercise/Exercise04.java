package p03.textbook.exercise;

public class Exercise04 {
public static void main(String[] args) {
	int pencils = 534;
	int students = 30;
	
	int pencilsPerStudent = pencils / students;
	System.out.println(pencilsPerStudent);
	
	int pencilSLeft = pencils % students;
	System.out.println(pencilSLeft);
}
}
