
import static java.lang.System.*;

public class RecursionFunThree
{
	public static int luckyThrees( long number )
	{
		if(number < 10) {
			return 0;
		}
		if((number % 10) == 3) {
			return 1 + luckyThrees(number/10);
		}
		return 0 + luckyThrees(number/10);
	}
}