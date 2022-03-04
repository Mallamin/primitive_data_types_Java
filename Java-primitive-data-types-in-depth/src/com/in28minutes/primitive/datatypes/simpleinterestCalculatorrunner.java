package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class simpleinterestCalculatorrunner {

	public static void main(String[] args) {
		simpleInterestCalculator calculator = new simpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5); // 5 years

		System.out.println(totalValue);
	}

}
