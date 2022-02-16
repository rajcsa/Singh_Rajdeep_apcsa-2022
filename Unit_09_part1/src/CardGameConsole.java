
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class provides a console based UI for solitaire games related to
 * Elevens.
 */
public class CardGameConsole {
	private Board board;
	private Scanner scanner = new Scanner(System.in);
	int totalWins = 0;
	int totalGames = 0;

	public CardGameConsole(Board gameBoard) {
		board = gameBoard;
	}

	/**
	 * Given a board (in the ctor), play a game via the console
	 */
	public void playGame() {
		//welcome message based on board type
		System.out.println("");
		if(board instanceof ThirteensBoard)
			System.out.println("Welcome to ThirteensBoard");
		else if(board instanceof ElevensBoard)
			System.out.println("Welcome to ElevensBoard");
		else if (board instanceof Fifteens2Board)
			System.out.println("Welcome to Fifteens2Board");
		
		System.out.println(" Enter q at any time to quit");
		System.out.println(" Use a numbers separated by spaces");
		System.out.println(" 		to select cards");
		System.out.println("");
		displayBoard();
		System.out.println("");
		System.out.println("Select your cards:");
		System.out.println("");
		
		
        List<Integer> selectedCards = selectCards();
		while (!board.isEmpty()) {
			validSelection(selectedCards);
			displayBoard();
			System.out.println("");
			
			if (board.isEmpty()) {
				totalWins++;
				totalGames++;
			} else if (!board.anotherPlayIsPossible()) {
				totalGames++;
				System.out.println("============================================================== " );
				System.out.println("totalWins<"+totalWins+">"+" out of totalGames <"+totalGames+"> " );
				System.out.println("Another play not possible in this game as no more 13 or king or no cards in the deck" );
				System.out.println("============================================================== " );
				System.exit(0);
			
			}
			System.out.println("");
      System.out.println("Select your cards:");
			System.out.println("");
			selectedCards.clear();
			selectedCards = selectCards();
			
		}
		System.out.println("totalWins<"+totalWins+">"+" out of totalGames <"+totalGames+">" );
	}

	/**
	 * Called by playGame to display the current board state including: - the
	 * cards on the board and their indexes - the number of cards remaining in
	 * the deck
	 */
	private void displayBoard() {
		System.out.println("---------- Cards -----------" + board.deckSize());
		System.out.println(board.toString());
	}

	/**
	 * Called by playGame to checks if selectedCards indexes are within bounds
	 * and do not reference a null card
	 */
	private boolean validSelection(List<Integer> selectedCards) {
		if (!board.isLegal(selectedCards)) {
			System.out.println("");
			System.out.println("Bad selection - try again...:");
			return false;
		} else {
			System.out.println("");
			System.out.println("Good selection, replacing cards...:");
			board.replaceSelectedCards(selectedCards);
			return true;
		}
	}
    //Adding the user input cards to the list 
	
	private List<Integer> selectCards() {
		List<Integer> selectedCards = new ArrayList<>();
		//Adding the user input cards to the list 
		while (selectedCards.size() < 3) {
			//checking user enter alphabets
      char value = scanner.next().charAt(0);
      if(value=='q') {
        System.out.println("ending the game..");
        System.exit(0);
      }
			Boolean flag = Character.isDigit(value); //check if digit
			if(!flag) {
				System.out.println("");
				System.out.println("Bad selection - try again...:");
				displayBoard();
				System.out.println("");
				System.out.println("Select your cards:");
				System.out.println("");
				selectedCards.clear();
				continue;
			}
			int a=Integer.parseInt(String.valueOf(value));
      
			//System.out.println("a vluae--" +a);
			//if user enters more than board size re trying
      if(a>board.size()){
				System.out.println("");
				System.out.println("Bad selection - try again...:");
				displayBoard();
				System.out.println("");
				System.out.println("Select your cards:");
				System.out.println("");
				selectedCards.clear();
				continue;
			} 
			selectedCards.add(a);
			if(board instanceof ElevensBoard){
					if (selectedCards.size() == 1 && board.cardAt(selectedCards.get(0)).getRank().equalsIgnoreCase("king")){
					break;
				}if (selectedCards.size() == 2) {
					break;
				}
		
			} else if((board instanceof ThirteensBoard)|| (board instanceof Fifteens2Board) ){
				if (selectedCards.size() == 1 && board.cardAt(selectedCards.get(0)).getRank().equalsIgnoreCase("king")){
					break;
				}if (selectedCards.size() == 2) {
					break;
				}
		
			} 
			
		}
		return selectedCards;
	}


}