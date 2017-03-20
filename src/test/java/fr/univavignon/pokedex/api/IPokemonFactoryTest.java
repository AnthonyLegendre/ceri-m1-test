package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class IPokemonFactoryTest {
	
	
	/*@SuppressWarnings("deprecation")
	@Test
	public void testCreatePokemon()
	{
		Pokemon pkm = getPokemon(133);
		
		assertEquals(133, pkm.getIndex());
		assertEquals(2729,  pkm.getCp());
		assertEquals(202,  pkm.getHp());
		assertEquals(5000, pkm.getDust());
		assertEquals(4, pkm.getCandy());
		assertEquals(100.0, pkm.getIv());
		
	}
	*/
	public Pokemon getPokemon(int index)
	{
		IPokemonMetadataProviderTest provider = new IPokemonMetadataProviderTest();
		PokemonMetadata aquali = provider.getPokemonMetadata(133);
		
		Pokemon pkm = new Pokemon(
						aquali.getIndex(),
						aquali.getName(),
						aquali.getAttack(),
						aquali.getDefense(),
						aquali.getStamina(),
						2729,
						202,
						5000,
						4,
						100.0
					);
		
		return pkm;
	}
	
	
	/* Méthode(s) de la classe à tester 
	 * Pokemon createPokemon(int index, int cp, int hp, int dust, int candy);
	 */
}
