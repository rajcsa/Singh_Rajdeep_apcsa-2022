//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Raj
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		System.out.println("6 is odd :: " + NumberVerify.isOdd(6));
		System.out.println("6 is even :: " + NumberVerify.isEven(6));
		
		System.out.println("7 is odd :: " + NumberVerify.isOdd(7));
		System.out.println("7 is even :: " + NumberVerify.isEven(7));
		
		System.out.println("8 is odd :: " + NumberVerify.isOdd(8));
		System.out.println("8 is even :: " + NumberVerify.isEven(8));
		
		System.out.println("9 is odd :: " + NumberVerify.isOdd(9));
		System.out.println("9 is even :: " + NumberVerify.isEven(9));
	}
}