package fr.univavignon.pokedex.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.json.*;
import org.apache.commons.io.IOUtils;

import org.apache.log4j.Logger;

import fr.univavignon.pokedex.api.IPokemonMetadataProvider;
import fr.univavignon.pokedex.api.PokedexException;
import fr.univavignon.pokedex.api.PokemonMetadata;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {

	private static final String JSON_DATA_URL = "https://raw.githubusercontent.com/PokemonGo-Enhanced/node-pokemongo-data/master/data.json";
	private static Logger logger = Logger.getLogger(PokemonMetadataProvider.class);
	
	private static final String pkmName = "Identifier" ;
	private static final String pkmAtt = "BaseAttack";
	private static final String pkmStamina = "BaseStamina";
	private static final String pkmDef = "BaseDefense";
	
	@Override
	public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
		try
		{
			URL url = new URL(JSON_DATA_URL);
			URLConnection connection = url.openConnection();
			
			try(InputStream input = connection.getInputStream())
			{
				logger.info(IOUtils.toString(input));
				JSONArray json = new JSONArray(IOUtils.toString(input));
				JSONObject pokemon = json.getJSONObject(index - 1);
								
				return new PokemonMetadata(index,
						pokemon.getString(pkmName),
						pokemon.getInt(pkmAtt),
						pokemon.getInt(pkmDef),
						pokemon.getInt(pkmStamina));
				
			}
		}
		catch(IOException e)
		{
			throw new PokedexException(e.getMessage());
		}
	}
	
}
