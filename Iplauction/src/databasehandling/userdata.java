package databasehandling;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import functions.Func;
import com.mongodb.client.MongoClient;
import org.bson.Document;
public class userdata {
    public static void adduser()
    {
            String url ="mongodb+srv://Singh:0T4px6E8Of7YIisU@singh.rdxxovq.mongodb.net/?retryWrites=true&w=majority"; 
            MongoClient mongoClient =  MongoClients.create(url);
            //Func.print("Connected Successfully!!!!!!!!!");
            MongoDatabase db = mongoClient.getDatabase("IPLAuction");
            db.getCollection("userlist");
            MongoCollection<org.bson.Document> collection = db.getCollection("userlist");
            //System.out.println("collection is ready");
            Document docs = new Document();
            Func.delay(5000);
            Func.print("------------------Enter the Following details-------------------");
            //Func.print("");
            docs.put("Name", Func.input("Name of user: "));
            docs.put("Age",  Func.input("Age : "));
            docs.put("Country", Func.input("Country name : "));
            docs.put("Mobile number",  Func.input("Mobile number : "));
            docs.put("Email", Func.input("Email : "));
            docs.put("Password",  Func.input("Password : "));
            Func.delay(5000);
            Func.print("----------------- User Added Successfully---------------------------------");
            collection.insertOne(docs);
    }
    //Search the user lfor the passlword Credentials 
    public void searchuser()
    {
        //String name = Func.input("Enter the Name of the player : ");
        //String country = Func.input("Enter the country of the player : ");
    }
    
}
