package week1.day1;

import java.util.Scanner;

public class Factorial {

	// finding factorial of given number using scanner
	
	public void facto() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number to find factorial ");
		int input = scan.nextInt();
		
		//  String str = scan.nextLine(); -- used for input string
		
		//int input =3;
		int fact = 1;
	// 5*4*3*2*1	
		for (int i =1; i<= input; i++)
		{
			fact = fact * i;
		}
		System.out.println("total factorial of given number is " +fact);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial obj = new Factorial();
		obj.facto();
		
		
	}

}
