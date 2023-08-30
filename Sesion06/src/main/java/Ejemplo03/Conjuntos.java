package Ejemplo03;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Uno");
        conjunto.add("Dos");
        conjunto.add("Tres");
        conjunto.add("Cuatro");

        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
