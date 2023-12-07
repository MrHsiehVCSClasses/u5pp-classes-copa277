package u5pp;

public class Card {
	//instance variables
	private String ivvalue="2";
	private String ivsuit="clubs";
	
	
	//constructors 
	public Card() {
		
		
		
	}
	
	
	public Card(String suit) {
		ivsuit=suit;
		
		
		
	}


	public Card(String suit, String value) {
		ivsuit=suit;
		ivvalue=value;
		
		
		
		
		
	}
	
	
	//accessors and getters 
	
	public String getValue() {
		return ivvalue;
		
	}
	
	
	public String getSuit() {
		return ivsuit;
	}
	
	
	//turns the card into an acuta statement stinrg
	public String toString() {
		return "The "+ivvalue+ " of " + ivsuit;
		
	}
	
	
	//checks if two cards are the same 
	public boolean equals(Card c) {
		
		
		if((c.ivsuit==this.ivsuit)&&(c.ivvalue==this.ivvalue)) {
			return true;
		}
		return false;
		
	}
	
	//mutators and setters in this instance
	public void changeSuit(String suit) {
		suit=suit.toLowerCase();
		if(suit.equals("clubs")||suit.equals("diamonds")||suit.equals("hearts")||suit.equals("spades")) {
			ivsuit=suit;
		}
		
	}
	
	
	
	public void changeValue(String value) {
		
		value=value.toLowerCase();
		if(value.equals("2")||value.equals("3")||value.equals("4")||value.equals("5")||value.equals("6")||value.equals("7")||value.equals("8")||value.equals("9")||value.equals("10")||value.equals("jack")||value.equals("queen")||value.equals("king")||value.equals("ace")) {
			ivvalue=value;
		}
		
		}
	
	
	
	
	
	
	
	
	
	
	

}
