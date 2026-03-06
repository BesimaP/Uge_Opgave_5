package Building;

import java.util.ArrayList;

    public class Room {
        private String name;
        private ArrayList<Lamp> lamps;
        private ArrayList<Window> windows;

        // Konstruktør – opretter et rum med et navn og tomme lister
        public Room(String name){
            this.name = name;
            this.lamps = new ArrayList<>();
            this.windows = new ArrayList<>();
        }

        //
        public String getName(){
            return name;
        }

        // Tilføjer en lampe til rummet
        public void addLamp(Lamp lamp) {
            lamps.add(lamp);
        }

        // Tilføjer et vindue til rummet
        public void addWindow(Window window) {
            windows.add(window);
        }

        // Returnerer antallet af lamper i rummet
        public int getLampCount() {
            return lamps.size();
        }

        // Jeg starter total på 0 og lægger hver lampes watt til
        // fordi jeg skal summere alle lamper – jeg kan ikke gøre det på én linje
        public int getTotalWatt() {
            int total = 0;
            for (Lamp lamp : lamps){
                total += lamp.getWatt();
            }
            return total;
        }

        // Beregner og returnerer det samlede vinduesareal i rummet (cm²)
        public int getTotalWindowArea() {
            int total = 0;
            for(Window window : windows){
                total += window.getAreaCm2();
            }
            return 0;
        }

        //Printer rummets navn, lamper og vinduer til konsollen
        public void printRoom() {
            //lamps.size() tæller automatisk hvor mange lamper der er i listen. Resultatet bliver fx Mødelokale (3 lamper, 2 vinduer).
            System.out.println(name + " (" + lamps.size() + " lamper, " + windows.size() + " vinduer)");

            // Byg lampeliste som tekst
            String lampOutput = "  Lamper: ";

            //lamps.get(i) henter lampen på plads i og kalder automatisk dens toString() som giver fx 60W. Kommaet tilføjes kun hvis vi ikke er på det sidste element.
            for (int i = 0; i < lamps.size(); i++) {
                // Tilføj lampens watt til teksten, fx "60W"
                lampOutput += lamps.get(i);
                // Hvis vi ikke er på det sidste element, tilføj komma og mellemrum
                // Det sikrer at output bliver "60W, 60W, 100W" og ikke "60W, 60W, 100W,"
                if (i < lamps.size() - 1) lampOutput += ", ";
            }
            // Kalder getTotalWatt() som allerede er beregnet og hæfter det på slutningen.
            lampOutput += " (total: " + getTotalWatt() + "W)";
            System.out.println(lampOutput);

            // Samme fremgangsmåde til vinduer
            String windowOutput = "  Vinduer: ";
            for (int i = 0; i < windows.size(); i++) {
                windowOutput += windows.get(i);
                if (i < windows.size() - 1) windowOutput += ", ";
            }
            System.out.println(windowOutput);
        }
    }
