import br.com.ariki.testesys.armstrongnumber.Anagrama;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramaTest {

    @Test
    void criarAnagramas_sendNumber_moreOrEqualThan5() {

        List<String> result = Anagrama.criarAnagramas("15349");
        assertTrue(result.size() >= 5);

    }

    @Test
    void isArmstrongNumber_sendNumber_returnLessThen5() {

        List<String> result = Anagrama.criarAnagramas("12");
        assertTrue(result.size() < 5);

    }

    @Test
    void isArmstrongNumber_sendNull_returnEmpty() {

        List<String> result = Anagrama.criarAnagramas(null);
        assertTrue(result.size() == 0);

    }

    @Test
    void isArmstrongNumber_sendMoreThan50Chars_returnEmpty() {

        List<String> result = Anagrama.criarAnagramas("123456789012345678901234567890123456789012345678901234567890");
        assertTrue(result.size() == 0);

    }


}
