import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CardGameConsole console = null;
		Board board = null;

		// ask the user to choose a game to play...
		Scanner scanner = new Scanner(System.in);
		String option = "";
		
		do {
			System.out.println("");
			System.out.println("Choose GUI or nonGUI ? Enter true for GUI and false for nonGUI");
			System.out.println("");
			option = scanner.next();
		}while(!("true".equalsIgnoreCase(option)||"false".equalsIgnoreCase(option)));
		boolean nonGUI = false;
		if("true".equalsIgnoreCase(option)){
			nonGUI = true;
		}
    System.out.println("Kushal Period1 Apr 19 2021 computernum(1000000)");
		System.out.println("Welcome to the game");
		System.out.println("==================");
		System.out.println("Choose a game to play:");

		int select = 0;

		System.out.println("1) Thirteens, 2) Elevens, 3) Fifteens 0) quit");
		System.out.println("");
		select = scanner.nextInt();
		switch (select) {
		case 1:
			board = new ThirteensBoard();
			// play the game
			if (!nonGUI)
				playAGame(board);
			else
				playAGUIGame(board);

			break;
		case 2:
			board = new ElevensBoard();
			// play the game
			if (!nonGUI)
				playAGame(board);
			else
				playAGUIGame(board);

			break;
		case 3:
			board = new Fifteens2Board();
			// play the game
			if (!nonGUI)
				playAGame(board);
			else
				playAGUIGame(board);

			break;
		
		default:
		}

	}

	// plays a card game via the console
	public static void playAGame(Board board) {
		CardGameConsole console = new CardGameConsole(board);
		console.playGame();
	}

	// play a card game using a GUI
	public static void playAGUIGame(Board board) {
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}

}