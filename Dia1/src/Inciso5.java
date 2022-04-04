import java.util.Scanner;

public class Inciso5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero por teclado");
        String value = sc.nextLine();

        if (value.equals(palindromeChecker(value))){
            System.out.println("El valor ingresado es capicua");
        } else
            System.out.println("El valor ingresado no es capicua");

    }
    public static String palindromeChecker(String num){
        int longitud = num.length();
        String reversa = "";
        for (int i = longitud -1; i>=0; i--){
            reversa = reversa + num.charAt(i);
        } return reversa;


    }
}
