package Building;

import java.util.ArrayList;

    public class Building {
        private String name;
        private ArrayList<Room>rooms;

        public Building (String name){
            this.name = name;
            this.rooms = new ArrayList<>();
        }

        // Tilføjer et rum til bygningen
        public void addRoom(Room room) {
            rooms.add(room);
        }

        // Beregner og returnerer det samlede antal lamper i hele bygningen
        public int getTotalLampCount() {
            int total = 0;
            for(Room room : rooms) {
                total += room.getLampCount();
            }
            return total;
        }

        // Beregner og returnerer det samlede wattal for hele bygningen
        public int getTotalWatt() {
            int total = 0;
            for(Room room : rooms){
                total += room.getTotalWatt();
            }
            return total;
        }

        // Printer bygningens navn og alle rum med deres lamper og vinduer
        public void printBuilding() {
            System.out.println("~~~~~~~~~" + name + "~~~~~~~~~");
            for (Room room : rooms) {
                System.out.println();
                room.printRoom();
                }

            // Jeg printer totalen til sidst så man får et samlet overblik over hele bygningen
            System.out.println();
            System.out.println("Total: " + getTotalLampCount() + " lamper, " + getTotalWatt() + "W");

        }

    }
