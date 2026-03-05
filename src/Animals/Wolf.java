package Animals;
// Ulv – angriber for et tilfældigt beløb

import java.util.Random;

public class Wolf extends Animal{


        // Jeg kalder super() med 70 energi – ulven starter med lidt mindre energi end løven
        public Wolf(String name){
            super(name,70);
        }

        // nextInt(5, 21) returnerer direkte et tilfældigt tal mellem 5 og 20
        @Override
        public int attack() {
            Random random = new Random();
            return random.nextInt(5, 21);
        }
    }
