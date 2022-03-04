//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RationalRunner
{
	public static void main( String args[] )
	{
		
		Rational test = new Rational();
		out.println("test = " + test);

		Rational newOne = new Rational(3,4);
		out.println("newOne = "+newOne);

		out.println("test.equals(newOne) = "+test.equals(newOne));

		newOne = (Rational)test.clone();
		out.println("\n\nnewOne after test.clone() = "+newOne);
		out.println("test.equals(newOne) = "+test.equals(newOne));
		
		Rational rOne = new Rational(1,2);
		Rational rTwo = new Rational(2,3);
		out.println("1/2.equals(2/3) = "+rOne.equals(rTwo));
		test.setRational(4,6);
		out.println("2/3.equals(4/6) = "+rTwo.equals(test));
	}
}