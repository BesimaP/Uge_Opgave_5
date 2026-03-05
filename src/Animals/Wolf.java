package Animals;

    public class Wolf extends Animal{

        public Wolf(String name){
            super(name,70);
        }

        @Override
        public int attack() {
            return 0;
        }
    }
