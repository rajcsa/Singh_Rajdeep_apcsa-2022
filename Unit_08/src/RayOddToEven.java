//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int first_odd = 0;
		int first_even = 0;
		
		for (int c : ray) {
			if (c%2==1) {
				first_odd = c;
			}
			if ((c%2==0) && (first_even == 0)) {
				first_even = c;
				break;
			}
			
			
			
		}
		return first_odd-first_even;
	}
}