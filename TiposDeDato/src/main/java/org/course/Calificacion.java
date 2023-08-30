package org.course;

import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        // Pedir calificación
        //  scanf("%d", &calificacion);
        // ler por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu calificación:");
        int calificacion = scanner.nextInt();
        if (calificacion == 10) {
            System.out.println("Felicidades, tu calificación es excelente");
        } else if (calificacion >= 8) {
            System.out.println("Felicidades, tu calificación es buena");
        } else if (calificacion >= 7) {
            System.out.println("Felicidades, tu calificación es suficiente");
        } else if (calificacion >= 6) {
            System.out.println("Felicidades, tu calificación es suficiente");
        } else {
            System.out.println("Tu calificación es insuficiente");
        }
    }
}
