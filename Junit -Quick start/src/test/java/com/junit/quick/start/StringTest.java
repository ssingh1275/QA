package com.junit.quick.start;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void testtolearnassertequal() {
		assertEquals(2, 3);
		///Check
		///asserts
		int actualOutput = Math.min(6, 9);
		int expectedoutput=6;
		assertEquals(expectedoutput,actualOutput);
	}
	

}
