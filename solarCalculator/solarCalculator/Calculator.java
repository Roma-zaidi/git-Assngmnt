package solarCalculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main (String arg[]) {
		
		Calculator mycalc = new Calculator();
		try (Scanner scanner = new Scanner(System.in)) {
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		
		int sum1 = mycalc.sum(input1, input2);
		int subs = mycalc.substract(input1, input2);
		double multiply = mycalc.multiply(input1, input2);
		double divide = mycalc.divide(input1, input2);
		
		
		System.out.println("sum is "+ sum1);
		System.out.println("substraction is "+ subs);
		System.out.println("division is "+ divide);
		System.out.println("multiply is "+ multiply);
		
		}finally{}
		
	}
	
	public int sum (int input1, int input2) {
		return input1+input2;
	}
	
	public int substract (int input1, int input2) {
		return input1-input2;
	}
	
	public double multiply (int input1, int input2) {
		return input1*input2;
	}
	
	public int divide (int input1, int input2) {
		return input2/input2;
	}
	

}
