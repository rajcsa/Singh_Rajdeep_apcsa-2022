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
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char a = letter;
		for (int i = 0; i < amount; i++)
		{
			a = letter;
			for (int j = 0; j < amount-i; j++)
			{
				for (int k = amount; k > j; k--)
				{
					if (a+j > 'Z') a -= 26;
					output += (char)(a+j);
				}
				output += " ";
			
			}
			
			output += "\n";
		}
		return output;
	}
}
