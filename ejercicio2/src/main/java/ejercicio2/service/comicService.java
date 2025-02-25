package ejercicio2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicio2.model.comicLog;
import ejercicio2.repository.*;
import ejercicio.services.marvelService;

@Service
public class comicService {
	
	private final comicRepository comicRepository;
	
	@Autowired
	private final marvelService marvelService;
	
	public comicService(comicRepository comicRepository, marvelService marvelService)
	{
		this.comicRepository = comicRepository;
		this.marvelService = marvelService;
	}
	
	public String getCharacters()
	{
		comicRepository.save(new comicLog("getCharacters"));
		return marvelService.getCharacters();
	}
	
	public String getCharacterById(String Id)
	{
		comicRepository.save(new comicLog("getCharacterById:" + Id));
		return marvelService.getCharactersById(Id);
	}
}
