import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    @Test
    public void depositTest() {
        BankAccount bankAccount = new BankAccount(
                "Leah",
                "Simon",
                LocalDate.of(2000,04,02),
                5234);

    };

    @Test
    public void withdrawalTest() {
        BankAccount bankAccount = new BankAccount(
                "Leah",
                "Simon",
                LocalDate.of(2000,04,02),
                5234);

    };


}
