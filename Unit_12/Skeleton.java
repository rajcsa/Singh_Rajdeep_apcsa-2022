public class Skeleton implements Monster
{
	//add instance variables	
	private String skeletonName;
	private int skeletonSize;
	
	//add a constructor
	public Skeleton () {
		skeletonName = " ";
		skeletonSize = 0;
		
	}
	
	public Skeleton (String name, int size) {
		skeletonName = name;
		skeletonSize = size;
		
	}
	
	//add code to implement the Monster interface
	public int getHowBig () {
		return skeletonSize;
		
	}
	
	public String getName () {
		return skeletonName;
	}
	
	public boolean isBigger (Monster other) {
		return skeletonSize > other.getHowBig();
		
	}
	
	public boolean isSmaller (Monster other) {
		return skeletonSize < other.getHowBig();
		
	}
	
	public boolean namesTheSame (Monster other) {
		return skeletonName.equals(other.getName());
		
	}
	
	//add a toString
	public String toString () {
		return skeletonName + " " + skeletonSize;
		
	}
}