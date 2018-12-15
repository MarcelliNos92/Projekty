package pl.sda.car.model;

    public class User {

        private String model;
        private double price;
        private String engine;
        private int speed;


// konstruktor

        public User(String model, double price, String engine, int speed) {

            this.model = model;
            this.price = price;
            this.engine = engine;
            this.speed = speed;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

    }