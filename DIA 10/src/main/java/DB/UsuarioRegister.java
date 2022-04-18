package DB;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Scanner;

public class UsuarioRegister {
    private static Scanner scc = new Scanner(System.in);
    private static ConexionMongo cn = new ConexionMongo();
    private static MongoCollection<Document> dataUsuarios;

    public static void register(){
        dataUsuarios = cn.getDb().getCollection("Usuarios");
        System.out.println("Ingrese un nombre");
        String name = scc.nextLine();

        System.out.println("Ingrese un apellido");
        String apellido = scc.nextLine();
        System.out.println("Ingrese un DNI");
        String dni = scc.nextLine();
        System.out.println("Ingrese una direccion");
        String direc = scc.nextLine();

        Document reg1 = new Document("Nombre", name).append("Apellido",apellido)
                .append("DNi", dni).append("Direccion", direc);
        dataUsuarios.insertOne(reg1);

    }


}
