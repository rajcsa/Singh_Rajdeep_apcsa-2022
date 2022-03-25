
public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] list = {{1,2,3},{5,5,5,5}};
		TotalRow test = new TotalRow();
		System.out.println(test.getRowTotals(list));	
	}
}



