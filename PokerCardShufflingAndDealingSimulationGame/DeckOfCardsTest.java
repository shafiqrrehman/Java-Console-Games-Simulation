// Card shuffling and dealing
public class DeckOfCardsTest {

	// Execute the application in main method
	public static void main(String[] args) {
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // place the Cards in random order

		// Print all 52 Cards in order to in which they are dealt
		for ( int i = 1; i <= 52; i++) {
			
			System.out.printf( "%-19s", myDeckOfCards.dealCard() );

			if ( i % 4 == 0 ) // output newline after every fourth card
				System.out.println();
		}
	}
}
