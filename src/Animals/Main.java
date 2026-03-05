package Animals;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            // Opret mindst fire dyr af mindst tre forskellige typer
            ArrayList<Animal> animals = new ArrayList<>();
            animals.add(new Lion("Simba"));
            animals.add(new Wolf("Grey"));
            animals.add(new Rabbit("Black"));
            animals.add(new Lion("Mufasa"));

            System.out.println("~~~~~~ Konkurrencen starter ~~~~~~");
            for (Animal animal : animals) {
                System.out.println(animal);
            }
            System.out.println();

            // Kamp 1: Simba vs Grey
            System.out.println("=== Kamp 1: " + animals.get(0).getName() + " vs " + animals.get(1).getName() + " ===");
            Contest contest1 = new Contest(animals.get(0), animals.get(1));
            while (contest1.getWinner() == null){
                contest1.playRound();
            }
            System.out.println();
            System.out.println("Vinder: " + contest1.getWinner() + "\n");
        }



    }
