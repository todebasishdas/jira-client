package com.anz.jiraclient;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

@Component
public class RatesClient {

		private final String forexAccountServiceUrl;
		private final RestOperations rest;
	
		public RatesClient(final RestTemplateBuilder builder, final RatesClientProperties pros ){
			
			rest = builder.setReadTimeout(pros.getReadTimeOut())
				 .setConnectTimeout(pros.getConnectTimeOut())
					.build();
			
			forexAccountServiceUrl = pros.getRatesServiceUrl();
			
		}
		
		public String getRates(){
			return rest.getForObject(forexAccountServiceUrl, String.class);
		}
}
