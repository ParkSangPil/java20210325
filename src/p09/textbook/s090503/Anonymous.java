package p09.textbook.s090503;

public class Anonymous {
	private int field;

	public void method(final int arg1,int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// arg1 = 20;
		// arg2 = 20;
		
		// var1 = 30;
		// var2 = 30;      localclass 에서 사용하려면 파이널처럼 사용해야합니다.
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 +var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
