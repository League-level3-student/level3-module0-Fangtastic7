package _03_More_Array_Fun;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	static ArrayList <String> list = new ArrayList <String>();
	public static void main(String[] args) {
		//addStrings();
		
	}
public static String inputStrings(String[] array) {
	list.set(0, "bob");
	list.set(1, "joe");
	list.set(2, "michael");
	return null;
	
}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static String addStrings(String[] array) {
		for(int i=0; i<array.length;i++) {
		System.out.println(array[i]);
		
		}
		return null;
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void ReverseOrder(String[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.println(array[array.length-i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void EveryOther(String[] array) {
		for(int i=0;i<array.length; i++) {
			if(i%2==0) {
				System.out.println(array[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void Randomize(String[] array) {
	
		int counter = 0;
		boolean running = true;
		int previous = array.length+1;
		while(running) {
			int number = new Random().nextInt(array.length);
			
			if(number != previous) {
				System.out.println(array[number]);
				number = previous;
				counter = counter +1;
				if(counter ==array.length) {
					running = false;
				}
			}
		}
	}
	
}
