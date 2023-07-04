package com.firstapp;

public class DatabaseConfig {
	
	
	private String url; 
	private String username; 
	private String password; 
	private String dialect;
	public DatabaseConfig(String url, String username, String password, String dialect) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		this.dialect = dialect;
	} 
	
	@Override
	public String toString() {
		
		return this.url + "   "+ this.username + "   " +this.dialect + "   "+ this.password;
		
	}

}
