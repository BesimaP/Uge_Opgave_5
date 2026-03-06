package Animals;
// Jeg laver Animal som en abstrakt superklasse fordi alle dyr deler navn og energi
// Ved at samle det her slipper jeg for at skrive de samme felter i Lion, Wolf og Rabbit

    public abstract class Animal {
        protected String name;
        protected int energy;

        // Jeg tager både navn og energi ind i konstruktøren fordi hver subklasse
        // skal kunne bestemme sin egen startenergi via super()
        public Animal(String name, int energy) {
            this.name = name;
            this.energy = energy;
        }

        // Jeg laver getEnergy() og setEnergy() fordi Contest skal kunne
        // læse energien og opdatere den når et dyr bliver angrebet
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
        // Jeg gør attack() abstrakt fordi alle dyr angriber forskelligt
        // Det tvinger subklasserne til at implementere deres egen version
        public abstract int attack();

        // Returnerer en tekstrepræsentation af dyret
        // Jeg laver toString() i Animal så alle subklasser arver den automatisk
        // Det sparer mig for at skrive den samme metode i Lion, Wolf og Rabbit
        @Override
        public String toString() {
            return name + " (energi: " + energy + ")";
        }
    }
