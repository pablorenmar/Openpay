package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import ejercicio.components.marvelComponent;
import ejercicio.services.marvelService;

public class ejerciciotest {
	@Test
    void testgetCharacters() {
		marvelComponent mockApiClient = Mockito.mock(marvelComponent.class);
        marvelService service = new marvelService(mockApiClient);

        when(mockApiClient.getCharacters()).thenReturn("{\"data\": {\"results\": []}}");

        String result = service.getCharacters();
        assertNotNull(result);
        assertEquals("{\"data\": {\"results\": []}}", result);
    }
	
	@Test
    void testgetCharactersById() {
		marvelComponent mockApiClient = Mockito.mock(marvelComponent.class);
        marvelService service = new marvelService(mockApiClient);

        when(mockApiClient.getCharacterById("1")).thenReturn("{\"data\": {\"results\": []}}");

        String result = service.getCharactersById("1");
        assertNotNull(result);
        assertEquals("{\"data\": {\"results\": []}}", result);
    }
}

