package p04.textbook;

public class Ch0404test {
public static void main(String[] args) {
	int dice1 = 0;
	int dice2 = 0;
	while(!((dice1+dice2)==5)) {
		dice1 = (int)(Math.random()*6)+1;
		dice2 = (int)(Math.random()*6)+1;
		System.out.println("("+dice1+", "+dice2+")");
	}
}
}
