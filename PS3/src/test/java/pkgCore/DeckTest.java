package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgException.DeckException;

public class DeckTest {


	@Test
	public void TestEmptyDeck() throws DeckException {
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
		Deck d = new Deck();
		Card card = d.Draw(pkgEnum.eSuit.CLUBS);
		assertTrue(card.geteSuit()==pkgEnum.eSuit.CLUBS);
	}
	
	@Test
	public void TestDrawRank() {
		Deck d = new Deck();
		Card card = d.Draw(pkgEnum.eRank.ACE);
		assertTrue(card.geteRank()==pkgEnum.eRank.ACE);
	}
	@Test
	public void TestDeckRankCount() {
		Deck d = new Deck();
		
		//System.out.println(d.DeckRankCount(pkgEnum.eRank.ACE));
		assertEquals(d.DeckRankCount(pkgEnum.eRank.ACE), 4);
	}
	@Test
	public void TestDeckSuitCount() {
		Deck d = new Deck();
		assertEquals(d.DeckSuitCount(pkgEnum.eSuit.DIAMONDS), 13);
	}

}
