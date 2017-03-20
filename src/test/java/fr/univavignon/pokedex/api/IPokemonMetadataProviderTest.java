package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;

public class IPokemonMetadataProviderTest {
	
	@Test
	public void testPkmMetadata()
	{
		PokemonMetadata bulbi = getPkmMetadata(0);
		
		assertEquals(0, bulbi.getIndex());
		assertEquals("Bulbizarre", bulbi.getName());
		assertEquals(126, bulbi.getAttack());
		assertEquals(126, bulbi.getDefense());
		assertEquals(90, bulbi.getStamina());
		
		PokemonMetadata aquali = getPkmMetadata(133);
		
		assertEquals(0, aquali.getIndex());
		assertEquals("Aquali", aquali.getName());
		assertEquals(186, aquali.getAttack());
		assertEquals(168, aquali.getDefense());
		assertEquals(260, aquali.getStamina());
	}
	
	@Test
	public void testException()
	{
		
	}
	
	public PokemonMetadata getPkmMetadata(int index)
	{
		PokemonMetadata pkm = new PokemonMetadata(0, "Bulbizarre", 126, 126, 90);
		if(index == 133)
		{
			pkm = new PokemonMetadata(133, "Aquali", 186, 168, 260);
		}
			
		return pkm;
	}
	
	
	/* Méthode(s) de la classe à tester 
	 * PokemonMetadata getPokemonMetadata(int index) throws PokedexException;
	 */
}
