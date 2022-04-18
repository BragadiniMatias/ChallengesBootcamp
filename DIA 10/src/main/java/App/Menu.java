package App;

import DB.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import java.util.Scanner;

public class Menu {

    public static void startMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Registrar Datos.");
        System.out.println("2 - Consultar Datos.");
        System.out.println("3 - Eliminar Datos.");
        System.out.println("4 - Listado general");

        int opt = sc.nextInt();

        switch(opt){
            case 1:
                UsuarioRegister.register();
                    break;
            case 2:
                ShowUsuario.showUsuario();
                    break;
            case 3:
                DeleteUsuario.delete();
                break;
            case 4:
                ShowList.show();
                break;
            default:
                System.out.println("Opcion no encontrada");
                break;
        }


    }
}
