package com.capgemini.listofintegers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class to test the ListOfIntegers class by creating a list which contains the integers
public class ListOfIntegersTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ListOfIntegers listOfIntegers = new ListOfIntegers();	//instantiating the object of ListOfIntegers class
		
		System.out.println("how many numbers you want to enter: ");
		int length = scanner.nextInt();
		int[] tempList = new int[length];
		List<Integer> arrayList = new ArrayList<>();	//array list
		int i;
	
		System.out.println("Enter the elements: ");
		//inputting the elements the numbers
		for(i=0 ; i<length; i++) {
			tempList[i] = scanner.nextInt();
		}
		
		//inserting the values to arraylist
		arrayList = listOfIntegers.createList(tempList);
		
		System.out.println("Even numbers in the list are: ");
		//to check the even numbers
		listOfIntegers.EvenPrint();
		
		System.out.println("odd numbers in the list are: ");
		//to check for odd numbers
		listOfIntegers.OddPrint();
		
		System.out.println("numbers divisivble by 6 in the list are: ");
		//to check the numbers divisible by 6
		listOfIntegers.DivisibleBySix();
		
		System.out.println("numbers less than 12 in the list are: ");
		//to check for numbers less than 12
		listOfIntegers.LessThan12();
		
		System.out.println("numbers greater than 50 in the list are: ");
		//to check for numbers greater than 50
		listOfIntegers.GreaterThan50();
		
	}

}
