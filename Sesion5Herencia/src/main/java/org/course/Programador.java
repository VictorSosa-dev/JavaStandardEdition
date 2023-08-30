package org.course;

public class Programador extends Empleado{

    private String lenguaje;

    public Programador(String nombre, byte edad, float salario, String lenguaje) {
        super(nombre, edad, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return super.toString() + "Programador{" +
                "lenguaje='" + lenguaje + '\'' +
                '}';
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}
