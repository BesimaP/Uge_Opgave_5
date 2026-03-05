package Animals;

    public class Lion extends Animal{

        public Lion(String name){
            super(name,80);
        }

        // Returnerer altid 25 i skade
        @Override
        public int attack() {
            return 25;
        }
    }
