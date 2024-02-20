package list3;
public class list3_11 {    static class Vehicle {
    int pas;        private int wheels;
    private int maxspeed;        int burnup;
    Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
        this.pas = pas;            this.setWheels(wheels);
        this.maxspeed = maxspeed;            this.burnup = burnup;
    }
    double distance(double interval) {            double val = this.maxspeed * interval;
        return val;        }
    int getMaxSpeed() {        return this.maxspeed;
    }        int getWheels() {
        return this.wheels;        }
    void setWheels(int wheels) {            if ((wheels < 1) || (wheels > 24)) {
        System.out.println("неверно указано число колесю");                return;
    }            this.wheels = wheels;
    }    }
    public static void main(String[] args) {        Vehicle ferrari = new Vehicle(2, -2, 360, 12);
        System.out.println("max speed: " + ferrari.getMaxSpeed() + " км/ч");        System.out.println("Число колес: " + ferrari.getWheels());
        ferrari.setWheels(4);        System.out.println("число колес (повторно): " + ferrari.getWheels());
    }    }
