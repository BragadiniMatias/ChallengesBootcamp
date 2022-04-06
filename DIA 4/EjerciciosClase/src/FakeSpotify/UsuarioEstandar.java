package FakeSpotify;

import java.util.ArrayList;
import java.util.Random;

public class UsuarioEstandar extends Usuario{

    public UsuarioEstandar(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void elegirCancion(ArrayList<Canciones> c) {
        Random rd = new Random();
        System.out.println(c.get(rd.nextInt(c.size())));
    }
}

