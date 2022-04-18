package DB;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import java.util.Scanner;

public class ShowList {
    private static Scanner sc = new Scanner(System.in);
    private static Scanner scc = new Scanner(System.in);
    private static ConexionMongo cn = new ConexionMongo();


    public static void show(){

        MongoCollection<Document> dataUsuarios;
        dataUsuarios = cn.getDb().getCollection("Usuarios");
        MongoCursor<Document> result = dataUsuarios.find().iterator();
        while(result.hasNext())
        {
            System.out.println(result.next().toJson());
        }
    }
}
