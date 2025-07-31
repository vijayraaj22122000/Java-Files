package day15;

abstract class Calculator {

	public abstract void add(int a, int b);

	public abstract void sub(int a, int b);

	public void mul(int a, int b) {
		System.out.println(a * b);
	}
}

public class AbstractionEx extends Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	// Overloading
	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		AbstractionEx calc = new AbstractionEx();
		calc.sub(15, 4);
		calc.add(4, 9);
		
		Calculator c1 = new Calculator();
		c1.mut(3,3);

	}
}