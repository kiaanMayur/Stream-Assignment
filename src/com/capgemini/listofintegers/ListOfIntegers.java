package com.capgemini.listofintegers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*a sample class which has methods such as print the even, odd, divisible by 6, less than 12 and greater than 50
 * the integers will be stored in a list */
public class ListOfIntegers {
	
	List<Integer> arrayList = new ArrayList<>();
	
	public List<Integer> createList(int[] array) {
		for(int i : array) {
			arrayList.add(i);
		}
		return arrayList;
	}
	
	//to print even numbers 
	public void EvenPrint() {

			Predicate<Integer> checkEven = (even) -> even % 2 == 0;
			arrayList.stream().filter(checkEven).forEach(System.out :: println);;
	}
	
	//to print odd numbers
	public void OddPrint() {

		Predicate<Integer> checkEven = (odd) -> odd % 2 != 0;
		arrayList.stream().filter(checkEven).forEach(System.out :: println);;
	}
	
//	to print integers divisible by 6
	public void DivisibleBySix() {

		Predicate<Integer> checkEven = (six) -> six % 6 == 0;
		arrayList.stream().filter(checkEven).forEach(System.out :: println);;
	}
	
//	to print integers less than 12
	public void LessThan12() {

		Predicate<Integer> checkEven = (lessThan12) -> lessThan12 < 12;
		arrayList.stream().filter(checkEven).forEach(System.out :: println);;
	}
	
//	to print integers greater than 50
	public void GreaterThan50() {

		Predicate<Integer> checkEven = (greaterThan50) -> greaterThan50 > 50;
		arrayList.stream().filter(checkEven).forEach(System.out :: println);;
	}
	
	//to display the list
	public void display() {
		arrayList.stream().forEach(System.out :: println);
	}
}
