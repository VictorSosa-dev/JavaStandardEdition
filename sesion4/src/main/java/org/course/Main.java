package org.course;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(2);
        Rectangulo rectangulo3 = new Rectangulo(3, 2);

        System.out.println("Area del rectangulo 1: " + rectangulo1.calcularArea());
        System.out.println("Area del rectangulo 2: " + rectangulo2.calcularArea());
        System.out.println("Area del rectangulo 3: " + rectangulo3.calcularArea());

    }
}