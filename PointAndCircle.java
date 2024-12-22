//Advance Programming Concepts
//Homework-1
//student ID: 999903327
//Name: Bhanu Prakash Reddy Peddireddy



//Question-2

import java.util.Scanner;

public class PointAndCircle{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//I've considered the center of circle as (x,y), radius as r and the given point as (x1,y1) and the inputs are taken as below
			System.out.println("Enter the x-coordinate of the circle's center:");
				double x = 
					scanner.nextDouble();
			System.out.println("Enter the y-coordinate of the circle's center:");
				double y = 
					scanner.nextDouble();
				
			System.out.println("Enter the radius of the circle:");
				double r = 
					scanner.nextDouble();
		
		
			System.out.println("Enter the x-coordinate of the given point:");
				double x1 = 
					scanner.nextDouble();
			System.out.println("Enter the y-coordinate of the given point:");
				double y1 =
					scanner.nextDouble();
		
		//below is the maths expression for finding the distance between two points, here the two points are the coordinates of center of circle and the any given point
		double d = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
		//If the distance between the point and circle is less than the radius then the point should lie inside the cirle.
		if (d < r) {
			System.out.println("The given point (" + x1 + " , " + y1 + ") lies inside the circle");
			}
		//If the distance between the point and circle is equal to the radius then the point should lie on the cirle.
		else if (d == r) {
			System.out.println("The given point (" + x1 + " , " + y1 + ") lies on the circle");
			}
		//If the distance between the point and circle is greater than the radius then the point should lie outside the cirle.
		else {
			System.out.println("The given point (" + x1 + " , " + y1 + ") lies outside the circle");
			}
			
			scanner.close();
			
	}
}

	
