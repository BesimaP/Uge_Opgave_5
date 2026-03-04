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

        // Returnerer lampens watt
        public int getWatt() {
            return watt;
        }

        //Returnerer om lampen er tændt
        public boolean isOn(){
            return isOn;
        }

        // Returnerer en tekstrepræsentation, f.eks. "60W"
        @Override
        public String toString() {
            return watt + "W";
        }
    }
