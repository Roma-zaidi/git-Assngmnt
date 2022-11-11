package solarCalculator;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void testSum() {
		
		Calculator mycalc = new Calculator();
		try (Scanner scanner = new Scanner(System.in)) {
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		
		int sum = mycalc.sum(input1, input2);
		
		int expected = input1 + input2;
		assertEquals(expected, sum);
		
		}
//		fail("Not yet implemented");
	}
	
	@Test
	public void testSubstraction() {
		
		Calculator mycalc = new Calculator();
		try (Scanner scanner = new Scanner(System.in)) {
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		
		int subs = mycalc.substract(input1, input2);
		
		int expected = input1 - input2;
		assertEquals(expected, subs);
		
		}
	}
	
	@Test
	public void testMultiply() {
		Calculator mycalc = new Calculator();
		try (Scanner scanner = new Scanner(System.in)) {
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		
		double multiply = mycalc.multiply(input1, input2);
		
		int expected = input1 * input2;
		assertEquals(expected, multiply);
		
		}
	}
	
	@Test
	public void testDivision() {
		Calculator mycalc = new Calculator();
		try (Scanner scanner = new Scanner(System.in)) {
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		
		double divide = mycalc.divide(input1, input2);
		
		int expected = input2 / input1;
		assertEquals(expected, divide);
		
		}
	}

}
