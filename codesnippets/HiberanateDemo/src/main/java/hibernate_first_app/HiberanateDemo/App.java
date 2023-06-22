package hibernate_first_app.HiberanateDemo;

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
    public static void main( String[] args )
    {
      StandardServiceRegistry service = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
         
    Metadata metadata=   new MetadataSources(service).getMetadataBuilder().build();
    	 
         SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
         
         System.out.println("sessionFactory" + sessionFactory);
         
        Session session =  sessionFactory.openSession();
        
       Transaction tx =  session.beginTransaction();
       
       User user= new User();
         user.setEmail("ravi@gmail.com");
         user.setUsername("ravi");
         user.setPassword("ravi123");
         user.setId(1);
         session.save(user);
         tx.commit();
         session.close();
         sessionFactory.close();
    }
}
