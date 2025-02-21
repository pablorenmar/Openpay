package ejercicio.services;

import ejercicio.components.marvelComponent;

public class marvelService {
	private marvelComponent marvelComponent;
	
	public marvelService(marvelComponent marvelComponent)
	{
		this.marvelComponent = marvelComponent;
	}
	
	public String getCharacters()
	{
		return marvelComponent.getCharacters();
	}
	
	public String getCharactersById(String characterId)
	{
		return marvelComponent.getCharacterById(characterId);
	}
}
