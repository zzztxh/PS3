package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgException.DeckException;

public class DeckTest {


	@Test
	public void TestEmptyDeck() throws DeckException {
		//TODO: Build a deck, draw until you get a DeckException
		Deck d = new Deck();
		boolean bool = false;
		try {
			for (int i=0;i<52;i++)
			{
				d.Draw();
				
			}
			d.Draw();
		}
		catch(DeckException e)
		{
			bool = true;
			assertTrue(bool);
		
		}
	}
	
	@Test
	public void TestDrawSuit() {
		//TODO: Build a deck, test the Draw(eSuit) method
		Deck d = new Deck();
		Card card = d.Draw(pkgEnum.eSuit.CLUBS);
		assertTrue(card.geteSuit()==pkgEnum.eSuit.CLUBS);
	}
	
	@Test
	public void TestDrawRank() {
		//TODO: Build a deck, test the Draw(eRank) method
		Deck d = new Deck();
		Card card = d.Draw(pkgEnum.eRank.ACE);
		assertTrue(card.geteRank()==pkgEnum.eRank.ACE);
	}
	@Test
	public void TestDeckRankCount() {
		//TODO: Build a deck, test the DeckRankCount method
		Deck d = new Deck();
		
		//System.out.println(d.DeckRankCount(pkgEnum.eRank.ACE));
		assertEquals(d.DeckRankCount(pkgEnum.eRank.ACE), 4);
	}
	@Test
	public void TestDeckSuitCount() {
		//TODO: Build a deck, test the DeckSuitCount method
		Deck d = new Deck();
		assertEquals(d.DeckSuitCount(pkgEnum.eSuit.DIAMONDS), 13);
	}

}
