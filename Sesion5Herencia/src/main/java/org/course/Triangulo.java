package org.course;

public class Triangulo extends Figura{

    private final String TIPO;

    public Triangulo(double base, double altura, String tipo) {
        super(base, altura);
        TIPO = tipo;
    }

    public double area() {
        return getBASE() * getALTURA() / 2;
    }

    public void mostrarDimenciones() {
        System.out.println("Base: " + getBASE() + " Altura: " + getALTURA());
    }
}
