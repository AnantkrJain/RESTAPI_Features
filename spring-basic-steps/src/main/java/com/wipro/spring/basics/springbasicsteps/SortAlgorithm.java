package com.wipro.spring.basics.springbasicsteps;

public interface SortAlgorithm {

	public default int[] sort(int[] numbers) {
		return numbers;
	}

}
