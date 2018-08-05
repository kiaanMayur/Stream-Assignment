package com.capgemini.oddprime;

import java.util.Scanner;

/*to test the OddPrime class*/
public class TestOddPrime {

	public static void main(String[] args) {

		OddPrime oddPrime = new OddPrime();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		boolean checkNumber = oddPrime.isOdd(number);
		
		if(checkNumber)
			System.out.println("number " + number + " is odd.");
		else
			System.out.println("number " + number + " is even.");
		
		boolean checkPrime = oddPrime.isPrime(number);
		
		if(checkPrime)
			System.out.println("number " + number + " is prime.");
		else
			System.out.println("number " + number + " is not prime.");

	}

}
