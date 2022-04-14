import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = null;
        try {
            mongoClient = new MongoClient( "localhost" , 27017 );
            System.out.println("Connected to MongoDB!");

            MongoDatabase database = mongoClient.getDatabase("Spotify");
            MongoCollection col = database.getCollection("SpotifyAlbum");
//            BasicDBObject doc = new BasicDBObject();
//            Document user1 = new Document();
//            user1.put("id", 1);
//            user1.put("Nombre", "Ed Sheeran");
//            user1.put("Reproducciones mensules", "100 millones");
//            col.insertOne(user1);

            Document doc = new Document();


            doc.put("idU", 2);
            doc.put("Nombre", "Misael");
            doc.put("Playlists:",5);
            col.insertOne(doc);








        } catch (MongoException e) {
            e.printStackTrace();
        } finally {
            if(mongoClient!=null)
                mongoClient.close();
        }
    }
    }
