//Advanced Programming concepts
//Homework-2
//Student ID: 999903327
//Name: Bhanu Prakash Reddy Peddireddy
//Question-2

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");	//Input
		
		int number = scanner.nextInt();
		
		if (number <= 1) { //This might be an extra step but I thought it is needed for my Program
					//This is to show that integer 1 and any integer less than that is neither prime nor composite
			System.out.println("!!The number you entered is neither prime nor composite!!");
		}
		
		else {
			int a = 2;//Initializing a to 2
			while (a*a <= number) { //using a*a is a shortcut since checking divisors beyond squareroot 
					//isn't necessary because they are repetitive.
				if (number % a == 0) {//If any given number is divisible by any other numbers except 
					//one and itself is not a Prime number.
					System.out.println("Given number " + number + " is not Prime!");
					return; //in a case where the statement is true to cut the chase and to reduce the 
							//execution time I returned to the main method 
					}
					a++; //incrementing by 1 for each iteration in while loop
				}
					System.out.println("Given number " + number + " is a Prime Number");
		}
		
	}
}