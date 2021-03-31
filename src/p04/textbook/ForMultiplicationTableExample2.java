package p04.textbook;

public class ForMultiplicationTableExample2 {
public static void main(String[] args) {
	/*
	*
	**
	***
	****
	*****
	--------------------
	*****
	****
	***
	**
	*
	--------------------
	*****
	 ****
	  ***
	   **
	    *
	--------------------
	    *
	   **
	  ***
	 ****
	*****
	 */
	int i=0,j=0,z=0;
	for(i=0;i<5;i++) {
		for(j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	System.out.println("---------------------");
	for(i=5;i>0;i--) {
		for(j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	System.out.println("---------------------");
	for(i=5;i>0;i--) {
		for(z=5;z>i;z--) {
			System.out.print(" ");
		}
		for(j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	System.out.println("---------------------");
	for(i=5;i>0;i--) {
		for(z=0;z<i-1;z++) {
			System.out.print(" ");
		}
		for(j=6;j>i;j--) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
}
