import java.time.LocalDate;

public class BankAccount {

    //Properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private double interest;

    //Constructors
    public BankAccount(String firstName,
            String lastName,
            LocalDate dateOfBirth,
            int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }



    //Methods

    //Deposit
    public void deposit (double amount){
        balance +=  amount;
    }

    //Withdrawal
    public void withdrawal(double amount){
        balance -= amount;
    }

    //Interest
    public void payInterest(double interestRates) {
        interest = balance + interestRates;
        balance = balance + interest; //Adds interest back original.
    }


    //Getters and Setters.
    //firstName
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //lastName
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //dateOfBirth
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    //accountNumber
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //balance
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String generateMessage() {
        return "Hello " + this.firstName + " " + this.lastName + "! Date of Birth : " + this.dateOfBirth + ". Account Number: " + this.accountNumber + ".";
    }
}



