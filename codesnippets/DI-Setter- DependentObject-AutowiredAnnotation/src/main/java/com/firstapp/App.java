package com.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {  
      ApplicationContext applicationContext	= new ClassPathXmlApplicationContext("applicationContext.xml");
     DatabaseConfig dbConfig= (DatabaseConfig)applicationContext.getBean("databaseConnection");
     
            System.out.println(dbConfig.getCache().getTypeofCache());
            System.out.println(dbConfig.getCache().getNoOfConnections());
            System.out.println(dbConfig.getUsername());
    }
}
