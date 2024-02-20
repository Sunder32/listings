package list3;

class Vehicle13 {


    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;


    Vehicle13(int f, int g, int h, int j) {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;


    }

    public Vehicle13() {

    }

    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    }
    int getMaxSpeed() {

        return this.maxspeed;
    }
    int getWheels() {

        return this.wheels;
    }


    public String toString () {
        return "Vehicle12(passengers=" + passengers + ";" + "wheels=" + wheels + ";" + "maxspeed=" + maxspeed + ";" + "burnup=" + burnup + ")";
    }

}
class Auto2 extends Vehicle13 {
    public String toString(){
        return "Auto1(passengers=" + passengers + ";" + "wheels=" + super.getWheels() + ";" + "maxspeed=" + super.getMaxSpeed() + ";" + "burnup=" + burnup + ";" + sunroof + ")";
    }
    boolean sunroof;

    Auto2(boolean sunroof) {
        this (4, 4, 200, 12, sunroof);
    }


    Auto2(int f, int g, int h, int j, boolean sunroof) {
        super(2, 2, 100, 9);
        this.sunroof = sunroof;
    }
}
class PolyVehicleDmo {

    public static void main(String[] args) {

        Auto2 a = new Auto2(true);
        Vehicle13 v = new Vehicle13();


        Vehicle13[] pvd = { a , v };

        for ( int i = 0; i < pvd.length; i++) {

            System.out.println(pvd[i].toString());
        }

    }
}