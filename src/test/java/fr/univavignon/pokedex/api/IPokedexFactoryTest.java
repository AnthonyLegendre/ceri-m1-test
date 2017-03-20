package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;

public class IPokedexFactoryTest {

	@Mock private IPokedexFactory pokedexFactory;
	
	IPokedexTest pokedex = new IPokedexTest();
	IPokemonMetadataProviderTest provider = new IPokemonMetadataProviderTest();
	IPokemonFactoryTest pkmFactory = new IPokemonFactoryTest();
	
	@Before
	public void setUp()
	{
		Mockito.when(pokedexFactory.createPokedex(provider.getProvider(), pkmFactory.getFactory())).thenReturn(pokedex.getTestPokedex());
	}
	
	public void testCreatePokedex()
	{
		assertEquals(pokedex.getTestPokedex(), pokedexFactory.createPokedex(provider.getProvider(), pkmFactory.getFactory()));
	}
	
	public IPokedexFactory getFactory()
	{
		return pokedexFactory;
	}
	

	
	/* Méthode(s) de la classe à tester 
	 * IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory);
	 */
}
