//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Raj
//Date - 1/25/2022


public class FirstLastVowel
{
   public static String go( String a )
	{
		char firstElement = a.charAt(0);
		char lastElement = a.charAt(-1);
		
		if ("aeiouAEIOU".indexOf(firstElement) != -1) {
			return "yes";
		}
		if ("aeiouAEIOU".indexOf(lastElement) != -1) {
			return "yes";
		}
		return "no";
	}
}