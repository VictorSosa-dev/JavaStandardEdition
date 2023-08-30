package Reto01;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Map<String, Queue<Telefono>> agenda = new TreeMap<>();

        agenda.put("Juan", new PriorityQueue<>());
        agenda.put("Pedro", new PriorityQueue<>());
        agenda.put("Ana", new PriorityQueue<>());

        Collections.addAll(agenda.get("Juan"),
            new Telefono("123456789", 1),
            new Telefono("987654321", 2),
            new Telefono("123123123", 3)
        );

        Collections.addAll(agenda.get("Pedro"),
            new Telefono("123456789", 1),
            new Telefono("987654321", 2),
            new Telefono("123123123", 3)
        );

        Collections.addAll(agenda.get("Ana"),
            new Telefono("123456789", 1),
            new Telefono("987654321", 2),
            new Telefono("123123123", 3)
        );

        for (Map.Entry<String, Queue<Telefono>> entry : agenda.entrySet()) {
            System.out.println(entry.getKey());
            for (Telefono telefono : entry.getValue()) {
                System.out.println(telefono.getNumero());
            }
        }
    }


}
