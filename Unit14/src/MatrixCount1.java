
import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},

    public static int count( int val  )
    {
    	int count = 0;
		for(int i = 0; i <m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] == val)
					count =  count + 1;
			}
		}
		return count;
    }
}
