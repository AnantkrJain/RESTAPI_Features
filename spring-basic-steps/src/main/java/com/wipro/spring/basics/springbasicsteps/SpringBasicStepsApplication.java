package com.wipro.spring.basics.springbasicsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicStepsApplication {
	
	public static void main(String[] args) {
		//What are beans?
		//What are dependencies of a bean?
		//Where to search for beans?
		
		//No need as spring will take care of it now
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringBasicStepsApplication.class, args);
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int [] {12, 4, 6},  3);
		System.out.println(result);
	
	}

}

	//What are beans?
	//What are dependencies of a bean?
	//Where to search for beans?
