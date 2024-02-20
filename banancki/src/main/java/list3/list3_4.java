package list3;

public class list3_4 {
    static class Vehicle {
        int pas;
        int wheels;
        int maxspeed;
        int burnup;
        void distance(double interval) {
            double value = maxspeed * interval;
            System.out.print("пройдет путь, равный " + value + "км.");
        }
    }
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.pas = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;
        Vehicle bus = new Vehicle();
        bus.pas = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;
        double time = 0.5;
        System.out.print("авто с " + car.pas + " пассажирами ");
        car.distance(time);
        System.out.print("автобус с " + bus.pas + " пассажирами ");
        bus.distance(time);
    }

}
