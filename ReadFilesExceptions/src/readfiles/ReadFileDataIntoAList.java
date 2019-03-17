package readfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/*
 * Store all numbers from Numbers.txt file into a List of Integers
 */
import java.util.List;

public class ReadFileDataIntoAList {
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		try (FileReader fr = new FileReader("Numbers.txt"); 
				BufferedReader br = new BufferedReader(fr);) {
			String value;
			while ((value = br.readLine()) != null) {
				nums.add(Integer.valueOf(value));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Print count of numbers
		System.out.println("Number of lines: " + nums.size());
		
		//print sum of all numbers:
		int sum = 0;
		for( Integer number : nums) {
			sum = sum + number;
		}
		System.out.println("Sum = " + sum);
		
		
		//print the largest number
		//for loop
		
		int max = nums.get(0);
		for(int i = 1; i < nums.size(); i++) {
			if(nums.get(i) > max) {
				max = nums.get(i);
			}
		}
		System.out.println("Max with for loop: " + max);
		
		
		//Sort it, then take last value
		Collections.sort(nums);
		System.out.println("Max with Sorting: " + nums.get(nums.size()-1));
		
		
		//Collections max
		System.out.println("Collections.max(): " + Collections.max(nums));
		
		//print unique numbers, no repetitions
		List<Integer> newList = new ArrayList<>();
		
		int duplicates = 0;
		for( Integer number : nums) {
			if(!newList.contains(number)) {
				newList.add(number);
			}else {
				duplicates++;
			}
		}
		System.out.println("Count of unique nums: " + newList.size());
		
		System.out.println(newList.toString());
		
		System.out.println("Duplicates " + duplicates);
		
		

	}
}
