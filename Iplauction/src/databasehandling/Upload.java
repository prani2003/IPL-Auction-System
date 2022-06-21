//For adding a user and Creating a players profile
package databasehandling;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import functions.Func;
import com.mongodb.client.MongoClient;
import org.bson.Document;
public class Upload
{
    public static void addplalyer()
    {
            String url ="mongodb+srv://Singh:0T4px6E8Of7YIisU@singh.rdxxovq.mongodb.net/?retryWrites=true&w=majority"; 
            MongoClient mongoClient =  MongoClients.create(url);
            //Func.print("Connected Successfully!!!!!!!!!");
            MongoDatabase db = mongoClient.getDatabase("IPLAuction");
            db.getCollection("playerlist");
            MongoCollection<org.bson.Document> collection = db.getCollection("playerlist");
            //System.out.println("collection is ready");
            Document docs = new Document();
            Func.delay(1000);
            Func.print("------------------Enter the Following details-------------------");
            docs.put("Set No", Func.input("Set No: "));
            docs.put("Set Name",  Func.input("Set Name: "));
            docs.put("Player",  Func.input("Player Name: "));
            docs.put("Country", Func.input("Country : "));
            docs.put("Age",  Func.input("Age : "));
            docs.put("Specialism", Func.input("Specialism : "));
            docs.put("Batting",  Func.input("Battinlg Style: "));
            docs.put("Bowling",  Func.input("Bowlinlg Style: "));
            docs.put("No of Ipl matches",  Func.input("No. Matches played in IPL: "));
            docs.put("C/U/A",  Func.input("capped/uncapped: "));
            docs.put("Base Price",  Func.input("Base Price: "));
            collection.insertOne(docs);
            Func.delay(1000);
            Func.print("-----------------player Added Successfully---------------------------------");


    }
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
            Func.print("");
            docs.put("Name", Func.input("Name od user: "));
            docs.put("Age",  Func.input("Age : "));
            docs.put("Country", Func.input("Country name : "));
            docs.put("Mobile number",  Func.input("Mobile number : "));
            docs.put("Email", Func.input("Email : "));
            docs.put("Password",  Func.input("Password : "));
            Func.delay(5000);
            Func.print("----------------- User Added Successfully---------------------------------");
            collection.insertOne(docs);
            
            



    }
}