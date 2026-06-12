package three.Inheritence;

    public class bike extends vehicle{
        private boolean hascarrier;

        public bike(String brand,int speed,boolean hascarrier){
            super(brand,speed);
            this.hascarrier=hascarrier;
        }

        public boolean isHascarrier() {
            return hascarrier;
        }

        public void setHascarrier(boolean hascarrier) {
            this.hascarrier = hascarrier;
        }
    }
