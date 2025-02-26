package ejercicio2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicio2.model.comicLog;
import ejercicio2.service.*;

@RestController
@RequestMapping("/api/comic")

public class comicController {
	
	private final comicService comicService;
	
	public comicController(comicService comicService) {
		this.comicService = comicService;
	}
	
	@GetMapping("/characters")
    public String getCharacters() {
		System.out.println("getCharacters");
        return comicService.getCharacters();
    }

    @GetMapping("/characters/{id}")
    public String getCharacterById(@PathVariable("id") String id) {
    	System.out.println("getCharacterById");
        return comicService.getCharacterById(id);
    }
    
    @GetMapping("/logs")
    public List<comicLog> getlogs() {
    	System.out.println("getCharacterById");
        return comicService.getlogs();
    }
    
    
}
