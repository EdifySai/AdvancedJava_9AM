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
             System.out.println("Please make a choice \n 1.add user \n 2.update user \n 3.delete user \n 4. get details by Id \n 5. get all users");
             Scanner sc = new Scanner(System.in);
             int choice = sc.nextInt();
            
             switch (choice) {
			case 1:
				        System.out.println("Enter username");
				         String username = sc.next();
				         System.out.println("Enter password");
				         String password = sc.next();
				         System.out.println("Enter email");
				         String email = sc.next();
				         
				         User u1= new User();
				         u1.setEmail(email);
				         u1.setPassword(password);
				         u1.setUsername(username);
				         addUser(u1);
				break;
				
			case 2 : 
				
				System.out.println("Enter id");
		         int uid = sc.nextInt();
				  System.out.println("Enter username");
			         String username1 = sc.next();
			         System.out.println("Enter password");
			         String password1 = sc.next();
			         System.out.println("Enter email");
			         String email1 = sc.next();
			        
			         User u2= new User();
			         u2.setId(uid);
			         u2.setEmail(email1);
			         u2.setPassword(password1);
			         u2.setUsername(username1);
			         
			         updateUser(u2);  break;
			        
			case 3:     System.out.println("Enter id");
            int id = sc.nextInt();
                        deleteUser(id); break;

			case 4:     System.out.println("Enter id");
			            int uid1 = sc.nextInt();
			            getUserDetails(uid1); break;
			
			case 5:    getAllUsers(); break;
			default:
				break;
			}
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
