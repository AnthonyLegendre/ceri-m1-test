package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;

public class IPokedexTest {

	private IPokedex pokedex;
	
	@Test
	public void testSize() {
		pokedex = getTestPokedex();
		
		assertEquals(6, pokedex.size());
	}
	
	public IPokedex getTestPokedex()
	{
		pokedex = Mockito.mock(IPokedex.class);
		Mockito.when(pokedex.size()).thenReturn(6);
		return pokedex;
	}
	
	/* Méthodes de la classe à tester :
	*	int size()
	*	int addPokemon(Pokemon pokemon);
	*	Pokemon getPokemon(int id) throws PokedexException;
	*	List<Pokemon> getPokemons();
	*	List<Pokemon> getPokemons(Comparator<Pokemon> order);
	*/
}
