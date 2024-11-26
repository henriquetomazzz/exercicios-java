package main.java.poo.atividade06.q11;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] posicoes = {"Goleiro", "Defensor", "Meio-Campista", "Atacante"};
        String[] times = {"Flamengo", "São Paulo", "Palmeiras", "Santos", "Corinthians",
                "Grêmio", "Internacional", "Fluminense", "Atlético Mineiro", "Cruzeiro"};
        String[] nomes = {
                "Neymar", "Gabriel Barbosa", "Alisson", "Marquinhos", "Casemiro",
                "Roberto Firmino", "Thiago Silva", "Richarlison", "Lucas Paquetá", "Éder Militão",
                "Vinícius Júnior", "Fabinho", "Douglas Luiz", "Everton Ribeiro", "Ederson",
                "Gabriel Jesus", "Danilo", "Rodrygo", "Fred", "Reinier"
        };

        Random random = new Random();

        List<Jogador> jogadores = random.ints(20, 0, nomes.length)
                .mapToObj(i -> new Jogador(
                        nomes[random.nextInt(nomes.length)],
                        posicoes[random.nextInt(posicoes.length)],
                        18 + random.nextInt(39),
                        times[random.nextInt(times.length)],
                        random.nextInt(100)
                ))
                .collect(Collectors.toList());

        System.out.println("Todos os jogadores:");

        jogadores.forEach(System.out::println);

        String timeFiltro = "Flamengo";
        System.out.println("\nJogadores do time " + timeFiltro + ":");
        jogadores.stream()
                .filter(j -> j.getTime().equals(timeFiltro))
                .forEach(System.out::println);

        int golsFiltro = 10;
        System.out.println("\nJogadores do time " + timeFiltro + " com mais de " + golsFiltro + " gols:");
        jogadores.stream()
                .filter(j -> j.getTime().equals(timeFiltro) && j.getGolsMarcados() > golsFiltro)
                .forEach(System.out::println);

        System.out.println("\nJogadores agrupados por time:");
        jogadores.stream()
                .collect(Collectors.groupingBy(Jogador::getTime))
                .forEach((time, jogadoresDoTime) -> {
                    System.out.println(time + ": " + jogadoresDoTime);
                });

        double mediaIdade = jogadores.stream()
                .mapToInt(Jogador::getIdade)
                .average()
                .orElse(0);
        System.out.println("\nMédia de idade dos jogadores: " + mediaIdade);

        double mediaIdadeTime = jogadores.stream()
                .filter(j -> j.getTime().equals(timeFiltro))
                .mapToInt(Jogador::getIdade)
                .average()
                .orElse(0);
        System.out.println("\nMédia de idade dos jogadores do time " + timeFiltro + ": " + mediaIdadeTime);

        System.out.println("\nJogador mais velho:");
        jogadores.stream()
                .max(Comparator.comparingInt(Jogador::getIdade))
                .ifPresent(System.out::println);

        System.out.println("\nJogador mais novo:");
        jogadores.stream()
                .min(Comparator.comparingInt(Jogador::getIdade))
                .ifPresent(System.out::println);

        System.out.println("\nJogador artilheiro:");
        jogadores.stream()
                .max(Comparator.comparingInt(Jogador::getGolsMarcados))
                .ifPresent(System.out::println);

        int totalGolsTime = jogadores.stream()
                .filter(j -> j.getTime().equals(timeFiltro))
                .mapToInt(Jogador::getGolsMarcados)
                .sum();
        System.out.println("\nTotal de gols do time " + timeFiltro + ": " + totalGolsTime);

        System.out.println("\nJogadores ordenados por número de gols:");
        jogadores.stream()
                .sorted(Comparator.comparingInt(Jogador::getGolsMarcados).reversed())
                .forEach(System.out::println);
    }
}
