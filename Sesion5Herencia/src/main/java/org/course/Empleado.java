package org.course;

public class Empleado extends Persona{

    private float salario;

    public Empleado(String nombre, byte edad, float salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
