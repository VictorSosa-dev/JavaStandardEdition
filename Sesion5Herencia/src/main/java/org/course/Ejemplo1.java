package org.course;

public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MienbrosEstaticos m1 = new MienbrosEstaticos();
        System.out.println("Contador de clase: " + m1.getContadorClase());
        System.out.println("Contador de instancia: " + m1.getContadorInstancia());
        MienbrosEstaticos m2 = new MienbrosEstaticos();
        System.out.println("Contador de clase: " + m2.getContadorClase());
        System.out.println("Contador de instancia: " + m2.getContadorInstancia());
    }
}