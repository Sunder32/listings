package list3;
class paraby {         int x, y;
    paraby(int x, int y) {
        this.x = x;             this.y = y;
    }
    void callby(paraby o) {             o.x = o.x + this.x;
        o.y = o.y + this.y;         }
}
public class list3_13 {             public static void main(String[] args) {
    paraby p = new paraby(2, 3);                 paraby q = new paraby(3, 2);
    System.out.println("q.x = " + q.x);                 System.out.println("q.y = " + q.y);
    p.callby(q);                 System.out.println("q.x = " + q.x);
    System.out.println("q.y = " + q.y);
}         }
