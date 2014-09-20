package main;

public class Card {
	//I made these attributes public so that I could manipulate them to test certain functions in the main.
	public int suit;
	public int rank;
	boolean wild = false;
	
	public Card (int x, int y){
		this.suit = x;
		this.rank = y;
	}
	
	public int Getsuit(){
		return this.suit;
	}
	
	public int Getrank(){
		return this.rank;
	}
}
