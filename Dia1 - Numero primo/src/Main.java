import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 14");
        int valueToCheck = sc.nextInt();
        System.out.println(primeChecker(valueToCheck));
        System.out.println(switchPrimeChecker(valueToCheck));



    }
    //Como no sabia si la idea era usar un ciclo for o no, lo deje bastante hard=codeado para que sea exclusivamente
    //con IF y SWITCH. Usando ciclos for o whjile se puede limpiar  muchisimo mas y se que esta forma no es la optima pero
    //lo dejo asi para seguir al pie de la letra la consigna. .
    public static String primeChecker(int num){
        if(num ==1 || num ==2||num ==3 || num ==5 ||num ==7 || num ==11 ||num ==13){
            return "Es primo";
        } else{
            return "No es primo";
        }
    }
    public static String switchPrimeChecker(int num){
        switch(num){
            case 1: return "Es primo";
            case 2: return "Es primo";
            case 3: return "Es primo";
            case 5: return "Es primo";
            case 7: return "Es primo";
            case 11: return "Es primo";
            case 13: return "Es primo";
            default: return "No es primo";


        }
    }

}
