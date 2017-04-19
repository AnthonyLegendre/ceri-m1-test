package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public final class IPokemonTrainerFactoryTest {

	@Mock IPokemonTrainerFactory trainerFactory;
	
	@Mock IPokedex pokedex = Mockito.mock(IPokedex.class);
	@Mock IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);
	
	@Mock IPokemonMetadataProvider provider = Mockito.mock(IPokemonMetadataProvider.class);
	@Mock IPokemonFactory pkmFactory = Mockito.mock(IPokemonFactory.class); 
	
	//private PokemonTrainer sacha;
	
	private PokemonTrainer sacha = new PokemonTrainer(
			"Sacha", 
			Team.VALOR,
			pokedexFactory.createPokedex(provider,pkmFactory)
			);
	
	private PokemonMetadata bulbi = new PokemonMetadata(0, "Bulbizarre", 126, 126, 90);
	private PokemonMetadata aquali = new PokemonMetadata(133, "Aquali", 186, 168, 260);
	@Test
	public void testTrainerFactory()
	{
		assertEquals(this.sacha,
		trainerFactory.createTrainer("Sacha", Team.VALOR, pokedexFactory)
					);
	}
	
	@Before
	public void setUp() throws PokedexException
	{
		System.out.println("Test pkd factory");
		System.out.println(pokedexFactory);
		//Mock pokedex
		Mockito.when(pokedex.size()).thenReturn(6);
		
		//Mock provider
		Mockito.when(provider.getPokemonMetadata(0)).thenReturn(this.bulbi);
		Mockito.when(provider.getPokemonMetadata(133)).thenReturn(this.aquali);
		Mockito.when(provider.getPokemonMetadata(-1)).thenThrow(new PokedexException("Index inexistant"));
		Mockito.when(provider.getPokemonMetadata(151)).thenThrow(new PokedexException("Index inexistant"));
		
		//Mock Pokedex factory
		Mockito.when(pokedexFactory.createPokedex(provider, pkmFactory)).thenReturn(pokedex);
		
		//Mock du trainer
		Mockito.when(trainerFactory.createTrainer("Sacha", Team.VALOR, pokedexFactory)).thenReturn(sacha);
	}
	
	
	/* Méthode(s) de la classe à tester 
	 * PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory);
	 */
}
