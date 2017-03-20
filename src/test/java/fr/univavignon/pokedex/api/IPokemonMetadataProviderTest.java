package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;

public class IPokemonMetadataProviderTest {
	
	@Test
	public void testPkmMetadata()
	{
		PokemonMetadata pkm = getPkmMetadata(0);
		
		assertEquals(0, pkm.getIndex());
		assertEquals("Bulbizarre", pkm.getName());
		assertEquals(126, pkm.getAttack());
		assertEquals(126, pkm.getDefense());
		assertEquals(90, pkm.getStamina());
	}
	
	@Test
	public void testException()
	{
		//Todo
	}
	
	public PokemonMetadata getPkmMetadata(int index)
	{
		PokemonMetadata bulbi = new PokemonMetadata(0, "Bulbizarre", 126, 126, 90);
		
		return bulbi;
	}
	
	
	/* Méthode(s) de la classe à tester 
	 * PokemonMetadata getPokemonMetadata(int index) throws PokedexException;
	 */
}
