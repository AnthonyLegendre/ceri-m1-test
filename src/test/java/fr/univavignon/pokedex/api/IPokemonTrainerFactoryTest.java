package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;

public final class IPokemonTrainerFactoryTest {

	@Mock IPokemonTrainerFactory trainerFactory;
	
	IPokedexTest pokedex = new IPokedexTest();
	PokemonTrainer sacha = new PokemonTrainer("Sacha", Team.VALOR, pokedex.getTestPokedex());
	IPokedexFactoryTest pokedexFactory = new IPokedexFactoryTest();
	
	@Test
	public void testTrainerFactory()
	{
		assertEquals(sacha, trainerFactory.createTrainer("Sacha", Team.VALOR, pokedexFactory.getFactory()));
	}
	
	public void setUp()
	{
		Mockito.when(trainerFactory.createTrainer("Sacha", Team.VALOR, pokedexFactory.getFactory())).thenReturn(sacha);
		Mockito.when(trainerFactory.createTrainer(null, null, null)).thenReturn(sacha);
	}
	
	
	/* Méthode(s) de la classe à tester 
	 * PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory);
	 */
}
