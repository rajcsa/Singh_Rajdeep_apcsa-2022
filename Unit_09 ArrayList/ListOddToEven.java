//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOdd  = -1;
		int firstEven  = -1;
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) % 2 != 0) {
				firstOdd = i;
				break;
			}
		}
		if (firstOdd > -1) {
			for (int j = ray.size() - 1; j > firstOdd; j--) {
				if (ray.get(j) % 2 == 0) {
					firstEven = j;
					break;
				}
			}
		}
		if (firstOdd > -1 || firstEven > -1) {
			return firstEven - firstOdd;
		}
		else return -1;
	}
}