package main;
import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> hand;
	
	private int HandStrength;
	private int LowHand;
	private int Highhand;
	private int Kicker;
	private boolean Scored = false;
	
	public ArrayList<Card> HandCards = new ArrayList<Card>();
	
	public Hand(Deck d){
		for (int i =1; i<=5; i++){
			Card addcard = d.drawCard();
			HandCards.add(addcard);
			
		}
		
	}
	
	//public int 
	
	

}
