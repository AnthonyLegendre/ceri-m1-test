package fr.univavignon.pokedex.impl;

/**
 * Factory interface for class that aims to create PokemonTrainer instance.
 * 
 * @author anthony
 */
public class PokemonTrainerFactory implements IPokemonTrainerFactory{

	/**
	 * Creates and returns a PokemonTrainer instance.
	 * 
	 * @param name Name of the created trainer.
	 * @param team Team of the created trainer.
	 * @param pokedexFactory Factory to use for creating associated pokedex instance.
	 * @return Created trainer instance.
	 */
	PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory)
	{
		return new PokemonTrainer(name, team, pokedexFactory);
	}
	//Ok fini
}
