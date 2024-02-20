package list3;
public class list3_12 {    static class Paraby {
    void call(int x, int y) {            x = x + y;
        y = y + 1;            System.out.println("x = " + x);
        System.out.println("y = " + y);        }
}public static void main(String[] args) {
    int a = 2;        int b = 3;
    Paraby test = new Paraby();        test.call(a, b);
    System.out.println("a = " + a);        System.out.println("b = " + b);
}}
