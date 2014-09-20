package main;

public class Play {
	public static void main(String[] args){
		//Creating a deck with variable named d
		Deck d = new Deck();
		
		//Instantiating first hand
		Hand h1 = new Hand(d);
		
		//Instantiating second hand
		Hand h2 = new Hand(d);
		
		//Showing the cards remaining in the deck
		System.out.println(d.Cardsremaining());
		
		/*This is a test for the check flush
		 * 
		h1.HandCards.get(0).suit= 2;
		h1.HandCards.get(1).suit= 2;
		h1.HandCards.get(2).suit= 2;
		h1.HandCards.get(3).suit= 2;
		h1.HandCards.get(4).suit= 2;
		System.out.print(checkFlush(h1));
		*/
		h1.HandCards.get(0).rank=13;
		h1.HandCards.get(1).rank=5;
		h1.HandCards.get(2).rank=4;
		h1.HandCards.get(3).rank=3;
		h1.HandCards.get(4).rank=2;
		System.out.print(checkStraight(h1));
		
	}
	//This function will check for a flush with a for loop to tally(variable) the number of same suits in a hand.
	public static boolean checkFlush(Hand player){
		
		//tally holds the number of same suits
		int tally = 0;
		
		//This is the return variable that will state whether it is true or false
		boolean ans = false;
		//for loop to check each card against one another
		for(int i = 0; i <=3; i++){
			
			if (player.HandCards.get(i).Getsuit() == player.HandCards.get(i+1).Getsuit()){
				tally += 1;
			}
			//continue;
		}
		
		ans = (tally == 4) ? true : false ;
		return ans;
		
	}
	
	//I'm going to write this function as though we have a sort method that will put our hands into descending order
	//So the functionality will run as though the second card(index 1) would be card1(index 0) would be the second
	//minus one.
	//We just need to add some logic on How an Ace will be handled.
	public static boolean checkStraight(Hand player){
		
		//a variable to report whether there is a straight or not, defaulted at false.
		boolean ans = false;
		if (player.HandCards.get(0).Getrank() == (player.HandCards.get(4).Getrank()-4)){
			ans = true;
			
		}
		
		//If the player had Ace,2,3,4,5 than after the hand is sorted the zero index would be 13 and the second
		//index would be 5 so that would mean the player would have a straight.
		//I was thinking we could hand the ace this way during the flush and straight checks.
		else if( (player.HandCards.get(0).Getrank()==13) && player.HandCards.get(1).Getrank()==5 ){
			ans = true;
		}
		
		return ans;
		
	}
}
