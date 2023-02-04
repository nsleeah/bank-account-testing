import java.time.LocalDate;

public class BankAccount {

    //Properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private String accountType;
    private double overdraft;

    //Constructor
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, String accountType, double overdraft) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountType = accountType;
        this.overdraft = overdraft;
    }


    //Methods

    //Deposit
    public void deposit (double amount){
        this.balance +=  amount;
    }

    //Withdrawal
    public void withdrawal(double amount){
        this.balance -= amount;
    }

    //Interest
    //To do..


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

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getOverdraft() {
        return this.overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public String generateMessage() {
        return "Hello " + this.firstName + " " + this.lastName + "! Date of Birth : " + this.dateOfBirth + ". Account Number: " + this.accountNumber + ".";
    }
}



