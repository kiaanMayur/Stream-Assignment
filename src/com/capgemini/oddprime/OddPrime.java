package com.capgemini.oddprime;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/*class which contains the methods to check whether the integer present in the list is
odd number
prime number*/
public class OddPrime {
	
	//to check a given number is odd or not
	public boolean isOdd(int odd) {
		
		IntPredicate checkOdd = (Integer) -> odd % 2 == 0; 
		return IntStream.range(0, odd-1).noneMatch(checkOdd);
	}
	
	//to check a given number is prime or not
	public boolean isPrime(int prime) {
		IntPredicate checkPrime = index -> prime % index == 0;
		return IntStream.range(2, prime - 1).noneMatch(checkPrime);
	}

}
