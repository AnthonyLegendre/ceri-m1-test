package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class IPokedexTest {

	@Mock private IPokedex pokedexMock;
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();

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
}
