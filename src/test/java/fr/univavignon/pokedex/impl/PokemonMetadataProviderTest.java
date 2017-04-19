package fr.univavignon.pokedex.impl;

import org.junit.Test;
import org.junit.runner.RunWith;

import fr.univavignon.pokedex.api.IPokemonMetadataProvider;
import fr.univavignon.pokedex.api.IPokemonMetadataProviderTest;

public class PokemonMetadataProviderTest extends IPokemonMetadataProviderTest {

	@Override 
	public IPokemonMetadataProvider getProvider()
	{
		PokemonMetadataProvider provider = new PokemonMetadataProvider();
		return provider;
	}
	
	@Test
	public void emptyTest() {}
}
