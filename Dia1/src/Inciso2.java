import java.util.Scanner;

public class Inciso2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores de a, b y c de su ecuacion de segundo grado");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(rootCalculator(a,b,c));
        System.out.println(discriminanteValidator(a,b,c));


    }
    public static double rootCalculator(double a, double b, double c){
        double discriminante = Math.sqrt(b*b - 4*a*c);
        double resolvente = ((-b +- discriminante)/2*a);
        return resolvente;
    }

    public static String discriminanteValidator(double a, double b, double c ){
        double discriminante = Math.sqrt(b*b - 4*a*c);
        String mensaje = "";
        if (discriminante < 0){
            mensaje = "Ambas raices son imaginarias difernetes";
        } else if (discriminante == 0){
            mensaje = "Raices dobles";
        } else if (discriminante > 0){
            mensaje = "Ambas raices son reales diferentes";
        } return mensaje;
    }
}

