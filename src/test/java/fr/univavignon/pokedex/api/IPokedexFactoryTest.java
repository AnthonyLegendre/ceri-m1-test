package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class IPokedexFactoryTest {

	@Mock private IPokedex pokedex = Mockito.mock(IPokedex.class);
	@Mock private IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);
	
	@Mock private IPokemonMetadataProvider provider = Mockito.mock(IPokemonMetadataProvider.class);
	@Mock  private IPokemonFactory pkmFactory = Mockito.mock(IPokemonFactory.class); 
	
	@Before
	public void setUp()
	{
		//Mock pokedex
		Mockito.when(pokedex.size()).thenReturn(6);
		
		//Mock Pokedex factory
		Mockito.when(pokedexFactory.createPokedex(provider, pkmFactory)).thenReturn(pokedex);
	}
	
	@Test
	public void testCreatePokedex()
	{
		assertEquals(pokedex, pokedexFactory.createPokedex(provider, pkmFactory));
	}
	

	
	/* Méthode(s) de la classe à tester 
	 * IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory);
	 */
}
