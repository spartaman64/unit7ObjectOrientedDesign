/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */	
		Card card1 = new Card("a","b",1);	
		Card card2 = new Card("a","b",1);
		Card card3 = new Card("a","c",1);
		card1.matches(card2);
		card1.toString();
	}
}
