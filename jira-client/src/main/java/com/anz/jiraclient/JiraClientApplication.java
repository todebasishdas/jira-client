package com.anz.jiraclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JiraClientApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(JiraClientApplication.class);
	@Autowired
	RatesClient client;
	
	public static void main(String[] args)  {
		SpringApplication.run(JiraClientApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
	
		logger.info("Calling the rates url");
		
		client.getRates();
		
		logger.info(client.getRates());
		
	}
}
