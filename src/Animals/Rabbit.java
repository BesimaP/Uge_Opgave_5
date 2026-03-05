package Animals;

    public class Rabbit extends Animal{

        public Rabbit(String name){
            super(name, 150);
        }

        // Returnerer altid 4 i skade
        @Override
        public int attack() {
            return 4;
        }
    }
