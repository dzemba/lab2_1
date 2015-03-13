package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import java.util.Random;

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
	public void testEMorThanOneIsFirstInSequence() throws Exception{
		
		int sequencyLenght = 7;
		int[] sequency = new int[sequencyLenght];
		int key = 1;
		sequency[0] = key;
		
		Random generator = new Random();
		for(int iterator = 1; iterator < sequencyLenght; iterator++){
			sequency[iterator] = generator.nextInt(10)+3;
		}
		
		sequency[0] = key;
		SearchResult searchResult = BinarySearch.search(key,sequency);
		assertEquals(1,searchResult.getPosition());
	}
	
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
