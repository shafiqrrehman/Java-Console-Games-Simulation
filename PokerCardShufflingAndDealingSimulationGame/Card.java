// Card class represent a playing card.
public class Card {

	private String face; // face of card ("Ace", "Deuce", .....)
	private String suit; // suit of card ("Hearts", "Hearts", ....)

	// two-argument constructor initializes card's face suit
	public Card(String cardFace, String cardSuit) {

		face = cardFace;
		suit = cardSuit;
	}

	// return String representation of Card.
	public String toString() {

		return face + " of " + suit;
	}
}