package org.course;

public class Letras {

    public static void main(String[] args) {
        Lector lector = new Lector();

        lector.muestraMensaje("Escribe una cadena");
        String cadena = lector.leeCadena();
        cadena = cadena.toLowerCase();

        Contador contador = new Contador();

        int numVocales = contador.cuentaVocales(cadena);
        int numNumeros = contador.cuentaNumeros(cadena);
        int numConsonantes = contador.cuentaConsonantes(cadena);
        int numSimbolos = contador.cuentaSimbolos(cadena);

        lector.muestraMensaje("La palabra " + cadena + " tiene: " + numVocales + " vocales");
        lector.muestraMensaje("La palabra " + cadena + " tiene: " + numNumeros + " numeros");
        lector.muestraMensaje("La palabra " + cadena + " tiene: " + numConsonantes + " consonantes");
        lector.muestraMensaje("La palabra " + cadena + " tiene: " + numSimbolos + " simbolos");

    }
}
