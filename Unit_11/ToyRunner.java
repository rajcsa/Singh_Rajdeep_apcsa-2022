//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy("qwq");
		System.out.println(test);
		test = new Toy("qwqwqq");
		test.setCount(5555);
		System.out.println(test);
	}
}