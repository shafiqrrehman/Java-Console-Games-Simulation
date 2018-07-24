// DeckOfCards class represents a deck of playing cards.
import java.util.Random;

public class DeckOfCards {

	private Card[] deck; // array of Card objects
	private int currentCard; // index of next Card to be dealt
	private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
	private static final Random randomNumbers = new Random(); // Random number genrator

// Constructor fills deck of cards
	public DeckOfCards() {

		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", 
			"Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

		deck = new Card[ NUMBER_OF_CARDS ];
		currentCard = 0; // set currentCard so first card dealt to deck[0]

		// Populate deck with Card Object
		for ( int count = 0; count < deck.length; count++ ) {
			
			deck[ count ] = new Card( faces[count % 13], suits[count / 13] );
		}
	}

// Shuffle deck of Cards with one-pass algorithm 
	public void shuffle() {

		currentCard = 0;

		for ( int first = 0; first < deck.length; first++ ) {
			
			int second = randomNumbers.nextInt( NUMBER_OF_CARDS ); // select a random number between 0 to 51

			// Swap current card with randomly selected card
			Card temp = deck[ first ];
			deck[ first ] = deck[ second ];
			deck[ second ] = temp;
		}
	}

	// Deal One Card
	public Card dealCard() {

		// Determine whether Cards remain to be dealt
		if ( currentCard < deck.length )
			return deck[ currentCard++ ];
		else
			return null; // return null to indicate that all Cards were dealt
	}
}