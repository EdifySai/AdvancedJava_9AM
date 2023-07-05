package com.firstapp;

public class DatabaseConfig {
	private String url; 
	private String username; 
	private String password; 
	private String dialect;
	private Cache cache;
	
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
	public void setCache(Cache cache) {
		this.cache = cache;
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
	public Cache getCache() {
		return cache;
	}
	

	
}
