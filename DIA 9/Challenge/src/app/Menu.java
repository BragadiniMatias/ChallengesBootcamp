package app;

import DB.DBControllerClient;
import Models.Cliente;
import Models.Vendedor;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu(){
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        DBControllerClient dbc = new DBControllerClient();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        while(!flag){
            System.out.println("1 - Ingrese 10 productos.");
            System.out.println("2 - Ingrese 5 vendedores y " +
                    "5 clientes.");
            System.out.println("3 - Ingrese 3 ventas por cada cliente" +
                    "registrado y que sus ventas tengan como minimo" +
                    "dos productos de compras.");
            System.out.println("4 - Ingrese id del Cliente a eliminar");
            System.out.println("5 - Mostrar informacion de clientes");
            System.out.println("6 = Mostrar informacion de productos");
            System.out.println("7 - Mostrar informacion de Vendedores");
            System.out.println("10 - Salir del sistema.");
            int opt = sc.nextInt();

            switch(opt){
                case 1:

                    break;
                case 2:
                        System.out.println("Ingrese el nombre del cliente");
                        String nombre = scc.nextLine();

                        System.out.println("Ingrese el apellido del empleado");
                        String apellido = scc.nextLine();

                        System.out.println("Ingrese el DNI del  empleado");
                        String dni = scc.nextLine();

                        System.out.println("Ingrese la direccion del  empleado");
                        String direccion = scc.nextLine();

                        System.out.println("Ingrese anio de nacimiento");
                        int anio = scc.nextInt();
                        System.out.println("Ingrese el mes de nacimiento");
                        int mes = scc.nextInt();
                        System.out.println("Ingrese el dia de nacimiento");
                        int dia = scc.nextInt();

                        Cliente client = new Cliente(nombre,apellido, dni, direccion
                                ,Date.valueOf(LocalDate.of(anio, mes, dia)));

                        clientes.add(client);
                        dbc.insert(client);















                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Ingrese idCliente a eliminar");
                    int idelim = sc.nextInt();
                    for(Cliente c: clientes){
                        if(c.getId() == idelim){
                            dbc.delete(c);
                        } else System.out.println("Id no encontrado");
                    }
                    break;
                case 5:
                    dbc.select();



                case 10:
                    flag = true;
                    break;

            }



        }



    }



}
