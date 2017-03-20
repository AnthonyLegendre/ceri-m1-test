package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class IPokedexTest {

	@Mock private IPokedex pokedexMock;
	
	//Définition des résultats Mocks
	//when(pokedexMock.size()).thenReturn(151);
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	
	//Mes tests
	@Test
	public void testSum() {
		final int sum = 2 + 2;
		assertEquals(4, sum);
	}
	
	@Test
	public void testSize() {
		IPokedex pokedex = getTestPokedex();
		
		assertEquals(pokedex.size(), 151);
	}
	
	
	public IPokedex getTestPokedex()
	{
		return pokedexMock;
	}
	
	//int size()
	//int addPokemon(Pokemon pokemon);
	//Pokemon getPokemon(int id) throws PokedexException;
	//List<Pokemon> getPokemons();
	//List<Pokemon> getPokemons(Comparator<Pokemon> order);
}
