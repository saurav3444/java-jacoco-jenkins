package com.sapient.service;

import java.util.ArrayList;
import java.util.List;

public class MathService {

	public int getFibonaciiAtGivenIndex(int index) {

		if (index < 0)
			return -1;

		List<Integer> fib = new ArrayList<>();
		fib.add(0);
		fib.add(1);
		
		for (int i = 2; i <= index; i++)
			fib.add(fib.get(i-1)+fib.get(i-2));

		return fib.get(index);
		

	}

	public long factorial(int num) {

		if (num < 0)
			return -1;

		if (num ==0)
			return 1;

		long fact = 1;
		for (int i = 1; i <= num; i++)
			fact *= i;

		return fact;
	}
	
	public boolean isPrime(int num) {
		
		if(num<=0)
			return false;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
		
	}
	
	public List<Integer> primeBetweenTwoNumbers( int start, int end){
		
		List<Integer> list = new ArrayList<>();
		
		if(start<0 || end<0 || start>end)
			return list;
		
		for(int i=start; i<=end;i++) {
			
			if(isPrime(i))
				list.add(i);
		}
		
		return list;
	}

}
