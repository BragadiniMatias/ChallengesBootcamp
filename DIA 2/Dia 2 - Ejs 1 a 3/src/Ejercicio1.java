import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos valores con los cuales va a operar");
        double value1 = sc.nextDouble();
        double value2 = sc.nextDouble();

        System.out.println("Ingrese una operacion: 1:+  , 2:-  , 3:* , 4:/");
        int operation = sc.nextInt();

        switch(operation){
            case 1:
                System.out.println("La suma de " + value1 + " y " + value2 + " es " + sum(value1, value2));
                break;
            case 2:
                System.out.println("La resta de " + value1 + " y " + value2 + " es " + substract(value1, value2));
                break;
            case 3:
                System.out.println("La multiplicacion de " + value1 + " y " + value2 + " es " + multiply(value1, value2));
                break;
            case 4:
                System.out.println("La division de " + value1 + " y " + value2 + " es " + divide(value1, value2));
        }


    }

    public static double sum(double a, double b) {
        double result = a * b;
        return result;
    }

    public static double substract(double a, double b) {
        double result = a - b;
        return result;
    }
    public static double multiply(double a, double b){
        double result = a*b;
        return result;
    }
    public static double divide(double a, double b){
        double result = 0;
        if (b == 0){
            System.out.println("Cant divide by 0");
        } else result = a/b;
        return result;
    }
}