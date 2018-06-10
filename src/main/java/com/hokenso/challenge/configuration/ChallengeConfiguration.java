package main.java.com.hokenso.challenge.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "main.java.com.hokenso.challenge")
public class ChallengeConfiguration {
	

}