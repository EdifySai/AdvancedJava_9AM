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
             session =  sessionFactory.openSession(); 
             tx =  session.beginTransaction();
             User user = (User)session.get(User.class, 3);
             System.out.println(user.getEmail() + "\t" + user.getUsername());
             User user1 = (User)session.get(User.class, 3);
             System.out.println(user1.getEmail() + "\t" + user1.getUsername());
             User user2 = (User)session.get(User.class, 6);
             System.out.println(user2.getEmail() + "\t" + user2.getUsername());
             User user3 = (User)session.get(User.class, 6);
             System.out.println(user3.getEmail() + "\t" + user3.getUsername());
             User user4 = (User)session.get(User.class, 6);
             System.out.println(user4.getEmail() + "\t" + user4.getUsername());
             User user5 = (User)session.get(User.class, 5);
             System.out.println(user5.getEmail() + "\t" + user5.getUsername());
             User user6 = (User)session.get(User.class, 5);
             System.out.println(user6.getEmail() + "\t" + user6.getUsername());
             session.close();
             System.out.println("-----session 1 closed");
             
             Session session2 =  sessionFactory.openSession(); 
             
            Transaction tx1 =  session2.beginTransaction();
             User user12 = (User)session2.get(User.class, 3);
             System.out.println(user12.getEmail() + "\t" + user12.getUsername());
             
          
             
             
             
             
             
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
