package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {
	
	@Test
	public void testEqualsOneIsInsane() throws Exception{
		int[] sequency = new int[1];
		int key = 5;
		sequency[0] = key;
		SearchResult searchResult = BinarySearch.search(key,sequency);
		assertTrue(searchResult.isFound());
	}
	
	@Test
	public void testEqualsOneIsNotInsane() throws Exception{
		int[] sequency = new int[1];
		int key = 5;
		//sequency[0] = key;
		SearchResult searchResult = BinarySearch.search(key,sequency);
		assertFalse(searchResult.isFound());
	}
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
