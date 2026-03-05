package Animals;

    public class Contest {
        private Animal  animal1;
        private Animal animal2;
        int roundCount;

        public Contest(Animal animal1, Animal animal2){
            this.animal1 = animal1;
            this.animal2 = animal2;
            this.roundCount = 0;
        }

        // Spiller én runde hvor begge dyr angriber hinanden
        public void playRound() {
            roundCount++;
            System.out.println("~~~~~~~ First round ~~~~~~");

            int damage1 = animal1.attack();
            animal2.setEnergy(animal2.getEnergy() - damage1);
            System.out.println(animal1.getName() + " angriber " + animal2.getName() + " for " + damage1 + "! (" + animal2.getName() + " har " + animal2.getEnergy() + " energi tilbage)");

            if(animal2.isActive()){
                int damage2 = animal2.attack();
                animal1.setEnergy(animal1.getEnergy() - damage2);
                System.out.println(animal2.getName() + " angriber " + animal1.getName() + " for " + damage2 + "! (" + animal1.getName() + " har " + animal1.getEnergy() + " energi tilbage)");
            }
        }

        //Returnerer vinderen, eller null hvis begge stadig er aktive
        public Animal getWinner() {
            if(animal1.isActive()&& animal2.isActive()){
                return null;
            }else if(!animal1.isActive()){
                return animal2;
            }else{
                return animal1;
            }
        }
    }
