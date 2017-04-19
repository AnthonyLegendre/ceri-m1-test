package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public class IPokemonMetadataProviderTest {
	
	@Mock private IPokemonMetadataProvider pkmProvider;
	private PokemonMetadata bulbi = new PokemonMetadata(1, "Bulbasaur", 126, 126, 90);
	private PokemonMetadata aquali = new PokemonMetadata(133, "Vaporeon", 186, 168, 260);
	
	public IPokemonMetadataProvider getProvider()
	{
		return pkmProvider;
	}
	
	@Test
	public void testPkmMetadata() throws PokedexException
	{
		assertEquals(bulbi, this.getProvider().getPokemonMetadata(1));
		
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
		Mockito.when(this.getProvider().getPokemonMetadata(1)).thenReturn(bulbi);
		Mockito.when(this.getProvider().getPokemonMetadata(133)).thenReturn(aquali);
		
		Mockito.when(this.getProvider().getPokemonMetadata(-1)).thenThrow(new PokedexException("Index inexistant"));
		Mockito.when(this.getProvider().getPokemonMetadata(151)).thenThrow(new PokedexException("Index inexistant"));
	}
	
	/* Méthode(s) de la classe à tester 
	 * PokemonMetadata getPokemonMetadata(int index) throws PokedexException;
	 */
}
