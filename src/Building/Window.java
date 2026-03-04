package Building;

    public class Window {
        private int widthCm;
        private int heightCm;

        public Window(int widthCm, int heightCm){
            this.widthCm = widthCm;
            this.heightCm = heightCm;
        }

        // Beregner og returnerer vinduets areal i cm²
        public int getAreaCm2(){
            return widthCm * heightCm;
        }

        // Returnerer en tekstrepræsentation, f.eks. "120x90cm"
        @Override
        public String toString() {
            return widthCm + "x" + heightCm + "cm";
        }

    }
