package ejercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import ejercicio.services.marvelService;

@SpringBootApplication()
public class comicsApi {

	public static void main(String[] args) {
		SpringApplication.run(comicsApi.class, args);
	}
}
