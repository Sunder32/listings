package list2;

public class list2_19 {
    public static void main(String[] args) {
        int nmax = 25;
        for (int n = 0; n < nmax; n++) {

            if ((n * n) >= nmax) break;
            System.out.println("n pавно " + n + " , n в квадрате равно " + n * n);
        } // for
        System.out.println("Конец цикла");

    }
}