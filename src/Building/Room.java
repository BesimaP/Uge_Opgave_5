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

        // Beregner og returnerer den samlede watt for alle lamper i rummet
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
            System.out.println(name + " (" + lamps.size() + " lamper, " + windows.size() + " vinduer)");

            // Byg lampeliste som tekst
            StringBuilder lamp = new StringBuilder("  Lamper: ");
            for (int i = 0; i < lamps.size(); i++) {
                lamp.append(lamps.get(i));
                if (i < lamps.size() - 1) lamp.append(", ");
            }
            lamp.append(" (total: ").append(getTotalWatt()).append("W)");
            System.out.println(lamp);

            // Byg vinduesliste som tekst
            StringBuilder window = new StringBuilder("  Vinduer: ");
            for (int i = 0; i < windows.size(); i++) {
                window.append(windows.get(i));
                if (i < windows.size() - 1) window.append(", ");
            }
            System.out.println(window);
        }
    }
