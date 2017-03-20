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
		
		assertEquals(133, aquali.getIndex());
		assertEquals("Aquali", aquali.getName());
		assertEquals(186, aquali.getAttack());
		assertEquals(168, aquali.getDefense());
		assertEquals(260, aquali.getStamina());
	}
	
	@Test(expected=PokedexException.class)
	public void testExceptionNeg()
	{
		PokemonMetadata fail = getPkmMetadata(-1);
		fail.getIndex();
		
	}
	
	@Test(expected=PokedexException.class)
	public void testExceptionSup()
	{
		PokemonMetadata fail = getPkmMetadata(165);
		fail.getIndex();
	}
	
	public PokemonMetadata getPkmMetadata(int index)
	{
		PokemonMetadata pkm = Mockito.mock(PokemonMetadata.class);
		Mockito.when(pkm.getIndex()).thenReturn(0);
		Mockito.when(pkm.getName()).thenReturn("Bulbizarre");
		Mockito.when(pkm.getAttack()).thenReturn(126);
		Mockito.when(pkm.getDefense()).thenReturn(126);
		Mockito.when(pkm.getStamina()).thenReturn(90);
		
		if(index == 133)
		{
			pkm = Mockito.mock(PokemonMetadata.class);
			Mockito.when(pkm.getIndex()).thenReturn(133);
			Mockito.when(pkm.getName()).thenReturn("Aquali");
			Mockito.when(pkm.getAttack()).thenReturn(186);
			Mockito.when(pkm.getDefense()).thenReturn(168);
			Mockito.when(pkm.getStamina()).thenReturn(260);
		}
		if(index < 0 || index > 150)
		{
			Mockito.when(pkm.getIndex()).thenThrow(new PokedexException("Index inexistant"));
		}
			
		return pkm;
	}
	
	
	/* Méthode(s) de la classe à tester 
	 * PokemonMetadata getPokemonMetadata(int index) throws PokedexException;
	 */
}
