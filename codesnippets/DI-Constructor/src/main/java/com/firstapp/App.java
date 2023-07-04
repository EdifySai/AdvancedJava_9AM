package com.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {  
      ApplicationContext applicationContext	= new ClassPathXmlApplicationContext("applicationContext.xml");
     DatabaseConfig dbConfig= (DatabaseConfig)applicationContext.getBean("databaseConnection");
     
     //this.url + "   "+ this.username + "   " +this.dialect + "   "+ this.password;
       System.out.println(dbConfig);
       //jdbc://mysql:localhost:3306/abc   abcjvfdjbd   MysqlDialect   smncvhsdvsvhvcs
     
     
    }
}
