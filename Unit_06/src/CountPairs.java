//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs // wrap this inside of a function
{
	String str = "blagggg";
	int count = 0;

    for (int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      char d = str.charAt(i+1);
      
      if (c == d){
        count++;
      }
    }
		System.out.println(count); //return count
}
