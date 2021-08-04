import br.com.ariki.testesys.armstrongnumber.ArmstrongNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArmstrongNumberTest {

    @Test
    void isArmstrongNumber_sendArmstrongNumber_returnTrue() {

        boolean result = ArmstrongNumber.isArmstrongNumber("153");
        assertTrue(result);

    }

    @Test
    void isArmstrongNumber_sendNotArmstrongNumber_returnFalse() {

        boolean result = ArmstrongNumber.isArmstrongNumber("245");
        assertFalse(result);

    }


}
