package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;

public class IPokemonFactoryTest {	
	@Test
	public void testCreatePokemon()
	{
		Pokemon pkm = createPokemon(133);
		
		assertEquals(133, pkm.getIndex());
		assertEquals(2729,  pkm.getCp());
		assertEquals(202,  pkm.getHp());
		assertEquals(5000, pkm.getDust());
		assertEquals(4, pkm.getCandy());
		assertEquals(100, pkm.getIv(), 0);
		
	}
	
	public Pokemon createPokemon(int index)
	{
		PokemonMetadata aquali = new PokemonMetadata(133, "Aquali", 186, 168, 260);
		
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
						100
					);
		
		return pkm;
	}
	
	/* Méthode(s) de la classe à tester 
	 * Pokemon createPokemon(int index, int cp, int hp, int dust, int candy);
	 */
}
