package org.course;

public class Rectangulo {

    private double alto;
    private double ancho;

    Rectangulo (double lado) {
        this(lado, lado);
    }
    Rectangulo () {
        this(0);
    }

    Rectangulo (double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double calcularArea () {
        return this.alto * this.ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
