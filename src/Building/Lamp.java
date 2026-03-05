package Building;

    public class Lamp {
        private int watt;
        private boolean isOn;

        public Lamp(int watt){
            this.watt = watt;
            this.isOn = false;
        }

        //Tænder lampen
        public void turnOn(){
            isOn = true;
        }

        //Slukker lampen
        public void turnOff(){
            isOn = false;
        }

        // Jeg laver getWatt() fordi watt er private og Room skal bruge det
        // til at beregne det samlede wattal i getTotalWatt()
        public int getWatt() {
            return watt;
        }

        // Jeg laver isOn() så man udefra kan tjekke om lampen er tændt
        // uden at kunne ændre tilstanden direkte
        public boolean isOn(){
            return isOn;
        }

        // Returnerer en tekstrepræsentation, f.eks. "60W"
        @Override
        public String toString() {
            return watt + "W";
        }
    }
