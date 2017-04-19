package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;

public class IPokedexFactoryTest {

	@Mock private IPokedexFactory pokedexFactory;
	
	IPokedex pokedex = Mockito.mock(IPokedex.class);
	
	IPokemonMetadataProvider provider;
	IPokemonFactory pkmFactory; 
	
	@Before
	public void setUp()
	{
		//Mock pokedex
		Mockito.when(pokedex.size()).thenReturn(6);
		
		//Mock Pokedex factory
		Mockito.when(pokedexFactory.createPokedex(provider, pkmFactory)).thenReturn(pokedex);
	}
	
	public void testCreatePokedex()
	{
		assertEquals(pokedex, pokedexFactory.createPokedex(provider, pkmFactory));
	}
	

	
	/* Méthode(s) de la classe à tester 
	 * IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory);
	 */
}
