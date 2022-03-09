public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String name = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int size = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton monster1 = new Skeleton(name, size);
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton monster2 = new Skeleton(name2, size2);
		
		out.println("\nMonster 1 - " + monster1);
		out.println("Monster 2 - " + monster2 + "\n");
		
		if(monster1.isBigger(monster2))
			out.println("Monster one is bigger than Monster two.");
		else if (monster1.isSmaller(monster2))
			out.println("Monster one is smaller than Monster two.");
		else
			out.println("Monster one is the same size as Monster two.");
		
		if(monster1.namesTheSame(monster2))
			out.println("Monster one has the same name as Monster two.");
		else
			out.println("Monster one does not have the same name as Monster two.");
	}
}