package Building;

    public class Main {
        public static void main(String[] args) {
            //Opret bygning
            Building building1 = new Building(" EK ErhvervsAkademi ");

            //Køkken
            Room køkken = new Room("Køkken");
            køkken.addLamp(new Lamp(40));
            køkken.addLamp(new Lamp(40));
            køkken.addLamp(new Lamp(40));
            køkken.addLamp(new Lamp(40));
            køkken.addWindow(new Window(100, 60));
            building1.addRoom(køkken);

            //Mødelokale
            Room mødelokale = new Room("Mødelokale");
            mødelokale.addLamp(new Lamp(60));
            mødelokale.addLamp(new Lamp(60));
            mødelokale.addLamp(new Lamp(100));
            mødelokale.addWindow(new Window(120, 90));
            mødelokale.addWindow(new Window(120, 90));
            building1.addRoom(mødelokale);


            // --- Kontor ---
            Room kontor = new Room("Kontor");
            kontor.addLamp(new Lamp(75));
            kontor.addLamp(new Lamp(75));
            kontor.addLamp(new Lamp(50));
            kontor.addWindow(new Window(100, 80));
            kontor.addWindow(new Window(100, 80));
            building1.addRoom(kontor);

            // Print hele bygningen
            building1.printBuilding();

            // Svar på spørgsmål
            System.out.println();
            System.out.println("Antal lamper i hele bygningen: " + building1.getTotalLampCount());
            System.out.println("Samlet wattal for bygningen:   " + building1.getTotalWatt() + "W");
        }
    }
