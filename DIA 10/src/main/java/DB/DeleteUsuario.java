package DB;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Scanner;

public class DeleteUsuario {
    private static Scanner scc = new Scanner(System.in);
    private static ConexionMongo cn = new ConexionMongo();
    private static MongoCollection<Document> dataUsuarios;

    public static void delete(){

        dataUsuarios = cn.getDb().getCollection("Usuarios");
        System.out.println("Ingrese DNI a eliminar");
        String dniAelim = scc.nextLine();
        dataUsuarios.deleteOne(new Document("DNi", dniAelim));
    }

}
