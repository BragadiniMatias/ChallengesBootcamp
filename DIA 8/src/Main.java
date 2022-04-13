import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UpdateClient up = new UpdateClient();
        DeleteClient del = new DeleteClient();
        InsertClient ins = new InsertClient();
        SelectClient sel = new SelectClient();



        Conection conection = new Conection();
        Cliente mati = new Cliente("Matias", "Bragadini", "40454980", "Tejedor 410", "17 de mayo de 1997");
        Cliente carlos = new Cliente("Carlos", "Ramon", "124151", "Colon 1540", "1 de noviembre de 2000");

        //ins.insert(mati);
        //del.delete(mati);









    }
}
