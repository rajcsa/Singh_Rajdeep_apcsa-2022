import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", 4, 6, 3, 7, "j", "k"};		
		Grid x = new Grid(10,10,vals);
		System.out.println(x);
		System.out.println(x.findMax(vals));
	}
}