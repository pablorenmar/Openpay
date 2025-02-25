package ejercicio.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import ejercicio.interfaces.comics;

public class marvelComponent implements comics{
	
	//@Value("${marvel.api.base-url}")
    private String baseUrl = "https://gateway.marvel.com";

    private final RestTemplate restTemplate;

    public marvelComponent(RestTemplate restTemplate) {
    	this.restTemplate = restTemplate;
    }
    
	@Override
	public String getCharacters() {
		ResponseEntity<String> response = restTemplate.getForEntity(baseUrl + "/v1/public/characters?apikey=91ceabdead37bad85ca5c1398a6ad1fb&hash=27a04a16c54a4dfdbfeb32a2e80f698b&ts=1740108234", String.class);
        return response.getBody();
	}

	@Override
	public String getCharacterById(String characterId) {
		ResponseEntity<String> response = restTemplate.getForEntity(baseUrl + "/v1/public/characters/" + characterId + "?apikey=91ceabdead37bad85ca5c1398a6ad1fb&hash=27a04a16c54a4dfdbfeb32a2e80f698b&ts=1740108234", String.class);
        return response.getBody();
	}

}