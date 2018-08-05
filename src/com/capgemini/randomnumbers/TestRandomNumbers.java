package com.capgemini.randomnumbers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

/*this class generates 100 random numbers from 1 to 49 and stores it in a text file
 * then after that it takes those 100 numbers from file and place it in a collection in such a way that
 * it eliminates duplicate
 * collection is sorted*/

/*for storing the numbers in a collection, we will use HashSet, because in hash set elements are sorted and there can be no duplicate 
objects in hash set*/
public class TestRandomNumbers {

	public static void main(String[] args) throws IOException {
		
		// instantiating the object of GenerateRandomNumber
		GenerateRandomNumbers random = new GenerateRandomNumbers();
		
		// this will receive the 100 random numbers from 1 to 49
		int[] randomNumbers = random.genrateNumbers();
		
		for(int i : randomNumbers)
			System.out.println(i + " ");
		
		//now to write this in a file
		BufferedWriter writeFile = null;
		File file = new File("boy.txt");
		
		writeFile = new BufferedWriter(new FileWriter(file));
		
		//writing in a file
		for(int i =0; i < randomNumbers.length; i++) {
			writeFile.write(randomNumbers[i] + "\r\n");
		}
		
		writeFile.close();
		
		//now we will read this file and place it in a collection
		File file2 = new File("boy.txt");
		BufferedReader readFile = new BufferedReader(new FileReader(file2));
		Set<Integer> noRepeatSet = new HashSet<>();
		String checkNull = null;
		
		//traversing a file
		while(checkNull != readFile.readLine()) {
			int temp = Integer.parseInt(readFile.readLine());
			noRepeatSet.add(temp);
		}
		
		System.out.println("-----------------------------------------------------------");
		Consumer<Integer> disp = System.out :: println;
		noRepeatSet.stream().forEach(disp);
	}

}
