package com.firstapp;
public class DatabaseConfig {
	private String url; 
	private String username; 
	private String password; 
	private String dialect;
		
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
	@Override
	public String toString() {
		
		return this.url + "   "+ this.username + "   " +this.dialect + "   "+ this.password;
		
	}
}
