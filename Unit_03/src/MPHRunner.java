//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		
		// test case 1
		
		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.print();
		
		
		// test case 2
		
		out.print("Enter the distance :: ");
		int dist2 = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs2 = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins2 = keyboard.nextInt();

		MilesPerHour test2 = new MilesPerHour(dist2, hrs2, mins2);
		
		test2.print();
		
		
		
	}
}