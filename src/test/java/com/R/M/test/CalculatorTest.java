package com.R.M.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.R.M.bean.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator	 c = new Calculator();
		int acctualResult = c.add(10,20);
		assertEquals(30, acctualResult);
	}
}
