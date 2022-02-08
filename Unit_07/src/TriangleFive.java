//(c) A+ Computer Science
//www.apluscompsci.com
//https://github.com/huangr0867/huang_ryan_apcsa-2022
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('#');
		setAmount(1);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		c = letter;
		
		
	}

	public void setAmount(int amt)
	{
		amt = amount;
	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < amount; i++) {
			for (int j = amount - 1; j >= i; j--) {
				output += " ";
			}
			
			for (int j = i - 1; j >= 0; j--) {
				output += letter;
			}
			
			output += '\n';
			
			
		}
		
		return output + "\n";
	}
}