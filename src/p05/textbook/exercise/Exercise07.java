package p05.textbook.exercise;

public class Exercise07 {
public static void main(String[] args) {
	int[] array = {-11,-5,-6,-9};
	int max = array[0];
	int min = array[0];
	
	for(int i = 0 ; i<array.length;i++) {
		if(max<array[i]) {
			max = array[i];
		}
	}
	
	for(int i = 0 ; i<array.length;i++) {
		if(min>array[i]) {
			min = array[i];
		}
	}
	
	int sum = 0;
	for(int i = 0 ; i<array.length;i++) {
		sum += array[i];
	}
	System.out.println("max: "+max);
	
	System.out.println("min: "+min);
	
	System.out.println("sum: "+sum);
	
	System.out.println("avg: "+(double)sum/array.length);
}
}
