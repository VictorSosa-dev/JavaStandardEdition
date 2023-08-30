package reto01;

import java.io.File;

public class Reto01 {
    public static void main(String[] args) {

        //Arbol de directorios
        File directorioInicial = new File("/Users/victorsosa/Documents/dev/Java/Sesion08/src/main/resources/temp");
        muestraContenidoDirectorio(directorioInicial);


    }

    public static void mostrarEspacios(String directorio, char simbolo) {
        System.out.print("["+ simbolo +"] ");

        for (int i = 0; i < directorio.length(); i++) {
            System.out.print("-");
        }
    }

    private static void muestraContenidoDirectorio(File directorio) {

        mostrarEspacios(directorio.getName(), 'D');
        System.out.println(directorio.getName());

        File[] subdirectorios = directorio.listFiles();
        for (File archivo : subdirectorios) {
            if (archivo.isFile()) {
                mostrarEspacios(archivo.getParent(), 'A');
                System.out.println(archivo.getName());
            } else if (archivo.isDirectory()) {
                muestraContenidoDirectorio(archivo);
            }
        }

    }
}
