package org.course;

public class DBA extends Empleado{

    private String herramienta;

    public DBA(String nombre, byte edad, float salario, String herramienta) {
        super(nombre, edad, salario);
        this.herramienta = herramienta;
    }

    @Override
    public String toString() {
        return "DBA{" +
                "herramienta='" + herramienta + '\'' +
                '}';
    }
}
