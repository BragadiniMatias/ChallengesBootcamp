import java.util.Scanner;

public class Inciso3 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 notas: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        double avg = average(nota1, nota2, nota3);
        System.out.println(avg);
        System.out.println(averageChecker(avg));



    }
    public static double average(double nota1, double nota2, double nota3){
        double avg = (nota1 + nota2 + nota3)/3;
        return avg;
    }
    public static String averageChecker(double avg){
        String mensaje = "";
        if (avg<=10){
            mensaje = "Reprobado";
        } else if (avg>10 && avg <15){
            mensaje = "Aprobado";
        } else if (avg>=15){
            mensaje = "Eximido";
        } return mensaje;
    }

}
