package com.anz.jiraclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("rates.client")
public class RatesClientProperties {
	
	private int readTimeOut;
	private int connectTimeOut;
	private String username;
	private char[] password;
	private String ratesServiceUrl;
	
	public int getReadTimeOut() {
		return readTimeOut;
	}
	public void setReadTimeOut(int readTimeOut) {
		this.readTimeOut = readTimeOut;
	}
	public int getConnectTimeOut() {
		return connectTimeOut;
	}
	public void setConnectTimeOut(int connectTimeOut) {
		this.connectTimeOut = connectTimeOut;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getRatesServiceUrl() {
		return ratesServiceUrl;
	}
	public void setRatesServiceUrl(String ratesServiceUrl) {
		this.ratesServiceUrl = ratesServiceUrl;
	}

}
	