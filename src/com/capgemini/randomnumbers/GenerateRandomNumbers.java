package com.capgemini.randomnumbers;
import java.util.Random;

// class which generates 100 random number from 1 to 49
public class GenerateRandomNumbers {
	
	public int[] genrateNumbers() {
		
		int[] numberList = new Random().ints(100, 1, 49).toArray();
		return numberList;
	}

}
