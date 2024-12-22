//Advanced Programming concepts
//Assignment-3
//Student ID: 999903327
//Name: Bhanu Prakash Reddy Peddireddy
//Question-2

import java.util.Scanner;

public class PrintStatementNTimes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Statement s that has to be printed n Times: ");
		String s = scanner.nextLine();
		
		System.out.println("Enter the number n to print a statement n times: ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println(s);
		}
	}
}

// I used no return type for this problem as both methods has same Time complexity but 
//memory consumption is more using return type and efficiency of the program is better using loop rather than 
//return type, but I will definitely make sure to practise using return type.