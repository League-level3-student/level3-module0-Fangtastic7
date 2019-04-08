package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] list = new String[5]; 
		//2. print the third element in the array
		System.out.println(list[3]);
		//3. set the third element to a different value
		list[3] = "Hello";
		//4. print the third element again
		System.out.println(list[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i=0; i<list.length;i++) {
			list[i] = "changed index " + i;
 			System.out.println(list[i]);
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		}
		//7. make an array of 50 integers
		int[] integers = new int[50];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		//8. use a for loop to make every value of the integer array a random number
		
		for(int i=0; i<integers.length;i++) {
			
			integers[i] = new Random().nextInt(100);
			if(integers[i]>max) {
				max = integers[i];
			}
				else if(integers[i]<min) {
					min = integers[i];
				}
			
		}
		//9. without printing the entire array, print only the smallest number on the array
		System.out.println("The smallest number is " + min);
		//10 print the entire array to see if step 8 was correct
		for(int x=0; x<integers.length;x++) {
			System.out.println(integers[x]);
			
		}
		//11. print the largest number in the array.
		System.out.println("The largest number is " + max);
		//12. print only the last element in the array
		System.out.println(integers[integers.length-1]);
	}
}
