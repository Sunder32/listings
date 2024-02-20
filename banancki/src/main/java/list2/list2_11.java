package list2;

public class list2_11 {
    public static void main(String[] args) {
        int x;
        x = 1;
        System.out.println("До вложенного блока: x равно " + x);
        int y = 3;
        System.out.println("Внутрений блок: х равно " + x + ", у равно " + y);
        x = y * 3;
        System.out.println("После вложенного блока: x равно " + x );

    }
}
