package com.wipro.spring.basics.springbasicsteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	//Sorting an array
	//Searching an array
	//Return the result
	
	//Completely Loosely Coupled 
	
	
	/*
	1. Wiring is done through constructor injection--
	
	@Autowired
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	*/
	
	/*2. Wiring is done through setter injection--
	
	@Autowired
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	*/
	
	//3. Without constructor or setter injection--
	 
	@Autowired
	private SortAlgorithm sortAlgorithm;
	 
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//Implementing Sorting Logic
		//Bubble Sort Algorithm
		
			//If I want to change the algorithm, I will need to change the code of binary search.
			//This is called the tight coupling.
		
		//Neither Tightly nor Loosely Coupled
			//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
			//int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		//Still I have the problem to change the sorting method
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search the array
		return 3;
	}
	
}
