package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public final class IPokemonMetadataProviderTest {
	
	
	private PokemonMetadata bulbi = new PokemonMetadata(0, "Bulbizarre", 126, 126, 90);
	private PokemonMetadata aquali = new PokemonMetadata(133, "Aquali", 186, 168, 260);
	
	public IPokemonMetadataProvider getProvider()
	{
		IPokemonMetadataProvider pkmProvider = Mockito.mock(IPokemonMetadataProvider.class);
		return pkmProvider;
	}
	
	@Test
	public void testPkmMetadata() throws PokedexException
	{
		assertEquals(bulbi, this.getProvider().getPokemonMetadata(0));
		
	}
	
	@Test(expected=PokedexException.class)
	public void testExceptionNeg() throws PokedexException
	{
		this.getProvider().getPokemonMetadata(-1);
	}
	
	@Test(expected=PokedexException.class)
	public void testExceptionSup() throws PokedexException
	{
		this.getProvider().getPokemonMetadata(151);
	}
	
	@Before 
	public void setUp() throws PokedexException
	{
		MockitoAnnotations.initMocks(this);
		Mockito.when(this.getProvider().getPokemonMetadata(0)).thenReturn(bulbi);
		Mockito.when(this.getProvider().getPokemonMetadata(133)).thenReturn(aquali);
		
		Mockito.when(this.getProvider().getPokemonMetadata(-1)).thenThrow(new PokedexException("Index inexistant"));
		Mockito.when(this.getProvider().getPokemonMetadata(151)).thenThrow(new PokedexException("Index inexistant"));
	}
	
	/* Méthode(s) de la classe à tester 
	 * PokemonMetadata getPokemonMetadata(int index) throws PokedexException;
	 */
}
