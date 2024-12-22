//Advanced Programming concepts
//Homework-1
//Student ID: 999903327
//Name: Bhanu Prakash Reddy Peddireddy
//Question-1



import java.util.Scanner;

public class DollarsAndCents {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Input the decimal number
		System.out.println("Enter your decimal number: ");
		double number = scanner.nextDouble();
		
		//integer part of the decimal part is taken as dollars.
		int dollars = (int) number;
		//number of cents is equal to the total decimal number minus the integer part multiplied by 100
		//the result is multiplied by 100 to make it an integer while printing the output. 
		//It is rounded to the nearest number in order to avoid the 3 digit cases after the decimal point.
		int cents = (int) Math.round((number - dollars) * 100);
		
		System.out.println(dollars + "dollars and" + cents + "cents");
		
		scanner.close();
	}
	
}