
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import banco.*;

/**
 * Contiene tests unitarios para testear la aplicación.
 * @author Isaac Cebrián Barragán
 * @version 1.0 2017-11-28
 */
public class JUnitTest {
    
    CuentaCorriente cc;
    
    /**
     * Constructor sin parámetros.
     */
    public JUnitTest() {
        cc = null;
    }
    
    /**
     * Esta función se ejecutará antes de cada test, creando la misma cuenta corriente para poder testearla.
     */
    @Before
    public void setUp() {
        cc = new CuentaCorriente(
                "Isaac Cebrián Barragán",
                "46482942b",
                new Banco("BNC Internacional Banc"),
                3);
        cc.ingreso(1000);
    }
    
    // Testeo del método retirar() del objeto CuentaCorriente.
    @Test
    public void retirar1() {
        boolean expected = false;
        boolean result = cc.retirar(0);
        assertEquals(expected, result);
    }
    
    @Test
    public void retirar2() {
        boolean expected = true;
        boolean result = cc.retirar(1000);
        assertEquals(expected, result);
    }
    
    @Test
    public void retirar3() {
        boolean expected = true;
        boolean result = cc.retirar(1001);
        assertEquals(expected, result);
    }
    
    @Test
    public void retirar4() {
        boolean expected = true;
        boolean result = cc.retirar(1050);
        assertEquals(expected, result);
    }
    
    @Test
    public void retirar5() {
        boolean expected = false;
        boolean result = cc.retirar(1051);
        assertEquals(expected, result);
    }
    
    @Test
    public void retirar6() {
        boolean expected = false;
        boolean result = cc.retirar(-1051);
        assertEquals(expected, result);
    }
    
    
    // Testeo del método retirar() del objeto CuentaCorriente.
    @Test
    public void interesTAE1() {
        Double expected = 30d;
        Double result = cc.interesTAE();
        assertEquals(expected, result);
    }
}
