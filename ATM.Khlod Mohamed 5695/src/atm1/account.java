package atm1;

public class account {

    private static String name, pass;
    private static double balance;

    public void account(String name, String pass, double balance) {
        this.name = name;
        this.pass = pass;
        this.balance = balance;

    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        account.balance = balance;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        account.name = name;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        account.pass = pass;
    }

}
