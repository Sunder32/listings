package list3;

class Vehicle9 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;


    Vehicle9() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }


    Vehicle9(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
}