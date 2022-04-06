package Hangman;

import java.util.Scanner;
import java.util.Random;

public class HangmanGame {

    static Scanner input;
    public static void hangman()
    {
        input = new Scanner(System.in);

        System.out.println("Nombre jugador 1: ");
        String nombre1 = input.nextLine();

        System.out.println("Nombre jugador 2: ");
        String nombre2 = input.nextLine();

        System.out.println("Palabra a adivinar: ");
        String word = input.nextLine();

        System.out.println("Pista: ");
        String pista = input.nextLine();

        word = word.toUpperCase();


        String word1 = word.replaceAll("[A-Z]", "_ ");

        System.out.println("let's play the game");
        startGame(word, word1);
    }
    public static void startGame(String word, String word1)
    {
        int guess_ = 0;
        int wrong = 0;
        String guess;
        char letter;
        boolean guessescontainsguess;
        String guesses = "";
        boolean guessinword;
        while (wrong < 6 && word1.contains("_")) {
            System.out.println(word1 + "\n");
            int temp = 5 - wrong;
            if (wrong != 0) {
                System.out.println("Tenes  " + temp + " intentos restantes.");
            }

            System.out.print("Jugador 2 adivina: ");
            guess = input.nextLine();
            guess = guess.toUpperCase();
            letter = guess.charAt(0);
            guessescontainsguess = (guesses.indexOf(letter)) != -1;
            guesses += letter;
            letter = Character.toUpperCase(letter);
            System.out.println();


            if (guessescontainsguess == true) {
                System.out.println("La letra " + letter + "ya fue adivinada . \n");
            }

            guessinword = (word.indexOf(letter)) != -1;
            if (guessinword == true) {
                System.out.println(
                        letter + " esta presente en la palabra a adivinar!.");
                System.out.print("\n");
                for (int position = 0;
                     position < word.length(); position++) {
                    if (word.charAt(position) == letter && word1.charAt(position) != letter) {
                        word1 = word1.replaceAll("_ ", "_");
                        String word2;
                        word2 = word1.substring(0, position) + letter + word1.substring(position + 1);
                        word2 = word2.replaceAll("_", "_ ");
                        word1 = word2;
                    }
                }
            }
            else {
                System.out.println(letter + " no esta presente en la palabra!.");
                wrong++;
            }
            guess_++;
        }
        if (wrong == 5) {
            System.out.println("Perdiste! Llegaste a los seis intentos, el jugador 1 gana!.");
        }
        else {System.out.print("La palabra es : " + word1 + "\n Adivinaste1");
        }
    }
    public static void main(String[] args)
    {
        hangman();
    }
}