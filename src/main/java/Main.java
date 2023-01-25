import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount firstaccount  = new BankAccount("Leah", "Simon", LocalDate.of(2000,04,02),5234);
        firstaccount.deposit(1000);
        firstaccount.withdrawal(60);
        firstaccount.payInterest(0.02);
                String message = firstaccount.generateMessage();
                System.out.println(message);
                System.out.println("You have a balance of " + firstaccount.getBalance());

        BankAccount secondaccount  = new BankAccount("Sam", "Help", LocalDate.of(1998,05,01),5664);
        secondaccount.deposit(1000);
        secondaccount.withdrawal(60);
        secondaccount.payInterest(0.02);
        String message2 = secondaccount.generateMessage();
        System.out.println(message2);
        System.out.println("You have a balance of " + secondaccount.getBalance());

    }


}
