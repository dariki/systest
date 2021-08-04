import br.com.ariki.testesys.armstrongnumber.TextoXML;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TextoXMLTest {

    @Test
    void extrairTextoXML_NoError() {

        String xml = "<h1>Nayeem loves counseling</h1>\n" +
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>\n" +
                "<Amee>safat codes like a ninja</amee>\n" +
                "<SA premium>Imtiaz has a secret crush</SA premium>\n";

        String result = TextoXML.extrairTextoXML(xml);
        assertTrue(result.length() > 0);
    }

}
