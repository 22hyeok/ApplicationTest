package com.green.biz;

import static org.junit.Assert.*;
import org.junit.Test;

public class SearchMaxTest {

	@Test
	public void testSearchMax() {
		CalcUtil calc = new CalcUtil();
		
		int[] test_1 = {1, 3, 4, 2};
		int[] test_2 = {-12, -3, -4, -2};
		
		assertEquals("Search Max", 4, calc.searchMax(test_1));
		assertEquals("Search Max", -2, calc.searchMax(test_2));
	}

}
