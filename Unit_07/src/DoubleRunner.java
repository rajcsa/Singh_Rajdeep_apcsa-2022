//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		BiggestDouble run = new BiggestDouble(3.5,1.7,3.8,4.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
				
	}
}
