
public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals){
		grid = new String[rows][cols];
		for(int i = 0; i<cols; i++) {
			for(int j = 0; j<rows; j++) {
				grid[j][i] = vals[(int) (Math.random()*(vals.length))];
			}
		}
	}

	public String findMax(String[] vals) {
		int max = 0;
		String maxStr = "";
		for(int i = 0; i<vals.length; i++) {
			if(countVals(vals[i])>max) {
				max = countVals(vals[i]);
				maxStr = vals[i];
			}
		}
		return maxStr + " occurs the most";
	}

	private int countVals( String val )
	{
		int count = 0;
		for(int i = 0; i< grid.length; i++) {
			for(int j = 0; j<grid[i].length; j++) {
				if(grid[i][j].equals(val)) {
					count = count + 1;
				}
			}
		}
		return count;
	}

	public String toString() {
		String output="";
		for(int i = 0; i< grid.length; i++) {
			for(int j = 0; j<grid[i].length; j++) {
				output = output + " " + grid[i][j];
			}
		}
		return output;
	}
}