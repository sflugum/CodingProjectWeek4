package CodingProject1;

import java.util.ArrayList;
import java.util.List;

public class Project1 {
	
	public static void main(String[] args) {	

	//Q1.	
	
	//initiate 1st int array	
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	
	//subtract 1st element from last element while also creating variable to store answer
	int difference = ages[ages.length-1] - ages[0];	
	
	//print answer to console
	System.out.println(difference);
	
	
	//initiate 2nd int array
	int[] ages2 = {39, 7, 25, 91, 2, 50, 12, 74, 62};
	
	//subtract 1st element from last element while also creating variable to store answer
	int difference2 = ages2[ages2.length - 1] - ages2[0];
	
	//print answer to console
	System.out.println(difference2);	
	
	/* i can access the last element of any array of any length by using
	 * arrayName.length - 1 as the index. the 1st element of an array will always
	 * be at index 0.
	 */
	
	//create a variable to hold the sum of the elements in the array		
	int sum = 0;
		
	//iterate through each element in the array to add them all together		
	for(int age : ages2) {
			sum += age;
	}
	
	//find the average by dividing the sum of the elements by the number of elements in
	//the array while also initiating a variable to store the answer
	int average = sum/ages2.length;
	
	//print the answer to the console
	System.out.println(average);
		
	
	//Q2.
	
	//initiate new string array
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	//create variable to store the sum of all characters from each element in array
	double sumOfAllCharacters = 0;
		
	//iterate through array and add characters together from each element
	for(String name : names) {
		sumOfAllCharacters += name.length();
	}
	
	//divide sum of characters by the number of elements in array also creating variable 
	//to store answer
	double averageCharacters = sumOfAllCharacters/names.length;
	
	//print average of characters to console
	System.out.println(averageCharacters);
	
	
	/*Q3. you can access the last element of any array by using the format 
	 * "arrayName[arrayName.length-1]". 
	 */
	
	/*Q4. you can access the first element of any array by using the format
	 * "arrayName[0]".
	 */
	
	//Q5.
	
	//initiate new int array
	List<Integer> nameLengths = new ArrayList<Integer>();
	
	//write loop to iterate over names array and add length of each element as an element
	//in new int array
	for(String name : names) {
		nameLengths.add(name.length());
	}
	
	//Q6.
	
	//create variable to store sum of elements in new array
	int calc = 0;
	
	//iterate over new array and add each element together
	for(int length : nameLengths) {
		calc += length;
	}
	
	//print value of elements added together
	System.out.println(calc);

	
	//**BEGIN WORK FOR PROCEEDING QUESTIONS WITHIN MAIN METHOD**
	
	//Q7 print results of method, must be done in main method
	System.out.println(threeHellos("Hello", 3));
	
	//Q8 print results of method, must be done in main method
	System.out.println(fullName("Silas", "Flugum"));
	
	//Q9 print results of method, must be done in main method
	System.out.println(isItGreaterThan100(ages));
	
	//Q10, creating array of doubles to use within a new method
	double[] array = {3.62, 94.7, 27.01, 7.3, 48.48};
	
	//Q10, create variable to store return value
	double qTen = average(array);
	
	//Q10 printed method results to confirm
	System.out.println(qTen);
	
	//Q11 new array to use for q
	double[] array2 = {30.6, 81.905, 8.88, 26.05, 49.39};
	
	//Q11 printing return value to confirm
	System.out.println(isItGreater(array, array2));
	
	//Q12 creating variables to use in method
	boolean isHotOutside = true;
	double moneyInPocket = 9.63;	
	
	//Q12 printing return value to confirm
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));	
	
	//Q13 creating variables to use in method
	double minsLeftTilWork = 59;
	double timeToDoDishes = 10;
	
	//separating Q13 in console
	System.out.println("-----------------");
	
	/*Q13 print return value to confirm
	System.out.println(timeForDishes(minsLeftTilWork, timeToDoDishes));*/
		
	//Q13 question being answered by method 
	System.out.println("Do I have enough time to do dishes before work?");
	
	//Q13 answering question
	//argument to generate answer based on values of variables in method
	if(timeForDishes(minsLeftTilWork, timeToDoDishes) == true) {
		System.out.println("Yes, you can do dishes before work.");
	} else {
		System.out.println("No, you will be late.");
	}
	
	
	
	//**END WORK FOR PROCEEDING QUESTIONS**
	
	
	
	
//end of main method	
}
	
	//Q7.
	//new method
	public static String threeHellos(String word, int n) {
		
		//variable to store the results of the loop
		String result = "";
		
		
		//loop to concatenate word to itself n number of times
		for(int i = 0; i < n; i++) {
			result += word;
		}
		
		//return statement
		return result;		
		
		//**printed from main method
	}
	
	//Q8.
	
	
	//initiate new method
	public static String fullName(String firstName, String lastName) {
		
		//concatenating variables while creating new variable to store results
		String result = firstName + " " + lastName;
		
		//return statement		
		return result;	
		
		//**printed from main method
	}
	
	
	//Q9.
	
	//initiate new method
	public static boolean isItGreaterThan100(int[] ages) {
		
		//create variable to store sum of elements in array
		int sum = 0;
		
		
		//iterate through array and add elements together
		for(int age : ages) {
			sum += age;
		}
		
		
		//argument to compare elements to 100
		if(sum > 100) {
			
			//return statement within argument which will run first
			return true;
			
		}
		
		//return statement outside of argument but within method that will run
		//if argument is not correct. also return statement is required for this
		//method
		return false;
		
		//**printed from main method
		
	}
	
	//Q10.
	
	public static double average(double[] array) {
		
		double sum = 0;
		
		
		
		for(double number : array) {
			sum += number;			
		}
		
		return sum / array.length;
				
	}
	
	//**created array of double, created variable to store return value, and printed
	//results to confirm in the main method
	
	//Q11.
	
	//initiating new method
	public static boolean isItGreater(double[] array, double[] array2) {
		
		//variable to store sum of 1st array
		double sumArray = 0;
		
		//variable to store sum of 2nd array
		double sumArray2 = 0;
		
		
		//iterating over 1st array to add elements together
		for(double number : array) {
			sumArray += number;
		}
		
		//for 1st array finding average of elements by diving sum by array length and made variable
		//to store answer 
		double result1 = sumArray / array.length;
		
		
		//iterating over 2nd array to add elements together
		for(double number : array2) {
			sumArray2 += number;
		}
		
		//for 2nd array finding average of elements and creating variable to store answer
		double result2 = sumArray2 / array2.length;
		
		
		//boolean argument to compare both array averages
		if(result1 > result2) {
			//return statement within argument
			return true;
		}
		//return statement of method which will run if argument statement is false
		return false;		
		
	}
	
	//**created array2 and printed return value for this method within main method
	
	//Q12.
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
				
		if (isHotOutside == true && moneyInPocket > 10.5) {
			return true;
		}
		
		return false;
	}
	
	//Q13.
	
	
	//create new method to see if i have enough time to do the dishes before i have
	//to be at work
	public static boolean timeForDishes(double minsLeftTilWork, double timeToDoDishes) {
		
		//argument that if minutes left until work is more than the time it takes to
		//do the dishes plus 45, which is the time it takes to get ready for work
		//and commute
		if(minsLeftTilWork >= timeToDoDishes + 45) {
			
			//return statement for argument
			return true;
		}
		
		//method return statement
		return false;		
	}
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
