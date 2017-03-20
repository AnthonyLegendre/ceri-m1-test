package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;
//import org.mockito.junit.MockitoJUnit;
//import org.mockito.junit.MockitoRule;

public class IPokedexTest {

	private IPokedex pokedex;
	
	//Mes tests
	@Test
	public void testSum() {
		final int sum = 2 + 2;
		assertEquals(4, sum);
	}
	
	
	@Test
	public void testSize() {
		pokedex = getTestPokedex();
		
		assertEquals(151, pokedex.size());
	}
	
	
	public IPokedex getTestPokedex()
	{
		pokedex = Mockito.mock(IPokedex.class);
		Mockito.when(pokedex.size()).thenReturn(151);
		return pokedex;
	}
	
	//int size()
	//int addPokemon(Pokemon pokemon);
	//Pokemon getPokemon(int id) throws PokedexException;
	//List<Pokemon> getPokemons();
	//List<Pokemon> getPokemons(Comparator<Pokemon> order);
}
