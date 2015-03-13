package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import java.util.Random;

import junit.framework.Assert;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.Matcher;

public class BinarySearchTest {
	
	@Test
	public void testEqualsOneIsInsane() throws Exception{
		int[] sequency = new int[1];
		int key = 5;
		sequency[0] = key;
		SearchResult searchResult = BinarySearch.search(key,sequency);
		assertThat(true, is(searchResult.isFound()));
	}
	
	@Test
	public void testEqualsOneIsNotInsane() throws Exception{
		int[] sequency = new int[1];
		int key = 5;
		//sequency[0] = key;
		SearchResult searchResult = BinarySearch.search(key,sequency);
		assertThat(false, is(searchResult.isFound()));
	}
	
	@Test
	public void testMorThanOneIsFirstInSequence() throws Exception{
		
		int sequencyLenght = 7;
		int[] sequency = new int[sequencyLenght];
		int key = 1;
		sequency[0] = key;
		
		Random generator = new Random();
		for(int iterator = 1; iterator < sequencyLenght; iterator++){
			sequency[iterator] = generator.nextInt(10)+3;
		}
		

		SearchResult searchResult = BinarySearch.search(key,sequency);
		
		assertThat(1, is(searchResult.getPosition()));

	}
	
	
	@Test
	public void testMorThanOneIsLastInSequence() throws Exception{
		
	
		int[] sequency = new int[] {1,2,3,4,5,6,7};


		SearchResult searchResult = BinarySearch.search(7,sequency);
		assertThat(7,is(searchResult.getPosition()));
	}
	
	
	public void testMorThanOneIsMiddleInSequence() throws Exception{
	
		int[] sequency = new int[] {1,2,3,4,5,6,7};

		

		SearchResult searchResult = BinarySearch.search(4,sequency);
		assertThat(sequency.length/2+1,is(searchResult.getPosition()));
	}
	
	public void testMorThanOneIsMiddleInSequenceSecond() throws Exception{
		
		int[] sequency = new int[] {1,2,3,4,5,6,7,8};

		

		SearchResult searchResult = BinarySearch.search(4,sequency);
		assertThat(sequency.length/2,is(searchResult.getPosition()));
	}
	
	public void testMorThanOneIsNotInSequence() throws Exception{
		int[] sequency = new int[] {1,2,3,4,5,6,7,8};

		

		SearchResult searchResult = BinarySearch.search(9,sequency);
		assertThat(false,is(searchResult.isFound()));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void seqIsEqNull()
	{
		int[] sequency = new int[0];
		BinarySearch.search(1, sequency);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void seqIsNotSorted()
	{
		int[] sequency = {6,4,8,3,2,8};
		BinarySearch.search(1, sequency);
	}
}
