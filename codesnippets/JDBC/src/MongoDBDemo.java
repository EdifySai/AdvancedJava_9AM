import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBDemo {

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost");
		System.out.println(mongoClient);
		
//		mongoClient.getDatabaseNames();
		
		MongoDatabase mongoDB =  mongoClient.getDatabase("jdbcdb");
		
		System.out.println(mongoDB);
		
		//mongoDB.createCollection("products");
		
		MongoCollection collection = mongoDB.getCollection("users");
		collection.drop();
		
		System.out.println("completed");
	
		
	}
	
}
