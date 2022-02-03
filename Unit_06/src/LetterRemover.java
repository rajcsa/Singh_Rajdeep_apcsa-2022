//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import static java.lang.System.*;

public class LetterRemover
{
    private String sentence;
    private char lookFor;
    

    public LetterRemover()
    {
        setRemover("", 'A');
    }

    //add in second constructor
    public LetterRemover(String s, char rem)
    {
        setRemover(s, rem);
    }

    public void setRemover(String s, char rem)
    {
        sentence = s;
        lookFor = rem;
    }

    public String removeLetters()
    {
    	String cleaned = "";
        for (char c:sentence.toCharArray()) {
        	if (c != lookFor) {
        		cleaned += c;
        	}
        }
        return cleaned;
    }

    public String toString()
    {
        return sentence + " - letter to remove " + lookFor + " = " + removeLetters();
    }
}
