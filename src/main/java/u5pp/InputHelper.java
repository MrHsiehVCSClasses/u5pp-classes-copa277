package u5pp;

import java.util.Scanner;

public class InputHelper {
	
	
	//over archign sacnner for first portion
	//constructor scanner
	private Scanner sc;
	public InputHelper(Scanner scanner) {
		sc=scanner;
		
	}
	
	
	//method that returns if true or not 
	public boolean getYesNoInput(String prompt) {
		
		//varibal that acts as a place holder 
		String apple ="A";
		System.out.println(prompt);
		apple=sc.nextLine();
		//checks if the typed in thing has nothing
		while(apple.equals("")) {
			System.out.println(prompt);
			apple=sc.nextLine();
		}
		//does it for eery other exception
		while(!apple.substring(0,1).equals("y")&&!apple.substring(0,1).equals("Y")&&!apple.substring(0,1).equals("n")&&!apple.substring(0,1).equals("N")) {
			System.out.println(prompt);
			apple=sc.nextLine();
		}
		//checker to see if it owuld return 
		
		
		if(apple.substring(0,1).equals("y")||apple.substring(0,1).equals("Y")) {
			return true;
		}
		if(apple.substring(0,1).equals("n")||apple.substring(0,1).equals("N")) {
			return false;
		}
		//placeholder return statement to make sure it runs 
		return true;
		
	}
	
	
	
	//scanner for second portion of thethis 
	
	public int getIntegerInput(String prompt, int min, int max) {
		System.out.print(prompt);
		//filler variable 
		int apple=-9999999;
		String filler=sc.nextLine();
		
		
		
		
		//checks vefore the parse to weed out unwated typped out things 
		for(int i =0;i<filler.length();i++) {
			if(filler.substring(i,i+1)=="1"||filler.substring(i,i+1)=="2"||filler.substring(i,i+1)=="3"||filler.substring(i,i+1)=="4"||filler.substring(i,i+1)=="5"||filler.substring(i,i+1)=="6"||filler.substring(i,i+1)=="7"||filler.substring(i,i+1)=="8"||filler.substring(i,i+1)=="9"||filler.substring(i,i+1)=="0") {
				apple=Integer.parseInt(filler);
				//chekcs for conditions and such 
				if((apple<min) || !(apple > max)) {
					if(apple<min) {
						System.out.println("Invalid input - too low. Please try again.");
					}
					if(apple>max) {
						System.out.println("Invalid input - too high. Please try again.");
					}
					System.out.println(prompt);
					filler=sc.nextLine();
				}
				//finally reutrns if its in the conditiosn 
				
				if(apple>=min&&apple<=max) {
					return apple;
				}
				
			}
		}
		
		//checks if it has nothign typed which runs awas a seperate condition 
		
		if(filler.equals("")) {
			System.out.println("Invalid input - not a number. Please try again.");
			System.out.println(prompt);
		}
			return 0;
		

	}
}
