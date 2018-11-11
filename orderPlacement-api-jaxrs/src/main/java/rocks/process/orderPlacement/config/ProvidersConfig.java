package rocks.process.orderPlacement.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Configuration
public class ProvidersConfig {

	@Bean
	@ConditionalOnMissingBean
	public JacksonJsonProvider jsonProvider() {
		return new JacksonJsonProvider();
	}
}