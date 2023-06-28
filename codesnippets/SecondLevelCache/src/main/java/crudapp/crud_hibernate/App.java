package crudapp.crud_hibernate;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
	static Session session= null;
	static Transaction  tx=null;
    public static void main( String[] args )
    {
    	StandardServiceRegistry service = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata=   new MetadataSources(service).getMetadataBuilder().build();
             SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
             System.out.println("sessionFactory" + sessionFactory);
             System.out.println("Session 1 opened");
             session =  sessionFactory.openSession(); 
             
             User user = (User)session.get(User.class, 3);
             System.out.println(user.getEmail() + "\t" + user.getUsername());
             User user1 = (User)session.get(User.class, 3);
             System.out.println(user1.getEmail() + "\t" + user1.getUsername());
             session.close();
             System.out.println("session 1 closed");
             
             System.out.println("session 2 opened");
             
             Session session2 =  sessionFactory.openSession(); 
             User user12 = (User)session2.get(User.class, 3);
             System.out.println(user12.getEmail() + "\t" + user12.getUsername());
             
             session2.close();
             System.out.println("session 2 closed");
             
             System.out.println("session 3 opened");
             
            Session session3 =  sessionFactory.openSession();
            
            User user13 = (User)session3.get(User.class, 3);
            User user14 = (User)session3.get(User.class, 3);
            User user15 = (User)session3.get(User.class, 3);
            User user16 = (User)session3.get(User.class, 3);
            User user17 = (User)session3.get(User.class, 3);
            User user18 = (User)session3.get(User.class, 3);
            
            System.out.println(user13.getEmail() + "\t" + user13.getUsername());
            System.out.println(user14.getEmail() + "\t" + user14.getUsername());
            System.out.println(user15.getEmail() + "\t" + user15.getUsername());
            System.out.println(user16.getEmail() + "\t" + user16.getUsername());
            System.out.println(user17.getEmail() + "\t" + user17.getUsername());
            System.out.println(user18.getEmail() + "\t" + user18.getUsername());
            
            sessionFactory.close();
            
            System.out.println("sessionfactory 1 closed");
            
            System.out.println("session factory 2 opened");
            
            StandardServiceRegistry service2 = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            Metadata metadata2=   new MetadataSources(service2).getMetadataBuilder().build();
               
            SessionFactory sessionFactory2 = metadata2.getSessionFactoryBuilder().build();
            
           Session sF2Session1 =  sessionFactory2.openSession();
           
           User user19 = (User)sF2Session1.get(User.class, 3);
           
           System.out.println(user19.getEmail() + "\t" + user19.getUsername());     
                 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void addUser(User user) {
	    	System.out.println(session.save(user));
	    	tx.commit();
	    	System.out.println("User Added");
    		
    }
    public static void updateUser(User user) {
    	session.update(user);
    	tx.commit();
    	System.out.println("updated");
		
    }
    
    public static void getUserDetails(int id) {
    	User user = session.get(User.class, id);
    	System.out.println(user.getUsername()+ "\t"+user.getEmail());
    }
    
    public static void getAllUsers() {
    	
    	Query query = session.createQuery("from User u");
    	
    List<User> users =	query.getResultList();
    
          ListIterator list = users.listIterator();
          
          while(list.hasNext()) {
        	 User u = (User)list.next();
        	 
        	  System.out.println(u.getEmail() + "\t"+ u.getUsername());
          }
    	
    }
    
    public static void deleteUser(int id) {
    	User user = session.get(User.class, id);
    	session.delete(user);
    	tx.commit();
    	System.out.println("deleted");
    }
    
}
