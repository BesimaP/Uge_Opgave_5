package Building;

    public class Main {
        public static void main(String[] args) {
































            // Opret bygning
            Building bygning = new Building("Kontorbygningen");

            // --- Mødelokale ---
            Room mødelokale = new Room("Mødelokale");
            mødelokale.addLamp(new Lamp(60));
            mødelokale.addLamp(new Lamp(60));
            mødelokale.addLamp(new Lamp(100));
            mødelokale.addWindow(new Window(120, 90));
            mødelokale.addWindow(new Window(120, 90));
            bygning.addRoom(mødelokale);

            // --- Køkken ---
            Room køkken = new Room("Køkken");
            køkken.addLamp(new Lamp(40));
            køkken.addLamp(new Lamp(40));
            køkken.addWindow(new Window(60, 60));
            bygning.addRoom(køkken);

            // --- Kontor ---
            Room kontor = new Room("Kontor");
            kontor.addLamp(new Lamp(75));
            kontor.addLamp(new Lamp(75));
            kontor.addLamp(new Lamp(50));
            kontor.addWindow(new Window(100, 80));
            kontor.addWindow(new Window(100, 80));
            bygning.addRoom(kontor);

            // Print hele bygningen
            bygning.printBuilding();

            // Svar på spørgsmål
            System.out.println();
            System.out.println("Antal lamper i hele bygningen: " + bygning.getTotalLampCount());
            System.out.println("Samlet wattal for bygningen:   " + bygning.getTotalWatt() + "W");
        }
    }
