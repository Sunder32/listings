package list3;

class basket {
    void pay(double money) {
        System.out.println("оплата наличкой: " + money);
    }

    void pay(String cardNum) {
        System.out.println("оплата kartoi: " + cardNum);
    }

    void pay(String accountNum, String bankCode) {
        System.out.println("оплата переводом: " + accountNum + " в банке " + bankCode);
    }
}




class list3_14 {
    public static void main(String[] args) {
       basket b1 = new basket();
       basket b2 = new basket();
       basket b3 = new basket();
        System.out.print("b1: ");
        b1.pay(1200.0);
        System.out.print("b2: ");
        b2.pay("123456789");
        System.out.print("b3: ");
        b3.pay("987654321", "5500");

    }

}
