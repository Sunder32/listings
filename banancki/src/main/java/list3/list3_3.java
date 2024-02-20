package list3;

public class list3_3 {
    static class SimpleVehicle {
        int pas;
    }
    public static void main(String[] args) {
        SimpleVehicle car1, car2;
        car1 = new SimpleVehicle();
        car1.pas = 25;
        car2 = car1;
        System.out.print("кол-во пассажиров car2 равно " + car2.pas);
        car2.pas = 50;
        System.out.print("кол-во пассажиров car1 равно " + car1.pas);
    }
}
