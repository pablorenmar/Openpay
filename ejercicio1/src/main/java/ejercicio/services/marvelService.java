package ejercicio.services;

import org.springframework.stereotype.Service;

import ejercicio.components.marvelComponent;

@Service
public class marvelService {
	
	
	private final marvelComponent marvelComponent;
	
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
