//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{

		setWords("", "");
	}

	public StringEquality(String one, String two)
	{

		
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo) == true) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString()
	{
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}