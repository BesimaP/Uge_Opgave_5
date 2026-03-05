package Animals;

    public abstract class Animal {
        String name;
        int energy;

        public Animal(String name, int energy) {
            this.name = name;
            this.energy = energy;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getEnergy() {
            return energy;
        }

        public void setEnergy(int energy) {
            this.energy = energy;
        }

        // Returnerer true hvis dyret stadig har energi
        public boolean isActive(){
            return energy > 0;
        }

        // Abstrakt metode – hver subklasse bestemmer hvor meget skade den gør
        public abstract int attack();

        // Returnerer en tekstrepræsentation af dyret
        @Override
        public String toString() {
            return name + " (energi: " + energy + ")";
        }
    }
