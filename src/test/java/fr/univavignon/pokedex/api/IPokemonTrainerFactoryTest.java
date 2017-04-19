/*
 * Rendre par mail avant le vendredi 5 mai 12h00
 * felix.voituret@ismart.fr
 * Nom + Prenom + Groupe + github url
 * 
 */
package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public final class IPokemonTrainerFactoryTest {

	@Mock private IPokemonTrainerFactory trainerFactory = Mockito.mock(IPokemonTrainerFactory.class);
	
	@Mock private IPokedex pokedex = Mockito.mock(IPokedex.class);
	@Mock private IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);
	
	@Mock private IPokemonMetadataProvider provider = Mockito.mock(IPokemonMetadataProvider.class);
	@Mock private IPokemonFactory pkmFactory = Mockito.mock(IPokemonFactory.class); 
	
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
		Mockito.when(trainerFactory.createTrainer("Sacha", Team.VALOR, pokedexFactory)).thenReturn(this.sacha);
	}
	
	
	/* Méthode(s) de la classe à tester 
	 * PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory);
	 */
}
