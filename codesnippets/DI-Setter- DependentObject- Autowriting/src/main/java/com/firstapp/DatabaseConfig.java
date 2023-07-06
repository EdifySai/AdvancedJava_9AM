package com.firstapp;

public class DatabaseConfig {
	private String url; 
	private String username; 
	private String password; 
	
	private String dialect;
	private Cache cache2;
	
	public Cache getCache2() {
		return cache2;
	}
	public void setCache2(Cache cache2) {
		this.cache2 = cache2;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDialect(String dialect) {
		this.dialect = dialect;
	}
	
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getDialect() {
		return dialect;
	}
	
	
}