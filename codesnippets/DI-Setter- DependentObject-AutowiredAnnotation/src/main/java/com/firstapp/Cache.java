package com.firstapp;

import org.springframework.stereotype.Component;

@Component
public class Cache {
private String typeofCache; 
private String cacheClass;
private int noOfConnections;

public void setTypeofCache(String typeofCache) {
	this.typeofCache = typeofCache;
}
public void setCacheClass(String cacheClass) {
	this.cacheClass = cacheClass;
}
public void setNoOfConnections(int noOfConnections) {
	this.noOfConnections = noOfConnections;
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
