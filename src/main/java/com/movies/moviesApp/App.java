package com.movies.moviesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.movies.security.AppSecurity;

@ImportResource({ "classpath:config.xml" })
@PropertySource(value = "classpath:application.properties")
@Configuration
@ComponentScan(basePackages = { "com.movies.controller" })
@EnableAutoConfiguration
public class App {

	@Bean
	public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
		return new AppSecurity();
	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(App.class);
		application.run(args);
	}
}
