//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		
		Scanner keyboard = new Scanner(System.in);
  		
  		System.out.println("Enter an integer...");
  		int a = keyboard.nextInt();
  		
  		System.out.println("Enter an integer...");
  		int b = keyboard.nextInt();
  		
  		System.out.println("Enter an integer...");
  		int c = keyboard.nextInt();
  		
  		System.out.println("Enter an integer...");
  		int d = keyboard.nextInt();
  		
  		Distance test = new Distance(a, b, c, d);
  		
  		String res = test.toString();
  		
  		System.out.println(res);
		
	}
}