package com.firstapp;

public class DatabaseConfig {
	private String url; 
	private String username; 
	private String password; 
	private String dialect;
	private Cache cache;
	public DatabaseConfig(String url, String username, String password, String dialect, Cache cache) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		this.dialect = dialect;
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
