import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner d1 = new Scanner(System.in);
        boolean exit = false;
        ArrayList<ClienteEstandar> clientesStd = new ArrayList<>();
        ArrayList<ClientePremium> clientePremiums = new ArrayList<>();

        ClienteEstandar cliente = new ClienteEstandar("Matias", "Bragadini", "40454980", 10000, false);
        ClientePremium cliente2 = new ClientePremium("Claudio", "Hernandez", "1", 20000, 15);



        cliente.pagar(5000);
        System.out.println(cliente.getMontoDeuda());


        cliente2.pagar(10000);
        System.out.println(cliente2.getMontoDeuda());

    }
}


//        while (!exit){
//            System.out.println("1 - Ingresar un cliente estandar");
//            System.out.println("2 = Ingrese un cliente premium");
//            System.out.println("3 - Consultar deuda de un cliente");
//            System.out.println("4 = Ingresar un pago de un clientes");
//            System.out.println("5 = Asignar turno a un cliente estandar");
//            System.out.println("6 = Salir");
//
//            int opt = sc.nextInt();
//
//            switch(opt) {
//                case 1:
//                    System.out.println("Ingrese el nombre");
//                    String nombre = d1.nextLine();
//                    System.out.println("Ingrese el apellido");
//                    String apellido = d1.nextLine();
//                    System.out.println("Ingrese DNI");
//                    String dni = d1.nextLine();
//                    System.out.println("Ingrese la deuda: al ser un cliente nuevo es recomendable setearlo en 0");
//                    double monto = d1.nextDouble();
//                    break;
//                case 3:
//                    System.out.println("Ingrese el DNI del cliente a consultar");
//                    String dniAConsultar = sc.nextLine();
//                    sc.nextLine();
//                    System.out.println("El cliente es premium o no? S/N");
//                    String esPremium = sc.nextLine();
//                    if(esPremium.equals("S")) {
//                        for (ClientePremium c : clientePremiums) {
//                            if (c.getDni().equals(dniAConsultar)) {
//                                System.out.println(c.getMontoDeuda());
//                            } else {
//                                System.out.println("DNI no encontrado");
//                            }
//                        }
//                    }
//                    break;
//                case 4:
//                    System.out.println("El cliente es premium o no? S/N");
//                    String esPremium1 = d1.nextLine();
//                    System.out.println("Ingrese el DNI del cliente a cargar el pago");
//                    String dniAConsultar1 = d1.nextLine();
//                    System.out.println("Ingrese el monto a pagar");
//                    double montoAPagar = d1.nextDouble();
//                    if(esPremium1.equals("S")) {
//                        for (ClientePremium c : clientePremiums) {
//                            if (dniAConsultar1.equals(c.getDni())) {
//                                c.pagar(montoAPagar);
//                            } else {
//                                for (ClienteEstandar d : clientesStd) {
//                                    if (dniAConsultar1.equals(c.getDni())) {
//                                        c.pagar(montoAPagar);
//                                    }
//                                }
//                            }
//                        }
//                    }
//                    break;
//                case 5:
//                        System.out.println("Ingrese el DNI del cliente a consultar");
//                        String dniAConsultar2 = d1.nextLine();
//                        for (ClienteEstandar d : clientesStd) {
//                            if (dniAConsultar2.equals(d.getDni())) {
//                                d.sacarTurno();
//                            }
//                        }
//                        break;
//                case 6:
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("No es una opcion ingresada valida");
//
//            }
//        }
//
//    }
