import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar('-');
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (getChar() > 64 && getChar() < 91) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isLower( )
	{
		if (getChar() > 96 && getChar() < 123) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		if (getChar() > 47 && getChar() < 58) {
			return true;
		} else {
			return false;
		}
	}	

	public int getASCII( )
	{
		int ascii =  (int) getChar();
    return ascii;
	}

	public String toString()
	{
		if (isUpper() == true) {
			return "" + getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		} else if (isLower() == true) {
			return "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		} else if (isNumber() == true) {
			return "" + getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		return "";
	}
}
