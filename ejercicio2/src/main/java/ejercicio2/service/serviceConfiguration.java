package ejercicio2.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.*;
import ejercicio.components.marvelComponent;
import ejercicio.services.*;

@Configuration
public class serviceConfiguration {

	@Bean
	public RestTemplate RestTemplate()
	{
		return new RestTemplate();
	}
	
	@Bean
	public marvelComponent marvelComponent() {
		return new marvelComponent(RestTemplate());
	}
	
	@Bean
	public marvelService marvelService() {
		return new marvelService(marvelComponent());
	}
}
