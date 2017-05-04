package fr.univavignon.pokedex.impl;

/**
 * Factory interface for class that aims to create Pokemon instance.
 * 
 * @author anthony
 */
public interface PokemonFactory implements IPokemonFactory{

	/**
	 * Creates a pokemon instance computing it IVs.
	 * 
	 * @param index Pokemon index.
	 * @param cp Pokemon CP.
	 * @param hp Pokemon HP.
	 * @param dust Required dust for upgrading pokemon.
	 * @param candy Required candy for upgrading pokemon.
	 * @return Created pokemon instance.
	 */
	Pokemon createPokemon(int index, int cp, int hp, int dust, int candy)
	{
		PokemonMetadataProvider provider = new PokemonMetadataProvider();
		PokemonMetadata datas = provider.getPokemonMetadata(index);
		
		return new Pokemon(
					index,
					datas.getAttack(),
					datas.getDefense(),
					datas.getStamina(),
					cp,
					hp,
					dust,
					candy,
					100);
	}
	
	//Ok fini
}
