package ejercicio.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import ejercicio.interfaces.comics;

public class marvelComponent implements comics{
	
	@Value("${marvel.api.base-url}")
    private String baseUrl;

    private final RestTemplate restTemplate;

    public marvelComponent(RestTemplate restTemplate) {
    	this.restTemplate = restTemplate;
    }
    
	@Override
	public String getCharacters() {
		ResponseEntity<String> response = restTemplate.getForEntity(baseUrl + "/v1/public/characters", String.class);
        return response.getBody();
	}

	@Override
	public String getCharacterById(String characterId) {
		ResponseEntity<String> response = restTemplate.getForEntity(baseUrl + "/v1/public/characters/" + characterId, String.class);
        return response.getBody();
	}

}
