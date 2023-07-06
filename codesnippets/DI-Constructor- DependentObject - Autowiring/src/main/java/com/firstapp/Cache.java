package com.firstapp;

public class Cache {
private String typeofCache; 
private String cacheClass;
private int noOfConnections;
public Cache(String typeofCache, String cacheClass, int noOfConnections) {
	super();
	this.typeofCache = typeofCache;
	this.cacheClass = cacheClass;
	this.noOfConnections = noOfConnections;
}

public Cache(String typeofCache, String cacheClass) {
	super();
	this.typeofCache = typeofCache;
	this.cacheClass = cacheClass;
}

public Cache(String typeofCache) {
	super();
	this.typeofCache = typeofCache;
}


public String getTypeofCache() {
	return typeofCache;
}
public String getCacheClass() {
	return cacheClass;
}
public int getNoOfConnections() {
	return noOfConnections;
} 
}
