package Ejemplo03;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");


        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
