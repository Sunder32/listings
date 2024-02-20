package list3;


class Vehicle11 {


    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle11() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;


    }
    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    }
    int getMaxSpeed() {

        return this.maxspeed;
    }
}


class Auto extends Vehicle11 {
    boolean sunroof;


}

class ExtendsVehicleDemo {
    public static  void main(String[] args) {


        Auto bmw = new Auto();
        bmw.sunroof = true;


        System.out.println(" Путь , пройденный за 1.5 час: " + bmw.distance(1.5) + " км. ");
        System.out.println(" Макс.Скорость: " + bmw.getMaxSpeed() + " км/ч. ");
        System.out.println(" Наличие люка: " + bmw.sunroof);
    }
}