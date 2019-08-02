package com.smoothstack.assignments.week01;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class LambdasTest {

	@Test
	public void test() {
		ArrayList<String> result = Lambdas._main(new String[] {
			"5",
			"1 4",
			"2 5",
			"3 898",
			"1 3",
			"2 12"
		});
		assertTrue("failed to correctly identify even number",
				result.get(0).equals("EVEN"));
		assertTrue("failed to correctly identify prime number", 
				result.get(1).equals("PRIME"));
		assertTrue("failed to correctly identify palindrome number",
				result.get(2).equals("PALINDROME"));
		assertTrue("failed to correctly identify odd number",
				result.get(3).equals("ODD"));
		assertTrue("failed to correctly identify composite number",
				result.get(4).equals("COMPOSITE"));
	}

}
