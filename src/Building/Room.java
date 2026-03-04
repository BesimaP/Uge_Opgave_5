package Building;

import java.util.ArrayList;

    public class Room {
        String name;
        ArrayList<Lamp> lamps;
        ArrayList<Window> windows;

        // Konstruktør – opretter et rum med et navn og tomme lister
        public Room(String name){
            this.name = name;
            this.lamps = new ArrayList<>();
            this.windows = new ArrayList<>();
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

        // Beregner og returnerer den samlede watt for alle lamper i rummet
        public int getTotalWatt() {
            return 0;
        }

        // Beregner og returnerer det samlede vinduesareal i rummet (cm²)
        public int getTotalWindowArea() {
            return 0;
        }

        //Printer rummets navn, lamper og vinduer til konsollen
        public void printRoom() {

        }
    }
