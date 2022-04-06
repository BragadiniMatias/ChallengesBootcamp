package FakeSpotify;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Canciones inth1 = new Canciones("Linkin Park", "In the end");
        Canciones hell = new Canciones("Hello", "Adele");
        ArrayList<Canciones> can = new ArrayList<>();
        can.add(inth1);
        can.add(hell);

        UsuarioEstandar u1 = new UsuarioEstandar("Matias", "Bragadini");
        u1.elegirCancion(can);

    }
}
