package physio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import lombok.Getter;

@Configuration
@EnableWebMvc
@EnableCaching
@Getter
@ComponentScan(basePackages = "physio")
public class PhysioConfig {

	private static final Log logger = LogFactory.getLog(PhysioConfig.class);

	private String test;

	public PhysioConfig() {
		logger.info("Start application.");
		test = "test";
	}

}