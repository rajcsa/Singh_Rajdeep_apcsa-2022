

import java.util.List;


/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class Fifteens2Board extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 10;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen",
			"king" };

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS = { "spades", "hearts", "diamonds", "clubs" };

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;

	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public Fifteens2Board() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}

	/**
	 * Determines if the selected cards form a valid group for removal. In
	 * Elevens, the legal groups are (1) a pair of non-face cards whose values
	 * add to 11, and (2) a group of three cards consisting of a jack, a queen,
	 * and a king in some order.
	 * 
	 * @param selectedCards
	 *            the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal; false
	 *         otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) 
	{
		if(selectedCards.size() == 2 )
		{
			int totalPointValue = super.cardAt(selectedCards.get(0)).getPointValue()+ super.cardAt(selectedCards.get(1)).pointValue();
			if(totalPointValue==15)
				return true;
			else
				return false;
		}
		else if(selectedCards.size() == 1)
		{
			int totalPointValue = super.cardAt(selectedCards.get(0)).getPointValue();
			if(totalPointValue==13)
				return true;
			else
				return false;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Determine if there are any legal plays left on the board. In Elevens,
	 * there is a legal play if the board contains (1) a pair of non-face cards
	 * whose values add to 11, or (2) a group of three cards consisting of a
	 * jack, a queen, and a king in some order.
	 * 
	 * @return true if there is a legal play left on the board; false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() 
	{
		List<Integer> cardIndexes = super.cardIndexes();
		if (containsPairSum15(cardIndexes) || containsK(cardIndexes)) 
		{
			System.out.println("Another play possible");
			return true;
		} 
		else 
		{
			System.out.println("Another play not possible");
			return false;
		}
	}

	/**
	 * Check for an 13-pair in the selected cards.
	 * 
	 * @param selectedCards
	 *            selects a subset of this board. It is list of indexes into
	 *            this board that are searched to find an 11-pair.
	 * @return true if the board entries in selectedCards contain an 11-pair;
	 *         false otherwise.
	 */
	private boolean containsPairSum15(List<Integer> selectedCards) 
	{
		for (int i = 0; i < selectedCards.size(); i++) 
		{
			Card cardI = this.cardAt(i);
			for (int j = i + 1; j < selectedCards.size(); j++) 
			{
				Card cardJ = this.cardAt(j);
				if(cardJ!=null && cardI!=null)
				{
					int cardVal = cardI.pointValue() + cardJ.pointValue();
					if (cardVal == 15) 
					{
						return true;
					} else 
					{
						continue;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * 
	 * @param selectedCards
	 *            selects a subset of this board. It is list of indexes into
	 *            this board that are searched to find a JQK group.
	 * @return true if the board entries in selectedCards include a jack, a
	 *         queen, and a king; false otherwise.
	 */
	private boolean containsK(List<Integer> selectedCards) 
	{
	
		boolean isKing = false;

		for (int i = 0; i < selectedCards.size(); i++) {
			Card cardI = super.cardAt(i);
			if(cardI!=null)
			{
				String s = cardI.rank();
				if (s.equals("king") && !isKing) 
				{
					isKing = true;
				} 
				else 
				{
					isKing = false;
				//	System.out.println("Not King");
				}
			}
		}

		//System.out.println("isKing:" + isKing);
		if (isKing ) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

}
