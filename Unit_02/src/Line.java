//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rajdeep
//Date - 1/20/2022

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		float x2mx1 = x2 - x1;
		float y2my1 = y2 - y1;
		return y2my1/x2mx1;
	}

}