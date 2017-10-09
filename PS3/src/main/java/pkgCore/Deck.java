package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.poi.ss.formula.functions.Count;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck = new ArrayList<Card>();

	public Deck() {
		ArrayList<Card> deck1 = new ArrayList<Card>();
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				deck1.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
		cardsInDeck = deck1;
	}

	public ArrayList<Card> getDeck()
	{
		return this.cardsInDeck;
	}
	public Card Draw() throws DeckException {
		if (this.cardsInDeck.size()==0) {
			
			throw new DeckException(this);
		}
		return cardsInDeck.remove(0);
	}
	

	public Card Draw(eSuit eSuit) {
		for (Card c:cardsInDeck) {
			if(c.geteSuit() == eSuit)
				return c;
		}
		return null;
	
	}
	
	public Card Draw(eRank eRank) {
		for (Card c:cardsInDeck) {
			if(c.geteRank() == eRank)
				return c;
		}
		return null;
	}
	
	public int DeckSuitCount(eSuit eSuit){
		int cardNbr=0;
		for(Card c: this.cardsInDeck){
			if (c.geteSuit()==eSuit)
				cardNbr++;
		}
		return cardNbr++;
	}
	public int DeckRankCount(eRank eRank){
		int cardNbr=0;
		for(Card c: this.cardsInDeck){
			if (c.geteRank()==eRank)
				cardNbr++;
		}
		return cardNbr++;
	}
			
	public int IsLeft(Card c) {
		for(Card cards:cardsInDeck){
			if (cards == c)
				return 1;
		}
		return 0;
		}
	}
	
	

