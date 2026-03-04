package Building;

import java.util.ArrayList;

    public class Building {
        String name;
        ArrayList<Room>rooms;

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
            return 0;
        }

        // Beregner og returnerer det samlede wattal for hele bygningen
        public int getTotalWatt() {
            return 0;
        }

        // Printer bygningens navn og alle rum med deres lamper og vinduer
        public void printBuilding() {

        }


    }
