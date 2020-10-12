package com.sapient.test;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sapient.service.MathService;

 class TestCalculateService {
	
	MathService service;
	
	@BeforeEach
	public void init() {
		
		service = new MathService();
	}
	
	@Test
	void testFibonaciiAtGivenIndexForNeagative() {
		
		int actual = service.getFibonaciiAtGivenIndex(-10);
		int  expected = -1;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testFibonaciiAtGivenIndexForInitital() {
		
		int actual = service.getFibonaciiAtGivenIndex(0);
		int  expected = 0;
		
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testFibonaciiAtGivenIndexPositive() {
		
		int actual = service.getFibonaciiAtGivenIndex(4);
		int  expected = 3;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testFactorialForNegative() {
		
		long actual = service.factorial(-3);
		long  expected = -1;
		
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testFactorialForInitial() {
		
		long actual = service.factorial(0);
		long  expected = 1;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testFactorialForPositive() {
		
		long actual = service.factorial(3);
		long  expected = 6;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testIsPrimePositive() {
		
		boolean actual = service.isPrime(3);
		boolean  expected = true;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testIsPrimeNegative() {
		
		boolean actual = service.isPrime(-1);
		boolean  expected = false;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testprimeBetweenTwoNumbers() {
		
		List<Integer> actual = service.primeBetweenTwoNumbers(5,10);
		List<Integer> expected=Arrays.asList(5,7);
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testprimeBetweenTwoNumbersNegative() {
		
		List<Integer> actual = service.primeBetweenTwoNumbers(-5,10);
		List<Integer> expected=Arrays.asList();
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testprimeBetweenTwoNumbersIllegal() {
		
		List<Integer> actual = service.primeBetweenTwoNumbers(9,2);
		List<Integer> expected=Arrays.asList();
		
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testprimeBetweenTwoNumbersIllegal2() {
		
		List<Integer> actual = service.primeBetweenTwoNumbers(1,-2);
		List<Integer> expected=Arrays.asList();
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testprimeBetweenTwoNumbersIllegal3() {
		
		List<Integer> actual = service.primeBetweenTwoNumbers(11,2);
		List<Integer> expected=Arrays.asList();
		
		Assertions.assertEquals(expected, actual);
	}
}
