import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 14");
        int valueToCheck = sc.nextInt();
        System.out.println(primeChecker(valueToCheck));
        System.out.println(switchPrimeChecker(valueToCheck));



    }

    public static String primeChecker(int num){
        if(num ==1 || num ==2||num ==3 || num ==5 ||num ==7 || num ==11 ||num ==13){
            return "Es primo";
        } else{
            return "No es primo";
        }
    }
    public static String switchPrimeChecker(int num){
        switch(num){
            case 1,2,3,5,7,11,13: return "Es primo";
            default: return "No es primo";


        }
    }

}
