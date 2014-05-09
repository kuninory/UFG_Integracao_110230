package intregacao_logamazon;

import integracao_logamazon.FonteInvalidaException;
import integracao_logamazon.InformacaoInvalidaException;
import integracao_logamazon.Integracao_LogAmazon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class Integracao_LogAmazonTest {
    
    public Integracao_LogAmazonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Intregacao_LogAmazon.
     */
    @Test
    public void testSetFonteNull() throws FonteInvalidaException {
        String fonte = null;
        Integracao_LogAmazon teste;
        try {
            teste= new Integracao_LogAmazon(fonte, "informação");
            fail("Deixou a fonte ser 'null'.");
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testSetFonteMaisDe100() throws FonteInvalidaException {
        String fonte = "12345678901234567890123456789012345678901234567890"+
                "12345678901234567890123456789012345678901234567890a";
        Integracao_LogAmazon teste;
        
        try {
            teste= new Integracao_LogAmazon(fonte, "informação");
            fail("Deixou a fonte ter mais de 100 caracteres.");
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testSetInformacaoNull() throws InformacaoInvalidaException {
        String fonte = "Fonte";
        String informacao = null;
        Integracao_LogAmazon teste;
        try {
            teste= new Integracao_LogAmazon(fonte, informacao);
            fail("Deixou a informação ser 'null'.");
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testSetInformacaoMaisDe2Kb() throws InformacaoInvalidaException {
        String fonte = "Fonte";
        String informacao = "12345678901234567890123456789012345678901234567890"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a"+
                "12345678901234567890123456789012345678901234567890a";
        Integracao_LogAmazon teste;
        
        try {
            teste= new Integracao_LogAmazon(fonte, informacao);
            fail("Deixou a informacao ter mais de 2KB.");
        } catch (Exception e) {
        }
    }
}