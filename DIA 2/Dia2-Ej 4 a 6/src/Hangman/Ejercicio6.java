package Hangman;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] jugador1 = new int[4];
        int[] jugador2 = new int[4];
        int[] jugador3 = new int[4];
        int[] arbitro = new int[2];


        int jug1Puntos = 0;
        int jug2Puntos = 0;

        System.out.println("Turno del jugador 1 de ingresar numeros: ");

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero: ");
            int temp = sc.nextInt();
            if(temp > 10 || temp < 0) {
                System.out.println("El numero no esta en el rango indicado de 1 a 10. ");
            }
            else {jugador1[i] = temp;}

            }

        System.out.println("Turno del jugador 2 de ingresar sus numeros: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero: ");
            int temp = sc.nextInt();
            if(temp > 10 || temp < 0) {
                System.out.println("El numero no esta en el rango indicado de 1 a 10. ");
            }
            else {jugador2[i] = temp;}
        }


        System.out.println("Turno del jugador 3 de ingresar sus numeros: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero: ");
            int temp = sc.nextInt();
            if(temp >= 10 || temp < 0) {
                System.out.println("El numero no esta en el rango indicado de 1 a 10. ");
            }
            else {jugador3[i] = temp;}

        }

        System.out.println("Turno del arbitro de ingresar numeros");
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese un numero: ");
            int temp = sc.nextInt();
            if(temp >= 10 || temp < 0) {
                System.out.println("El numero no esta en el rango indicado de 1 a 10. ");
            }
            else {arbitro[i] = temp;}
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (jugador1[j] == arbitro[i]) {
                    jug1Puntos++;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (jugador2[j] == arbitro[i]) {
                    jug2Puntos++;
                }
            }
        }
        if(jug1Puntos > jug2Puntos){
            System.out.println("El jugador 1 es el ganador con : " + jug1Puntos + " puntos.");
        }else if(jug2Puntos > jug1Puntos){
            System.out.println("El jugador 2 es el ganador con : " + jug2Puntos + " puntos.");
        }else{
            System.out.println("Jugador 1 y 2 tienen la misma cantidad de puntos");
        }

    }

    }


