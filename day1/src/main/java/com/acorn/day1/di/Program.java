package com.acorn.day1.di;

public class Program {

	// �쓽議댁꽦 dependence
	Calculator calculator;

	public Program() {

	}

	// 객체 주입식 constructor injection
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	// 세터주입식 setter injection
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public int addP(int num1, int num2) {

		int result;
		result = calculator.add(num1, num2);
		return result;

	}
}
