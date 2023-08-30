package org.course;

import java.io.Console;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu cadena: ");
        String cadena = scanner.nextLine();
        StringBuilder sb = new StringBuilder(cadena);
        //Numero de vocales
        int numVocales = 0;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numVocales++;
            }
        }
        System.out.println("La palabre " + cadena + " tiene " + numVocales + " vocales");


    }
}
