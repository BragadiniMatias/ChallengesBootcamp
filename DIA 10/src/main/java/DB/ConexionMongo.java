package DB;

import com.mongodb.*;

import com.mongodb.client.*;
import com.mongodb.client.MongoClient;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class ConexionMongo {
    private MongoClient mongoClient;
    private List<Document> database;

    public ConexionMongo(){
        mongoClient = MongoClients.create();
        database = mongoClient.listDatabases().into(new ArrayList<Document>());

    }

    public MongoDatabase getDb(){
        return mongoClient.getDatabase("Ejercicio10");
    }

}
