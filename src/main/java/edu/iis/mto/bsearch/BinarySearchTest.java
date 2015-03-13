package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {
	
	public static void testEqualsOneIsInsane() throws Exception{
		BinarySearchTest searchTest = new BinarySearchTest();
		int[] sequency = new int[1];
		int key = 5;
		sequency[0] = key;
		SearchResult searchResult = BinarySearch.search(key,sequency);
		assertTrue(searchResult.isFound());
	}
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
