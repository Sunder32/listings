package list3;

public class list3_7 {
    static class number {
        int x;
        number(int num ) {


            x = num;
        }
    }
    public static void main(String[] args) {
        number t1 = new number(9);
        number t2 = new number(27);
        System.out.println(t1.x + " *** " + t2.x);
    }
}
