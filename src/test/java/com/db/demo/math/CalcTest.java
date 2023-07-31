package com.db.demo.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalcTest {
	
	Calc calc = new Calc();
	
	//	positive test
	@Test
	public void testAddNums() {
		assertEquals(10, calc.addNums(6, 4));
	}
	
//	negative test
	@Test
	public void testAddNumsN() {
		assertNotEquals(11, calc.addNums(6, 4));
	}
	
}
