import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el numero: " + i);
            double temp = sc.nextDouble();
            arr[i] = temp;
        }
        //Como voy a usar funciones que hacen sort y por lo tanto modifican el orden del ingreso de datos de mi array
        //decido crear un nuevo array que es el mismo array q el principal, y a los metodos que usan sort les paso por
        //argumento el array duplicado para que el original me quede en el mismo orden
        double [] sorted = arr;
        System.out.println("Valor mas alto: " + findHighest(sorted));
        System.out.println("El valor mas bajo: " + findLowest(sorted));
        System.out.println("los numeros pares son: "); findPairs(arr);
        System.out.println("Los impares son: "); findoddnumbers(arr);
        System.out.println("Ordeno de manera ascendente"); ascSort(arr); showArray(arr);
        System.out.println("Ordeno de manera descendente"); reversa(arr); showArray(arr);


    }

    public static double findHighest(double[] arreglo) {
        Arrays.sort(arreglo);
        double highest = arreglo[arreglo.length-1];
        return highest;
    }
    public static double findLowest(double[] arreglo) {
        Arrays.sort(arreglo);
        double lowest = arreglo[0];
        return lowest;
    }
    public static void findPairs(double[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            if(arreglo[i]%2==0){
                System.out.println(arreglo[i]);
            }
        }
    }
    public static void findoddnumbers(double[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            if(!(arreglo[i]%2==0)){
                System.out.println(arreglo[i]);
            }
        }
    }
    public static void ascSort(double[] arreglo){
        Arrays.sort(arreglo);
    }

    public static void reversa(double[] arreglo){
        int longitud = arreglo.length;
        //intercambio la mitad de los primeros elementos con la segunda mitad
        for (int i=0; i<longitud/2; i++){
            //Guardo temporalmente la primera mitad
            double temporalVariable = arreglo[i];
            //Asigno la primera mitad a la ultima mitad
            arreglo[i] = arreglo[longitud - i -1];

            //Asigno la ultima mitad a la primera mitad
            arreglo[longitud-i-1] = temporalVariable;

        }

    }
    public static void showArray(double[]arreglo){
        for (int i=0; i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }



}
