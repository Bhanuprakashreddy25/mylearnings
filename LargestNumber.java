//Advanced Programming concepts
//Assignment-3
//Student ID: 999903327
//Name: Bhanu Prakash Reddy Peddireddy
//Question-1


import java.util.Scanner;

public class LargestNumber {
	public static int LargestOfFour(int a, int b, int c, int d) {
	
        // initial assumption a to be the largest
		int largest = a;
		// Let's check if our assumption is true with rest of three numbers
		if (b > largest) {
			largest = b;
		}
		if (c > largest) {
			largest = c;
		}
		if (d > largest) {
			largest = d;
		}
		
		return largest;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// This allows the useer to input the numbers
		System.out.print("Enter the first number a: ");
		int a = scanner.nextInt();
		
		System.out.print("Enter the second number b: ");
		int b = scanner.nextInt();
		
		System.out.print("Enter the third number c: ");
		int c = scanner.nextInt();
		
		System.out.print("Enter the fourth number d: ");
		int d = scanner.nextInt();
		
		// Calls the LargestOfFour method
		int largest = LargestOfFour(a, b, c, d);
		
		System.out.println("The largest number from the given is: " + largest);
		
		scanner.close();
		
	}
}