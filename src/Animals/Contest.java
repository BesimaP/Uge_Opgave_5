package Animals;
// Contest styrer en kamp mellem to dyr
// Den holder styr på hvem der kæmper og hvor mange runder der er spillet

    public class Contest {
        private Animal  animal1;
        private Animal animal2;
        int roundCount;

        // Jeg vælger at tage to Animal-objekter ind i stedet for fx Lion og Wolf
        // fordi Contest så kan bruges til alle typer dyr – ikke kun én bestemt kombination
        public Contest(Animal animal1, Animal animal2){
            this.animal1 = animal1;
            this.animal2 = animal2;
            this.roundCount = 0;
        }

        // Spiller én runde hvor begge dyr angriber hinanden
        public void playRound() {
            roundCount++;
            System.out.println("~~~~~~~ Round " + roundCount + " ~~~~~~");

            // Jeg gemmer skaden i en variabel (damage1) fordi jeg skal bruge
            // tallet to gange – først til at trække fra energien, og så til at printe det
            int damage1 = animal1.attack();

            // Jeg bruger getEnergy() til at hente den nuværende energi, trækker damage1 fra,
            // og sætter det nye tal med setEnergy() – alt på én linje fordi jeg ikke
            // behøver gemme resultatet, da getEnergy() automatisk returnerer den opdaterede værdi bagefter
            animal2.setEnergy(animal2.getEnergy() - damage1);
            System.out.println(animal1.getName() + " angriber " + animal2.getName() + " for " + damage1 + "! (" + animal2.getName() + " har " + animal2.getEnergy() + " energi tilbage)");

            // Jeg tjekker om dyr 2 stadig er aktivt inden det angriber tilbage
            // Det ville være unfair hvis et dyr der allerede har tabt stadig kan angribe
            if(animal2.isActive()){
                int damage2 = animal2.attack();
                animal1.setEnergy(animal1.getEnergy() - damage2);
                System.out.println(animal2.getName() + " angriber " + animal1.getName() + " for " + damage2 + "! (" + animal1.getName() + " har " + animal1.getEnergy() + " energi tilbage)");
            }
        }

        // Jeg vælger at tjekke om begge lever først – så ved jeg der ikke er en vinder endnu
        // Derefter tjekker jeg kun dyr 1, for hvis dyr 1 ikke er aktiv må dyr 2 have vundet
        // Ellers må dyr 1 have vundet – det håndterer else-blokken
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
