package fr.univavignon.pokedex.impl;

import java.util.Comparator;
import java.util.List;

import fr.univavignon.pokedex.api.IPokedex;
import fr.univavignon.pokedex.api.IPokemonFactory;
import fr.univavignon.pokedex.api.IPokemonMetadataProvider;
import fr.univavignon.pokedex.api.PokedexException;
import fr.univavignon.pokedex.api.Pokemon;
import fr.univavignon.pokedex.api.PokemonMetadata;

public class Pokedex implements IPokedex {

	private IPokemonMetadataProvider provider;
	private IPokemonFactory pkmFactory;
	
	Pokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory)
	{
		this.provider = metadataProvider;
		this.pkmFactory = pokemonFactory;
	}
	
	@Override
	public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addPokemon(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pokemon getPokemon(int id) throws PokedexException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pokemon> getPokemons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
		// TODO Auto-generated method stub
		return null;
	}

}
