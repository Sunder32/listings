package list3;
public class list3_9 {    static class Vehicle {
    int pas;
    int wheels;
    int maxspeed;        int burnup;
    Vehicle(int pas, int wheels, int maxspeed, int burnup) {
        this.pas = pas;            this.wheels = wheels;
        this.maxspeed = maxspeed;            this.burnup = burnup;
    }        double distance(double interval) {
        double value = this.maxspeed * interval;            return value;
    }    }
}
