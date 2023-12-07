package u5pp;

public class Dice {
	//instance variables
		private int sides=6;
		private int ivstartingSide=1;
		private String startingColor="green";
		
		
		//constructors of all this
		public Dice() {

			
			
		}
		
		public Dice(int numSides) {
			sides=numSides;
			
			
			
			
		}
		
		
		public Dice(int numSides, int startingSide) {
			sides=numSides;
			if(startingSide>numSides) {
				ivstartingSide=1;
			}
			else {
				ivstartingSide=startingSide;
			}
			
			
		}
		
		public Dice(int numSides, int startingSide, String color) {
			sides=numSides;
			ivstartingSide=startingSide;
			startingColor=color;
			
			
		}
		
		//accessor methods putting the instances variables into acutal numbres 
			
		public int getSides() {
			return sides;
		}
		public int getCurrentSide() {
			return ivstartingSide;
		
		}
		public String getColor() {
			return startingColor;
		}
		public String toString() {
			return "The "+getColor()+" " + getSides()+ "-sided dice is showing "+getCurrentSide();
		}
		
		
		
		
		
		//checks whether or not they are equa
		boolean equals(Dice d) {
			if (d.ivstartingSide==this.ivstartingSide) {
				return true;
				
			}
			return false;
			
		}
		//changes the instance variables using mutators
		
		//changes current  side using math . random
		public int roll() {
			ivstartingSide=(int)(Math.random()*sides)+1 ;
			return ivstartingSide; 
			
			
			
		}
		
		public void changeSide(int num) {
			if(num>0&&num<=sides) {
				ivstartingSide=num;
		
			}
		//chantes the color
		}
		public void changeColor(String color) {
			startingColor=color;
		}

		public void changeNumSides(int num) {
			sides=num;
			
		}
		
		
		
		
		
		
		
		
}