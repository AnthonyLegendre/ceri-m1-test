package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public final class IPokemonTrainerFactoryTest {

	@Mock IPokemonTrainerFactory trainerFactory;
	
	IPokedexTest pokedex = new IPokedexTest();
	IPokedexFactoryTest pokedexFactory = new IPokedexFactoryTest();
	IPokemonMetadataProviderTest provider = new IPokemonMetadataProviderTest();
	IPokemonFactoryTest pkmFactory = new IPokemonFactoryTest(); 
	
	
	private PokemonTrainer sacha = new PokemonTrainer(
			"Sacha", 
			Team.VALOR,
			pokedexFactory.getFactory().createPokedex(provider.getProvider(),
			pkmFactory.getFactory()));
	
	
	@Test
	public void testTrainerFactory()
	{
		assertEquals(this.sacha,
		trainerFactory.createTrainer(null, null, null)
					);
	}
	
	@Before
	public void setUp()
	{
		Mockito.when(trainerFactory.createTrainer("Sacha", Team.VALOR, pokedexFactory.getFactory())).thenReturn(sacha);
		Mockito.when(trainerFactory.createTrainer(null, null, null)).thenReturn(this.sacha);
	}
	
	
	/* Méthode(s) de la classe à tester 
	 * PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory);
	 */
}
