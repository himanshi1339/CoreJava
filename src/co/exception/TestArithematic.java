package co.exception;

public class TestArithematic {
	public static void main(String[] args) {
		int a = 20;
		int b = 0;

		try {
			int c = a / b;

		} catch (ArithmeticException e) {
			System.out.println("its arithematic exception");

		}
		System.out.println();
	}
}
