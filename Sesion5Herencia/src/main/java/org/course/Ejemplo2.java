package org.course;

public class Ejemplo2 {

    public static void main(String[] args) {
        Triangulo t = new Triangulo(10, 5, "Isosceles");
        System.out.println("Area del triangulo: " + t.area());
        t.mostrarDimenciones();
        Rectangulo r = new Rectangulo(10, 5);
        System.out.println("Area del rectangulo: " + r.area());

    }
}
