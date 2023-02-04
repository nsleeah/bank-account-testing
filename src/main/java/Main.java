import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount  = new BankAccount("Leah", "Simon", LocalDate.of(2000,04,02),5234, "Current",-50.00);
        bankAccount.deposit(1000);
        bankAccount.withdrawal(60);
                String message = bankAccount.generateMessage();
                System.out.println(message);
                System.out.println("You have a balance of " + bankAccount.getBalance());

        BankAccount bankAccount1  = new BankAccount("Sam", "Help", LocalDate.of(1998,05,01),5664, "Savings", -70.00);
        bankAccount1.deposit(1000);
        bankAccount1.withdrawal(60);
        String message2 = bankAccount1.generateMessage();
        System.out.println(message2);
        System.out.println("You have a balance of " + bankAccount1.getBalance());

    }


}
