package main.java.poo.atividade06.q4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapaFiltro {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Maçã", "Banana", "Acerola", "Formiga", "Gato", "Arara");

        List<String> resultado = palavras.stream()
                .map(String::toUpperCase)
                .filter(p -> p.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(resultado);
    }
}
