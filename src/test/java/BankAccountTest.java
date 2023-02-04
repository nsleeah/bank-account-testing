import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
         bankAccount = new BankAccount(
                "Helena",
                "Smith",
                LocalDate.of(2000,04,02),
                5234,
                "Current",
                -50.00);

    };

    @Test
    public void canDeposit(){
        bankAccount.deposit(80);
        assertThat(bankAccount.getBalance()).isEqualTo(80);
    }

    @Test
    public void canWithdraw(){
        bankAccount.deposit(100);
        bankAccount.withdrawal(50);
        assertThat(bankAccount.getBalance()).isEqualTo(50);
    }

    //Tests Getters and Setters
    @Test
    public void hasFirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("Helena");
    }

    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Stephen");
        assertThat(bankAccount.getFirstName()).isEqualTo("Stephen");
    }

    @Test
    public void hasLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Smith");
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Ribbon");
        assertThat(bankAccount.getLastName()).isEqualTo("Ribbon");
    }

    @Test
    public void hasDateOfBirth(){
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("2000-04-02");
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth(LocalDate.of(1985, 9, 5));
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("1985-09-05");
    }

    @Test
    public void hasAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo(5234);
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(00127);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(00127);
    }

    @Test
    public void hasAccountType(){
        assertThat(bankAccount.getAccountType()).isEqualTo("Current");
    }

    @Test
    public void canSetAccountType(){
        bankAccount.setAccountType("Savings");
        assertThat(bankAccount.getAccountType()).isEqualTo("Savings");
    }

    @Test
    public void hasOverdraft(){
        assertThat(bankAccount.getOverdraft()).isEqualTo(-50.00);
    }

    @Test
    public void canSetOverdraft(){
        bankAccount.setOverdraft(-100);
        assertThat(bankAccount.getOverdraft()).isEqualTo(-100);
    }



}
