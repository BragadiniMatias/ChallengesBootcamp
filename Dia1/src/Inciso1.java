import java.util.Scanner;

public class Inciso1 {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilos. Ejemplo: 89,5kg");
        weight = sc.nextDouble();
        System.out.println("Ingrese su altura en metros. Ejemplo: 1,78mts");
        height = sc.nextDouble();

        System.out.println(bmiCalculator(weight, height));
        System.out.println(bmiValidator(bmiCalculator(weight, height)));

    }

    public static double bmiCalculator(double weight, double height) {
        return (weight / (height * height));
    }

    public static String bmiValidator(double bmi) {
        String mensaje = "";
        if (bmi < 20) {
            mensaje =  "Mal estado";
        } else if (bmi <= 20 || bmi > 22) {
            mensaje = "Bajo de peso";
        } else if (bmi <= 22 || bmi > 25) {
            mensaje = "Peso normal";
        } else if (bmi <= 25 || bmi >= 30) {
            mensaje = "Sobre peso";
        } else if (bmi <= 30 || bmi > 40) {
            mensaje = "Sobrepeso cronico";
        } else if (bmi > 40) {
            mensaje = "Hospitalizado";
        }
        return mensaje;
    }
}

