//Advanced Programming concepts
//Homework-2
//Student ID: 999903327
//Name: Bhanu Prakash Reddy Peddireddy
//Question-1

//Write a Java program to reverse 3 digits integer as follows: If integer 123 is the input from user, 
//for example, your program must print 321. Use / and %, + and other operators if necessary.

import java.util.Scanner;
public class ReverseNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Three-digit number: ");
			int number = scanner.nextInt();
			
			int HundredsDigit = number / 100; //Let's say the three digit number is 765; integer 
				//division results an integer thus dividing the number gives 7 which is taken by the
				// variable for 100's digit.
			int TensDigit = (number % 100) / 10; //Here (765 % 100) gives 65 as result which then divided by 
				//10 gives the integer values of 6 which is the 10's digit.
			int OnesDigit = number % 10; //In this step 765 % 10 gives the result 5 which is finally 
				//the 1's digit.
			
			int ReverseNumber = OnesDigit * 100 + TensDigit * 10 + HundredsDigit;
			
			System.out.println("Reverse number: " + ReverseNumber);
	}
}