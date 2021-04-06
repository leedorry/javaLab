package sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		// 1. 익명구현객체
		operator = new IntBinaryOperator() {
			@Override
			public int applyAsInt(int x, int y) {
				return Calculator.staticMethod(x, y);
			}
		};
		
		// 2. 람다식
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + operator.applyAsInt(1, 2));
		
		// 3. 정적 메소드 참조 
		operator = Calculator :: staticMethod;
		System.out.println("결과2: " +  operator.applyAsInt(3, 4));
		
		// 인스턴스 메소드 참조 ---------------------------
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));

		operator = obj :: instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7, 8));
	}
}
