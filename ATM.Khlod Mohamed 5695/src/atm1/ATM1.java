package atm1;

public class ATM1 {

    
    public static void main(String[] args) {
        account acc = new account();
        acc.account("ali", "1234", 100);
        new open().setVisible(true);
    }

}
