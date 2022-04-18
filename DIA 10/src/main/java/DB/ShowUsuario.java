package DB;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Scanner;

public class ShowUsuario {
    private static Scanner scc = new Scanner(System.in);
    private static ConexionMongo cn = new ConexionMongo();
    private static MongoCollection<Document> dataUsuarios;

    public static void showUsuario(){

        dataUsuarios = cn.getDb().getCollection("Usuarios");
        System.out.println("Ingrese DNI a buscar");
        String option = scc.nextLine();
        FindIterable<Document> personD = dataUsuarios.find().filter(new Document("DNi", option));
        if(personD.first() != null)
            System.out.println(personD.first().toJson());
    }

}
