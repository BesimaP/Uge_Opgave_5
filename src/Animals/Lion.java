package Animals;
// Løve – jeg vælger at løven angriber for et fast højt beløb
// fordi løven skal være den stærke og forudsigelige fighter

    public class Lion extends Animal{

        // Jeg kalder super() med 80 energi – løven starter med middel energi
        public Lion(String name){
            super(name,80);
        }

        // Returnerer altid 25 i skade
        @Override
        public int attack() {
            return 25;
        }
    }
