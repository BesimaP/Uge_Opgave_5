package Animals;

    public class Rabbit extends Animal{

        public Rabbit(String name){
            super(name, 120);
        }

        // Returnerer altid 4 i skade
        @Override
        public int attack() {
            return 4;
        }
    }
